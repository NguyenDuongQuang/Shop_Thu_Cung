package vn.devpro.javaweb30.controller.frontend;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.controller.BaseController;
import vn.devpro.javaweb30.model.Contact;

@Controller

@RequestMapping("/contact/")
public class ContactController extends BaseController {

	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String viewContactPage() {
		return "frontend/contact";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveContact(final HttpServletRequest request) {
		// Lấy dữ liệu từ view
		Contact contact = new Contact();
		contact.setName(request.getParameter("name"));
		contact.setName(request.getParameter("email"));
		contact.setName(request.getParameter("message"));
		contact.setName(request.getParameter("mobile"));
		contact.setName(request.getParameter("address"));
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String message = request.getParameter("message");

		System.out.println("Name: " + contact.getName());
		System.out.println("Email: " + contact.getEmail());
		System.out.println("Message: " + contact.getMessage());
		System.out.println("Address: " + contact.getAddress());
		System.out.println("Mobile: " + contact.getMobile());
//		
		return "frontend/contact";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String viewEditPage(final Model model) {

		Contact contact = new Contact("Nguyễn Duy Thường", "thuongnd@yahoo.com", "0987654321", "Hà Nội",
				"Cảm Ơn Quý Khách ");

		// Đẩy dữ liệu sang view
		model.addAttribute("contact", contact);
		return "frontend/contact-edit";
	}

//	@RequestMapping(value = "save-edit", method = RequestMethod.POST)
//	public String saveEditContact(final HttpServletRequest request) {
//		// Lấy dữ liệu từ view
////		String name = request.getParameter("name");
////		String email = request.getParameter("email");
////		String message = request.getParameter("message");
////
////		System.out.println("Name: " + name);
////		System.out.println("Email: " + email);
////		System.out.println("Message: " + message);
//
//		Contact contact = new Contact();
//		contact.setName(request.getParameter("name"));
//		contact.setName(request.getParameter("email"));
//		contact.setName(request.getParameter("message"));
//		contact.setName(request.getParameter("mobile"));
//		contact.setName(request.getParameter("address"));
//
//		System.out.println("Name: " + contact.getName());
//		System.out.println("Email: " + contact.getEmail());
//		System.out.println("Message: " + contact.getMessage());
//		System.out.println("Address: " + contact.getAddress());
//		System.out.println("Mobile: " + contact.getMobile());
//
//		return "frontend/contact-edit";
//	}

	@RequestMapping(value = "save-edit", method = RequestMethod.POST)
	public ResponseEntity<Map<String, String>> saveEditContactAjax(@RequestBody Contact contact) {
		// Lấy dữ liệu từ view

		System.out.println(contact.getAddress());
		Map<String, String> jMap = new HashMap<String, String>();
		jMap.put("code", "200");
		jMap.put("message", "Dữ Liệu" + contact.getName() + " Đã Được Lưu");
		return ResponseEntity.ok(jMap);
	}

}
