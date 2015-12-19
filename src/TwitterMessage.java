import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TwitterMessage {

	private String created_at;
	private long id;
	private long id_str;
	private String text;
	private String source;
	// private boolean truncated;
	// private long in_reply_to_status_id;
	// private String in_reply_to_user_id_str;
	// private String in_reply_to_screen_name;
	private User user;
	@SerializedName("geo")
	private Position geo;
	@SerializedName("coordinates")
	private Position coordinates;
	private Place place;

	// private String contributors;
	// private int retweet_count;
	// private int favorite_count;
	// private Entity entities;
	// private boolean favorited;
	// private boolean retweeted;
	// private String filter_level;
	// private String lang;
	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_str() {
		return id_str;
	}

	public void setId_str(long id_str) {
		this.id_str = id_str;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	// public boolean isTruncated() {
	// return truncated;
	// }
	// public void setTruncated(boolean truncated) {
	// this.truncated = truncated;
	// }
	// public long getIn_reply_to_status_id() {
	// return in_reply_to_status_id;
	// }
	// public void setIn_reply_to_status_id(long in_reply_to_status_id) {
	// this.in_reply_to_status_id = in_reply_to_status_id;
	// }
	// public String getIn_reply_to_user_id_str() {
	// return in_reply_to_user_id_str;
	// }
	// public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
	// this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	// }
	// public String getIn_reply_to_screen_name() {
	// return in_reply_to_screen_name;
	// }
	// public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
	// this.in_reply_to_screen_name = in_reply_to_screen_name;
	// }
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Position getGeo() {
		return geo;
	}

	public void setGeo(Position geo) {
		this.geo = geo;
	}

	public Position getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Position coordinates) {
		this.coordinates = coordinates;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	// public String getContributors() {
	// return contributors;
	// }
	//
	// public void setContributors(String contributors) {
	// this.contributors = contributors;
	// }
	//
	// public int getRetweet_count() {
	// return retweet_count;
	// }
	//
	// public void setRetweet_count(int retweet_count) {
	// this.retweet_count = retweet_count;
	// }
	//
	// public int getFavorite_count() {
	// return favorite_count;
	// }
	//
	// public void setFavorite_count(int favorite_count) {
	// this.favorite_count = favorite_count;
	// }

	// public Entity getEntities() {
	// return entities;
	// }
	// public void setEntities(Entity entities) {
	// this.entities = entities;
	// }
	// public boolean isFavorited() {
	// return favorited;
	// }
	//
	// public void setFavorited(boolean favorited) {
	// this.favorited = favorited;
	// }
	//
	// public boolean isRetweeted() {
	// return retweeted;
	// }
	//
	// public void setRetweeted(boolean retweeted) {
	// this.retweeted = retweeted;
	// }
	//
	// public String getFilter_level() {
	// return filter_level;
	// }
	//
	// public void setFilter_level(String filter_level) {
	// this.filter_level = filter_level;
	// }
	//
	// public String getLang() {
	// return lang;
	// }
	//
	// public void setLang(String lang) {
	// this.lang = lang;
	// }

}

class User {
	private long id;
	private long id_str;
	private String name;
	// private String screen_name;
	private String location;

	// private String url;
	// private String description;
	// @SerializedName("protected")
	// private boolean u_protected;
	// private int followers_count;
	// private int friends_count;
	// private int listed_count;
	// private String created_at;
	// private int favourites_count;
	// private String utc_offset;
	// private String time_zone;
	// private boolean geo_enabled;
	// private boolean verified;
	// private int statuses_count;
	// private String lang;

	// private boolean contributors_enabled;
	// private boolean is_translator;
	// private boolean is_translation_enabled;
	// private String profile_background_color;
	// private String profile_background_image_url;
	// private String profile_background_image_url_https;
	// private String profile_background_tile;
	// private String profile_image_url;
	// private String profile_image_url_https;
	// private String profile_link_color;
	// private String profile_sidebar_border_color;
	// private String profile_sidebar_fill_color;
	// private String profile_text_color;
	// private String profile_use_background_image;
	// private boolean default_profile;
	// private boolean default_profile_image;
	// private String following;
	// private String follow_request_sent;
	// private String notifications;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_str() {
		return id_str;
	}

	public void setId_str(long id_str) {
		this.id_str = id_str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public String getScreen_name() {
	// return screen_name;
	// }
	//
	// public void setScreen_name(String screen_name) {
	// this.screen_name = screen_name;
	// }

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// public String getUrl() {
	// return url;
	// }
	//
	// public void setUrl(String url) {
	// this.url = url;
	// }
	//
	// public String getDescription() {
	// return description;
	// }
	//
	// public void setDescription(String description) {
	// this.description = description;
	// }
	//
	// public boolean isU_protected() {
	// return u_protected;
	// }
	//
	// public void setU_protected(boolean u_protected) {
	// this.u_protected = u_protected;
	// }
	//
	// public int getFollowers_count() {
	// return followers_count;
	// }
	//
	// public void setFollowers_count(int followers_count) {
	// this.followers_count = followers_count;
	// }
	//
	// public int getFriends_count() {
	// return friends_count;
	// }
	//
	// public void setFriends_count(int friends_count) {
	// this.friends_count = friends_count;
	// }
	//
	// public int getListed_count() {
	// return listed_count;
	// }
	//
	// public void setListed_count(int listed_count) {
	// this.listed_count = listed_count;
	// }
	//
	// public String getCreated_at() {
	// return created_at;
	// }
	//
	// public void setCreated_at(String created_at) {
	// this.created_at = created_at;
	// }
	//
	// public int getFavourites_count() {
	// return favourites_count;
	// }
	//
	// public void setFavourites_count(int favourites_count) {
	// this.favourites_count = favourites_count;
	// }
	//
	// public String getUtc_offset() {
	// return utc_offset;
	// }
	//
	// public void setUtc_offset(String utc_offset) {
	// this.utc_offset = utc_offset;
	// }
	//
	// public String getTime_zone() {
	// return time_zone;
	// }
	//
	// public void setTime_zone(String time_zone) {
	// this.time_zone = time_zone;
	// }
	//
	// public boolean isGeo_enabled() {
	// return geo_enabled;
	// }
	//
	// public void setGeo_enabled(boolean geo_enabled) {
	// this.geo_enabled = geo_enabled;
	// }
	//
	// public boolean isVerified() {
	// return verified;
	// }
	//
	// public void setVerified(boolean verified) {
	// this.verified = verified;
	// }
	//
	// public int getStatuses_count() {
	// return statuses_count;
	// }
	//
	// public void setStatuses_count(int statuses_count) {
	// this.statuses_count = statuses_count;
	// }
	//
	// public String getLang() {
	// return lang;
	// }
	//
	// public void setLang(String lang) {
	// this.lang = lang;
	// }

	// public boolean isContributors_enabled() {
	// return contributors_enabled;
	// }
	//
	// public void setContributors_enabled(boolean contributors_enabled) {
	// this.contributors_enabled = contributors_enabled;
	// }
	//
	// public boolean isIs_translator() {
	// return is_translator;
	// }
	//
	// public void setIs_translator(boolean is_translator) {
	// this.is_translator = is_translator;
	// }
	//
	// public boolean isIs_translation_enabled() {
	// return is_translation_enabled;
	// }
	//
	// public void setIs_translation_enabled(boolean is_translation_enabled) {
	// this.is_translation_enabled = is_translation_enabled;
	// }
	//
	// public String getProfile_background_color() {
	// return profile_background_color;
	// }
	//
	// public void setProfile_background_color(String profile_background_color)
	// {
	// this.profile_background_color = profile_background_color;
	// }
	//
	// public String getProfile_background_image_url() {
	// return profile_background_image_url;
	// }
	//
	// public void setProfile_background_image_url(
	// String profile_background_image_url) {
	// this.profile_background_image_url = profile_background_image_url;
	// }
	//
	// public String getProfile_background_image_url_https() {
	// return profile_background_image_url_https;
	// }
	//
	// public void setProfile_background_image_url_https(
	// String profile_background_image_url_https) {
	// this.profile_background_image_url_https =
	// profile_background_image_url_https;
	// }
	//
	// public String getProfile_background_tile() {
	// return profile_background_tile;
	// }
	//
	// public void setProfile_background_tile(String profile_background_tile) {
	// this.profile_background_tile = profile_background_tile;
	// }
	//
	// public String getProfile_image_url() {
	// return profile_image_url;
	// }
	//
	// public void setProfile_image_url(String profile_image_url) {
	// this.profile_image_url = profile_image_url;
	// }
	//
	// public String getProfile_image_url_https() {
	// return profile_image_url_https;
	// }
	//
	// public void setProfile_image_url_https(String profile_image_url_https) {
	// this.profile_image_url_https = profile_image_url_https;
	// }
	//
	// public String getProfile_link_color() {
	// return profile_link_color;
	// }
	//
	// public void setProfile_link_color(String profile_link_color) {
	// this.profile_link_color = profile_link_color;
	// }
	//
	// public String getProfile_sidebar_border_color() {
	// return profile_sidebar_border_color;
	// }
	//
	// public void setProfile_sidebar_border_color(
	// String profile_sidebar_border_color) {
	// this.profile_sidebar_border_color = profile_sidebar_border_color;
	// }
	//
	// public String getProfile_sidebar_fill_color() {
	// return profile_sidebar_fill_color;
	// }
	//
	// public void setProfile_sidebar_fill_color(String
	// profile_sidebar_fill_color) {
	// this.profile_sidebar_fill_color = profile_sidebar_fill_color;
	// }
	//
	// public String getProfile_text_color() {
	// return profile_text_color;
	// }
	//
	// public void setProfile_text_color(String profile_text_color) {
	// this.profile_text_color = profile_text_color;
	// }
	//
	// public String getProfile_use_background_image() {
	// return profile_use_background_image;
	// }
	//
	// public void setProfile_use_background_image(
	// String profile_use_background_image) {
	// this.profile_use_background_image = profile_use_background_image;
	// }
	//
	// public boolean isDefault_profile() {
	// return default_profile;
	// }
	//
	// public void setDefault_profile(boolean default_profile) {
	// this.default_profile = default_profile;
	// }
	//
	// public boolean isDefault_profile_image() {
	// return default_profile_image;
	// }
	//
	// public void setDefault_profile_image(boolean default_profile_image) {
	// this.default_profile_image = default_profile_image;
	// }
	//
	// public String getFollowing() {
	// return following;
	// }
	//
	// public void setFollowing(String following) {
	// this.following = following;
	// }
	//
	// public String getFollow_request_sent() {
	// return follow_request_sent;
	// }
	//
	// public void setFollow_request_sent(String follow_request_sent) {
	// this.follow_request_sent = follow_request_sent;
	// }
	//
	// public String getNotifications() {
	// return notifications;
	// }
	//
	// public void setNotifications(String notifications) {
	// this.notifications = notifications;
	// }

}

class Entity {
	private ArrayList<String> hashtags;
	private ArrayList<String> symbols;
	private ArrayList<String> urls;
	private ArrayList<String> user_mentions;

	public ArrayList<String> getHashtags() {
		return hashtags;
	}

	public void setHashtags(ArrayList<String> hashtags) {
		this.hashtags = hashtags;
	}

	public ArrayList<String> getSymbols() {
		return symbols;
	}

	public void setSymbols(ArrayList<String> symbols) {
		this.symbols = symbols;
	}

	public ArrayList<String> getUrls() {
		return urls;
	}

	public void setUrls(ArrayList<String> urls) {
		this.urls = urls;
	}

	public ArrayList<String> getUser_mentions() {
		return user_mentions;
	}

	public void setUser_mentions(ArrayList<String> user_mentions) {
		this.user_mentions = user_mentions;
	}

}

class HashTag {
	private String text;
	private ArrayList<Integer> indices;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<Integer> getIndices() {
		return indices;
	}

	public void setIndices(ArrayList<Integer> indices) {
		this.indices = indices;
	}

}

class Symbol {
	private String text;
	private ArrayList<Integer> indices;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<Integer> getIndices() {
		return indices;
	}

	public void setIndices(ArrayList<Integer> indices) {
		this.indices = indices;
	}

}

class Url {
	private String url;
	private String expanded_url;
	private String display_url;
}

class Position {
	private String type;
	private List<Float> coordinate;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Float> getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(List<Float> coordinate) {
		this.coordinate = coordinate;
	}

	

}


class Place {
	// private String attributes;
	private String country;
	private String country_code;
	private String full_name;
	private String id;
	private String name;
	private String place_type;
	private String url;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace_type() {
		return place_type;
	}

	public void setPlace_type(String place_type) {
		this.place_type = place_type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}