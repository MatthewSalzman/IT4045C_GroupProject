package com.quickpass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quickpass.dto.PasswordDTO;
import com.quickpass.dto.UserDTO;
import com.quickpass.service.IPasswordService;
import com.quickpass.service.IUserService;

/**
 * @author Administrator Handle the /start endpoint
 * @return
 */
@Controller
public class QuickpassController {

	@Autowired
	private IPasswordService passwordServiceStub;
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	@ResponseBody
	public PasswordDTO read(Model model) {
		PasswordDTO passwordDTO = passwordServiceStub.fetchById(1);
		model.addAttribute("passwordDTO", passwordDTO);
		return passwordDTO;
	}

	@RequestMapping(value = "/savepassword")
	public String savePassword(PasswordDTO passwordDTO) {
		passwordDTO.setPassword("Test");
		passwordDTO.setWebsite("https://uc.edu");
		passwordDTO.setPasswordId(1);
		passwordDTO.setUserId(1);
		
		try {
			passwordServiceStub.save(passwordDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		
		return "start";
	}
	@RequestMapping(value = "/saveuser")
	public String saveUser(UserDTO userDTO) {
		userDTO.setId(1);
		userDTO.setEmail("test@test.com");
		userDTO.setFirstName("Test");
		userDTO.setLastName("User");
		userDTO.setPassword("Pa$$w0rd");
		
		
		try {
			userService.save(userDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		
		return "start";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET, headers = { "content-type=text/json" })
	public String readJSON() {
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, params = { "loyalty=blue" })
	public String readBlue() {
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, params = { "loyalty=silver" })
	public String readSilver() {
		return "start";
	}

	@PostMapping("/start")
	public String create() {
		return "start";
	}

	/**
	 * @author Administrator @ Handle the /start end point
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "start";
	}

	@RequestMapping(value = "/passwordTable", method = RequestMethod.GET)
	public String startPasswordTable() {
		return "passwordTable";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String startLogin() {
		return "login";
	}

	@PostMapping("/processLogin")
	public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		//to do:
		//Authenticate username and password with database
		//else show error
		return "passwordTable";
		

	}
}
