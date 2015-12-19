import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

public class CharReader {

	private static String sourcePath = "D:\\RMIT\\Summer project\\twitterEnglish_Feb\\";
	private static String destinationPath = "D:\\RMIT\\Summer project\\output\\";

	public void filterDataFile(String country, String sourceFileLink,
			String destFileLink) {
		File destFile = new File(destFileLink);
		List<TwitterMessage> mList = new LinkedList<TwitterMessage>();
		BufferedReader reader = null;
		BufferedWriter writter = null;
		String line = null;
		if (destFile.exists() == false) {
			try {
				destFile.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		try {
			reader = new BufferedReader(new FileReader(sourceFileLink));
			writter = new BufferedWriter(new FileWriter(destFile));
			Gson gson = new Gson();

			while ((line = reader.readLine()) != null) {

				TwitterMessage tw = gson.fromJson(line, TwitterMessage.class);

				if (tw.getUser().getLocation().contains(country)
						|| (tw.getPlace() != null && tw.getPlace().getCountry()
								.contains(country))
						|| tw.getText().contains(country)) {
					mList.add(tw);
					// if (tw.getPlace() != null)
					// System.out.println(tw.getPlace().getFull_name());
					// if (tw.getCoordinates() != null)
					// System.out.println(tw.getGeo().getCoordinate());
					writter.write(line);
					writter.newLine();
				}

			}
			System.out.println(mList.size());
		} catch (Exception e) {
			System.out.println(line);
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
