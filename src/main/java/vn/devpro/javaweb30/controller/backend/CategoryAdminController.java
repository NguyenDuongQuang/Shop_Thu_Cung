package vn.devpro.javaweb30.controller.backend;

import java.sql.Date;
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
import vn.devpro.javaweb30.model.Category;
import vn.devpro.javaweb30.model.User;
import vn.devpro.javaweb30.service.CategoryService;
import vn.devpro.javaweb30.service.UserService;

@Controller
@RequestMapping("/admin/category")
public class CategoryAdminController extends BaseController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	UserService userService;

	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String viewCategory(Model model, HttpServletRequest request) {
	//	List<Category> categories = categoryService.findAll();
		List<Category> categories = categoryService.findAllActive();
		model.addAttribute("categories", categories);
		return "backend/category-list";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String viewaddCategory(Model model, HttpServletRequest request) {
		List<User> users = userService.findAll();

		Category category = new Category();
		model.addAttribute("category", category);
		category.setCreateDate(new java.util.Date());
		category.setUpdateDate(new java.util.Date());
		model.addAttribute("users", users);

		return "backend/category-add";
	}

	@RequestMapping(value = "add-save", method = RequestMethod.POST)
	public String addCategory(Model model, HttpServletRequest request, @ModelAttribute("category") Category category) {
		categoryService.saveOrUpdate(category);

		return "backend/category-add";
	}

	@RequestMapping(value = "edit/{categoryId}", method = RequestMethod.GET)
	public String editCategory(Model model, HttpServletRequest request, @PathVariable int categoryId) {
		List<User> users = userService.findAll();

		Category category = categoryService.getById(categoryId);
		model.addAttribute("category", category);
		category.setUpdateDate(new java.util.Date());
		model.addAttribute("users", users);

		return "backend/category-edit";
	}

	@RequestMapping(value = "edit-save", method = RequestMethod.POST)
	public String saveEditCategory(Model model, HttpServletRequest request,
			@ModelAttribute("category") Category category) {

		categoryService.saveOrUpdate(category);

		return "redirect:/admin/category/view";
	}

//	@RequestMapping(value = "delete/{categoryId}", method = RequestMethod.GET)
//	public String deleteCategory(Model model, HttpServletRequest request, @PathVariable int categoryId) {
//		categoryService.deleteById(categoryId);
//		return "redirect/admin/category/view";
//	}

	@RequestMapping(value = "delete/{categoryId}", method = RequestMethod.GET)
	public String deleteCategory(Model model, HttpServletRequest request, @PathVariable int categoryId) {
		Category category = categoryService.getById(categoryId);
		category.setStatus(false);
		categoryService.saveOrUpdate(category);
		return "redirect:/admin/category/view";
	}

}
