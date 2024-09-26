package vn.devpro.javaweb30.controller.frontend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.controller.BaseController;

@Controller

@RequestMapping("/contact/")
public class ContactController extends BaseController {
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String viewContactPage() {
		return "frontend/contact";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveContact(final HttpServletRequest request) {
		//Lấy dữ liệu từ view
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Message: " + message);
		
		return "frontend/contact";
	}
	
	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String viewEditPage(final Model model) {
		
		String name = "Nguyễn Duy Thường";
		String email = "thuongnd@yahoo.com";
		String message = "Cửa hàng ship chậm";
		
		//Đẩy dữ liệu sang view
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("message", message);
		
		return "frontend/contact-edit";
	}
	
	@RequestMapping(value = "save-edit", method = RequestMethod.POST)
	public String saveEditContact(final HttpServletRequest request) {
		//Lấy dữ liệu từ view
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Message: " + message);
		
		return "frontend/contact-edit";
	}

}
