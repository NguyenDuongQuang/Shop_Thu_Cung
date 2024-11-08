package vn.devpro.javaweb30.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import vn.devpro.javaweb30.controller.BaseController;

@Controller
public class SecurityController extends BaseController{
	@GetMapping("/login")
	public String login() {
		return "/frontend/login";
	}
	
	@GetMapping("/signup")
	public String singup() {
		return "/frontend/signup";
	}

}
