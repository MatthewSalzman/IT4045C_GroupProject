package com.quickpass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quickpass.dto.PasswordDTO;
import com.quickpass.service.IPasswordService;


/**
 @author Administrator
 Handle the /start endpoint
 @return
*/
@Controller
public class QuickpassController {
	
	@Autowired
	private IPasswordService passwordServiceStub;
	
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	@ResponseBody
	public PasswordDTO read(Model model) {
		PasswordDTO passwordDTO = passwordServiceStub.fetchById(1);
		model.addAttribute("passwordDTO", passwordDTO);
		return passwordDTO;
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers={"content-type=text/json"})
	public String readJSON() {
		return "start";
	}
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	@RequestMapping(value="/start", method=RequestMethod.GET, params = {"loyalty=silver"})
	public String readSilver() {
		return "start";
	}
	
	
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 @author Administrator
	 @ Handle the /start end point
	 @return
	*/
	@RequestMapping("/index")
	public String index() {
		return "start";
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

