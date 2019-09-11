package com.psl.demoone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginPageController {

	@GetMapping("/login.do")
	public String login()
	{
		return "loginPage";
	}
}
