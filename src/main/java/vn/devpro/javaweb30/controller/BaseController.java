package vn.devpro.javaweb30.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BaseController {
	
	@ModelAttribute("title")
	public String title() {
		return "Javaweb-30";
	}

}
