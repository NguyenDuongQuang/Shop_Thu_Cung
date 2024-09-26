package vn.devpro.javaweb30.controller.frontend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.controller.BaseController;

@Controller
@RequestMapping("/contact")
public class ContactController extends BaseController {
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String vỉewHomeContact() {
		return "frontend/contact";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveContact(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		System.out.println("Name :" + name);
		System.out.println("Email :" + email);
		System.out.println("Mesage :" + message);
		return "frontend/contact";
	}
	
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editContact(Model model ) {
		
		String name="Nguyễn Dương Quang";
		String email="ndq1234pn@gmail.com";
		String message="ádfg";
		
		model.addAttribute("name",name);
		model.addAttribute("email",email);
		model.addAttribute("message",message);
		return "frontend/contact-edit";
	}
	
	@RequestMapping(value = "/save-edit", method = RequestMethod.POST)
	public String saveEditContact(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		System.out.println("Name :" + name);
		System.out.println("Email :" + email);
		System.out.println("Mesage :" + message);
		return "frontend/contact-edit";
	}
}
