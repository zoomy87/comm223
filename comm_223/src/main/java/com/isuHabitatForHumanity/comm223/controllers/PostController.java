package com.isuHabitatForHumanity.comm223.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isuHabitatForHumanity.comm223.dao.DAO;
import com.isuHabitatForHumanity.comm223.dao.PostDAO;


@Controller
public class PostController {
	
	private static final Logger log = LoggerFactory.getLogger(PostController.class);
	
	@Autowired
	private PostDAO postDAO;
	
	@RequestMapping(value = "/newpost", method = RequestMethod.POST)
	public int createNewPost(String paragraph, String title) {
		int retVal= 0;
		
		postDAO.setItem(paragraph, title);
		
		
		return retVal;
	}
	
	
}
