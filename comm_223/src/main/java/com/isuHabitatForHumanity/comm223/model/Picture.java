package com.isuHabitatForHumanity.comm223.model;

public class Picture extends Upload
{
	private String pictureID;
	private float pictureSize;
	
	public String getPictureID()
	{
		return pictureID;
	}
	
	public void setPictureID(String newPictureID)
	{
		pictureID = newPictureID;
	}
	
	public float getPictureSize()
	{
		return pictureSize;
	}
	
	public void setPictureSize(float newPictureSize)
	{
		pictureSize = newPictureSize;
	}
	
	//random ID?
	public Picture(String thisUploadID, String thisPictureID, float thisPictureSize)
	{
		super(thisUploadID);
		this.setPictureID(thisPictureID);
		this.setPictureSize(thisPictureSize);
	}
}
