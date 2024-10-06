package vn.devpro.javaweb30.controller.frontend;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String message = request.getParameter("message");

		Contact contact = new Contact();
		contact.setName(request.getParameter("name"));
		contact.setEmail(request.getParameter("email"));
		contact.setMessage(request.getParameter("message"));

		System.out.println("Name: " + contact.getName());
		System.out.println("Email: " + contact.getEmail());
		System.out.println("Message: " + contact.getMessage());

		return "frontend/contact";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String viewEditPage(final Model model) {

		Contact contact = new Contact("Nguyen duy hien", "hien@gmail.com", "0987654321", "ha noi", "cam on");

		// Đẩy dữ liệu sang view
		model.addAttribute("contact", contact);

		return "frontend/contact-edit";
	}

//	@RequestMapping(value = "save-edit", method = RequestMethod.POST)
//	public String saveEditContact(final HttpServletRequest request) {
//		//Lấy dữ liệu từ view
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String message = request.getParameter("message");
//		
//		System.out.println("Name: " + name);
//		System.out.println("Email: " + email);
//		System.out.println("Message: " + message);
//		
//		return "frontend/contact-edit";
//	}

	@RequestMapping(value = "save-edit", method = RequestMethod.POST)
	public ResponseEntity<Map<String, String>> saveEditContactAjax(@RequestBody Contact contact) {

		//
		System.out.println(contact.getAddress());

		Map<String, String> jsonResult = new HashMap<String, String>();
		jsonResult.put("code", "200");
		jsonResult.put("message", "Thanh cong luu " + contact.getName());

		return ResponseEntity.ok(jsonResult);
	}

	@RequestMapping(value = "view-sf", method = RequestMethod.GET)
	public String viewContactPageSf(final Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);

		return "frontend/contact-sf";
	}

	@RequestMapping(value = "save-sf", method = RequestMethod.POST)
	public String saveContactPageSf(final Model model, @ModelAttribute("contact") Contact contact,
			@RequestParam("contactFile") MultipartFile file) throws IOException {
		if (file != null && !StringUtils.isEmpty(file.getOriginalFilename())) {
			String path = "C:/Users/Quang/Documents/GitHub/Shop_Thu_Cung/ContactFiles/ContactFile/"
					+ file.getOriginalFilename();
			File fp = new File(path);
			file.transferTo(fp); // luu
		}

		return "redirect:view-sf";
	}

	@RequestMapping(value = "edit-sf", method = RequestMethod.GET)
	public String editContactPageSf(final Model model) {
		Contact contact = new Contact("Nguyen ngoc ngan", "ngnn@gmail.com", "0987654321", "cau buou", "xin chao");
		model.addAttribute("contact", contact);

		return "frontend/contact-edit-sf";
	}

	@RequestMapping(value = "save-edit-sf", method = RequestMethod.POST)
	public String saveEditContactPageSf(final Model model, @ModelAttribute("contact") Contact contact,
			@RequestParam("contactFile") MultipartFile file) throws IOException {

		if (file != null && !StringUtils.isEmpty(file.getOriginalFilename())) {
			String path = "C:/Users/Quang/Documents/GitHub/Shop_Thu_Cung/ContactFiles/ContactFile/";
			File fp = new File(path);
			String[] list = fp.list();

			path += list[0];
			fp = new File(path);
			fp.delete();
//			file.transferTo(fp);
			path = "C:/Users/Quang/Documents/GitHub/Shop_Thu_Cung/ContactFiles/ContactFile/"
					+ file.getOriginalFilename();
			fp = new File(path);
			file.transferTo(fp);

		}
		return "redirect:view-sf";
	}

//	@RequestMapping(value = "save-edit-sf", method = RequestMethod.POST)
//	public String saveEditContactPageSf(final Model model, @ModelAttribute("contact") Contact contact,
//	        @RequestParam("contactFile") MultipartFile file) throws IOException {
//
//	    String basePath = "C:/Users/Quang/Documents/GitHub/Shop_Thu_Cung/ContactFiles/ContactFile/";
//
//	    // Check if the file is not null and has a valid filename
//	    if (file != null && !StringUtils.isEmpty(file.getOriginalFilename())) {
//	        File directory = new File(basePath);
//
//	        // Ensure the directory exists
//	        if (directory.exists() && directory.isDirectory()) {
//	            // List files in the directory and delete the first one found (if any)
//	            String[] fileList = directory.list();
//	            if (fileList != null && fileList.length > 0) {
//	                // Delete the first file in the directory
//	                File oldFile = new File(basePath + fileList[0]);
//	                if (oldFile.exists()) {
//	                    oldFile.delete();
//	                }
//	            }
//
//	            // Create a new file object for the uploaded file
//	            String newFilePath = basePath + file.getOriginalFilename();
//	            File newFile = new File(newFilePath);
//
//	            // Transfer the uploaded file to the destination
//	            file.transferTo(newFile);
//	        } else {
//	            // Handle the case where the directory doesn't exist
//	            throw new IOException("Directory does not exist: " + basePath);
//	        }
//	    }
//
//	    return "redirect:view-sf";
//	}

}
