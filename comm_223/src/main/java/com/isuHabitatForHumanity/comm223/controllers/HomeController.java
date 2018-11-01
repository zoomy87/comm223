package com.isuHabitatForHumanity.comm223.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isuHabitatForHumanity.comm223.dao.DAO;
import com.isuHabitatForHumanity.comm223.dao.PostDAO;
import com.isuHabitatForHumanity.comm223.model.Post;

/**
 * Handles requests for the application home page.
 */
@Controller
@PropertySource(value= "classpath:application.properties")
public class HomeController {
	
	@Value("${db.name}")
	public String db;
	
	@Autowired
	PostDAO d;
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
//		log.info("Welcome home! The client locale is {}.", locale);
		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		log.info("about");
		return "about";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String products() {
		log.info("products");
//		log.info(db);
		return "products";
	}
	
	@RequestMapping(value = "/store", method = RequestMethod.GET)
	public String store() {
		log.info("store");
//		Post p= (Post) d.getItem(6).get(0);
//		log.info(p.getParagraph());
		return "store";
	}
	
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String gallery() {
		log.info("gallery");
		return "gallery";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post() {
		log.info("post");
		return "post";
	}
	
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public String events() {
		log.info("events");
		log.info(db);
		return "eventTemplate";
	}
}
