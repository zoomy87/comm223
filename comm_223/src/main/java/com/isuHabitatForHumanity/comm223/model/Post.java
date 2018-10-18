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
	
	//random ID?
	public Post(String thisUploadID, String thisPostID, String thisTitle, String thisParagraph)
	{
		super(thisUploadID);
		this.setPostID(thisPostID);
		this.setTitle(thisTitle);
		this.setParagraph(thisParagraph);
	}
}
