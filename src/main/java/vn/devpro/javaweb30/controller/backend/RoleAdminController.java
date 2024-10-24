package vn.devpro.javaweb30.controller.backend;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.model.Role;
import vn.devpro.javaweb30.model.User;
import vn.devpro.javaweb30.service.RoleService;
import vn.devpro.javaweb30.service.UserService;

@Controller
@RequestMapping("admin/role")
public class RoleAdminController {
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	private String view(final Model model) {
		List<Role> roles = roleService.findAll();
		model.addAttribute("roles", roles);
		return "backend/role/role-list";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	private String add(final Model model) {
		List<User> users = userService.findAll();
		Role role = new Role();
		model.addAttribute("users", users);
		model.addAttribute("role", role);
		return "backend/role/role-add";
	}
	
	@RequestMapping(value = "add-save", method = RequestMethod.POST)
	private String addSave(@ModelAttribute("role") Role role) {
		roleService.saveOrUpdate(role);
		return "redirect:/admin/role/add";
	}
	
	@RequestMapping(value = "edit/{roleId}", method = RequestMethod.GET)
	private String edit(final Model model, @PathVariable int roleId) {
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		Role role = roleService.getById(roleId);
		role.setUpdateDate(new Date());
		model.addAttribute("role", role);
		return "backend/role/role-edit";
	}
	
	@RequestMapping(value = "edit-save", method = RequestMethod.POST)
	private String editSave(@ModelAttribute("role") Role role) {
		roleService.saveOrUpdate(role);
		return "redirect:/admin/role/view";
	}
	
	@RequestMapping(value = "delete/{roleId}", method = RequestMethod.GET)
	private String delete(@PathVariable int roleId) {
		roleService.deleteById(roleId);
		return "redirect:/admin/role/view";
	}
}
