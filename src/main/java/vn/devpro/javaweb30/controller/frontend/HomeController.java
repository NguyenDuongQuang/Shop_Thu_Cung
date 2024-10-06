package vn.devpro.javaweb30.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.controller.BaseController;

@Controller
public class HomeController extends BaseController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String viewHomePage() {
		return "frontend/index";
	}

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String viewCategoryPage() {
		return "frontend/category";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String viewProductPage() {
		return "frontend/product";
	}

}
