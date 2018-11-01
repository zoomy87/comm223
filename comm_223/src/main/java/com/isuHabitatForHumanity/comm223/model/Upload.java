package com.isuHabitatForHumanity.comm223.model;

import java.util.Calendar;

public class Upload {
	
	
	private String uploadID;
	private Calendar uploadDateTime;
	
	public String getUploadID()
	{
		return uploadID;
	}
	
	public void setUploadID(String newUploadID)
	{
		uploadID = newUploadID;
	}
	
	//Do we want to format this then return it in a string instead? or do another method for that
	public Calendar getUploadDateTime()
	{
		return uploadDateTime;
	}
	
	public void setUploadDateTime(Calendar dateTime)
	{
		uploadDateTime = dateTime;
	}
	
	public Upload() {
		
	}
	
	//All IDs will be set by the database
	public Upload(String ID)
	{
		this.setUploadID(ID);
		this.setUploadDateTime(Calendar.getInstance());
	}

}
