package org.rss.feed.photoSearch;

/**
 * @author shashank reddy
 *
 */
/**
 * @author shashank reddy
 *
 */
public class FeedData {
	
	private String items;
	private String title;
	private String link;
	private String media;
	private String photo;
	private String tag;
	private String discription;
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "FeedData [items=" + items + ", title=" + title + ", link="
				+ link + ", media=" + media + ", photo=" + photo + ", tag="
				+ tag + ", discription=" + discription + "]";
	}
	public FeedData(String items, String title, String link, String media,
			String photo, String tag, String discription) {
		super();
		this.items = items;
		this.title = title;
		this.link = link;
		this.media = media;
		this.photo = photo;
		this.tag = tag;
		this.discription = discription;
	}
	
	
	

}
