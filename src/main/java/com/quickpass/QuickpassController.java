package com.quickpass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

	@PostMapping(value = "/savepassword")
	public String savePassword(@RequestParam("userId") int userId,
			@RequestParam("website") String website, @RequestParam("password") String password) { 
		PasswordDTO passwordDTO = new PasswordDTO();
		passwordDTO.setUserId(userId);
		passwordDTO.setWebsite(website);
		passwordDTO.setPassword(password);

		try {
			passwordServiceStub.save(passwordDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}

		return "passwordTable";
	}

	@PostMapping(value = "/saveuser")
	public String saveUser(@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("email") String email,
			@RequestParam("password") String password) {
		UserDTO userDTO = new UserDTO();
		userDTO.setEmail(email);
		userDTO.setFirstName(firstName);
		userDTO.setLastName(lastName);
		userDTO.setPassword(password);

		try {
			userService.save(userDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		return "passwordTable";
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
	@GetMapping("/index")
	public String index() {
		return "login";
	}

	@GetMapping(value = "/passwordTable")
	public String passwordTable() {
		return "passwordTable";
	}

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@PostMapping("/processLogin")
	public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		// to do:
		// Authenticate username and password with database
		// else show error
		return "passwordTable";

	}
}
