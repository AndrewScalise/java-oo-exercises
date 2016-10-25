package Blogz;

import java.util.Date;

public class Post {
	
	private String body;
	private String title;
	private String author;
	private final Date created;
	private Date modified;
	
	//constructor
	public Post(String body, String title, String author, Date created){
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = created;
	}
	
	
}
