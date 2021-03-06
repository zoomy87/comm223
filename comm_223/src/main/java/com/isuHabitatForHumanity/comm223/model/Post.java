package com.isuHabitatForHumanity.comm223.model;

public class Post extends Upload 
{
	private String postID;
	private String title;
	private String paragraph;
	
	public String getPostID()
	{
		return postID;
	}
	
	public void setPostID(String newPostID)
	{
		postID = newPostID;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	public String getParagraph()
	{
		return paragraph;
	}
	
	public void setParagraph(String newParagraph)
	{
		paragraph = newParagraph;
	}
	
	public Post() {
		this.paragraph="";
		this.title="";
	}
	
	//this Id will be autogenerated by the database do not put one in
	public Post(String thisUploadID, String thisPostID, String thisTitle, String thisParagraph)
	{
		super(thisUploadID);
		this.setPostID(thisPostID);
		this.setTitle(thisTitle);
		this.setParagraph(thisParagraph);
	}
}