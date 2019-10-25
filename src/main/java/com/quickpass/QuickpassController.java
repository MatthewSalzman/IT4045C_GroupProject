package com.quickpass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 @author Administrator
 Handle the /start endpoint
 @return
*/
@Controller
public class QuickpassController {
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() {
		return "login";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers={"content-type=text/json"})
	public String readJSON() {
		return "login";
	}
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		return "login";
	}
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=silver"})
	public String readSilver() {
		return "login";
	}
	
	
	
	@PostMapping("/start")
	public String create() {
		return "login";
	}
	
	/**
	 @author Administrator
	 @ Handle the /start end point
	 @return
	*/
	@RequestMapping("/index")
	public String index() {
		return "login";
	}
	
	@RequestMapping(value="/passwordtable", method=RequestMethod.GET)
	public String startPasswordTable() {
		return "passwordtable";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String startLogin() {
		return "login";
	}
}

