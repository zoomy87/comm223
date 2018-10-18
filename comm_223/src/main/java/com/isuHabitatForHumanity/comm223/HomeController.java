package com.isuHabitatForHumanity.comm223;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
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
		return "products";
	}
	
	@RequestMapping(value = "/store", method = RequestMethod.GET)
	public String store() {
		log.info("store");
		return "store";
	}
	
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public String events() {
		log.info("store");
		return "eventTemplate";
	}
}
