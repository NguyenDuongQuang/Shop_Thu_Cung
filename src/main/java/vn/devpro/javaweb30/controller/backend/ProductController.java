package vn.devpro.javaweb30.controller.backend;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.controller.BaseController;
import vn.devpro.javaweb30.model.Category;
import vn.devpro.javaweb30.model.Product;
import vn.devpro.javaweb30.service.CategoryService;
import vn.devpro.javaweb30.service.ProductService;

@Controller
@RequestMapping("/admin/product/")
public class ProductController extends BaseController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String viewCategory(Model model, HttpServletRequest request) {
		List<Category> categories = categoryService.findAll();
		model.addAttribute("categories", categories);
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		return "backend/product-list";
	}
}
