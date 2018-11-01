package com.isuHabitatForHumanity.comm223.dao;

import java.util.ArrayList;

public interface DAO {

	public void setItem(String paragraph, String title);
	public ArrayList getItem(int id);
	public ArrayList getAllItems();
}
