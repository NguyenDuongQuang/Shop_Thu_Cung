package vn.devpro.javaweb30.controller.backend;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.controller.BaseController;
import vn.devpro.javaweb30.model.Role;
import vn.devpro.javaweb30.model.User;
import vn.devpro.javaweb30.service.RoleService;
import vn.devpro.javaweb30.service.UserService;

@Controller
@RequestMapping("/admin/user")
public class UserAdminController extends BaseController{
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	private String view(final Model model,final HttpServletRequest request) {
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "backend/user/user-list";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	private String add(final Model model) {
		List<Role> roles = roleService.findAll();
		List<User> users = userService.findAdminUsers();
		User user = new User();
		model.addAttribute("roles", roles);
		model.addAttribute("users", users);
		model.addAttribute("user", user);
		return "backend/user/user-add";
	}
	
	@RequestMapping(value = "add-save", method = RequestMethod.POST)
	private String addSave(@ModelAttribute("user") User user) {
		userService.saveOrUpdate(user);
		return "redirect:/admin/user/add";
	}
	
	@RequestMapping(value = "edit/{userId}", method = RequestMethod.GET)
	private String edit(final Model model,@PathVariable int userId) {
		List<Role> roles = roleService.findAll();
		model.addAttribute("roles", roles);
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		User user = userService.getById(userId);
		user.setUpdateDate(new Date());
		model.addAttribute("user", user);
		return "backend/user/user-edit";
	}
	
	@RequestMapping(value = "edit-save", method = RequestMethod.POST)
	private String editSave(@ModelAttribute("user") User user) {
		userService.saveOrUpdate(user);
		return "redirect:/admin/user/view";
	}
	
	@RequestMapping(value = "delete/{userId}", method = RequestMethod.GET)
	private String delete(@PathVariable int userId) {
		userService.deleteById(userId);
		return "redirect:/admin/user/view";
	}
}
