package vn.devpro.javaweb30.controller.backend;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import vn.devpro.javaweb30.controller.BaseController;
import vn.devpro.javaweb30.dto.Jw30Contant;
import vn.devpro.javaweb30.dto.SearchModel;
import vn.devpro.javaweb30.model.Category;
import vn.devpro.javaweb30.model.Product;
import vn.devpro.javaweb30.model.ProductImage;
import vn.devpro.javaweb30.model.User;
import vn.devpro.javaweb30.service.CategoryService;
import vn.devpro.javaweb30.service.ProductImageService;
//import vn.devpro.javaweb30.service.CategoryService;
import vn.devpro.javaweb30.service.ProductService;
import vn.devpro.javaweb30.service.UserService;

@Controller
@RequestMapping("admin/product/")
public class ProductAdminController extends BaseController implements Jw30Contant{
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductImageService productImageService;
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	private String view(final Model model, final HttpServletRequest request) {
		
		SearchModel searchModel = new SearchModel();
		//Tìm kiếm theo status
		searchModel.setStatus(2); //Chọn all
		String str = request.getParameter("status");
		if (str != null && !StringUtils.isEmpty(str)) {
			searchModel.setStatus(Integer.parseInt(str));
		}
		
		//Tìm theo category
		searchModel.setCategoryId(0); //All categories
		str = request.getParameter("categoryId");
		if (str != null && !StringUtils.isEmpty(str)) {
			searchModel.setCategoryId(Integer.parseInt(str));
		}
		
		//Tìm theo keyword
		searchModel.setKeyword(null);
		str = request.getParameter("keyword");
				//.trim();
		if (str != null && !StringUtils.isEmpty(str)) {
			searchModel.setKeyword(str.trim().toLowerCase());
		}
		
		//Tìm từ ngày đến ngày
		searchModel.setBeginDate(null);
		searchModel.setEndDate(null);
		String endDate = request.getParameter("endDate");
		String beginDate = request.getParameter("beginDate");
		if (beginDate != null && !StringUtils.isEmpty(beginDate) && endDate != null && !StringUtils.isEmpty(endDate)) {
			searchModel.setBeginDate(beginDate);
			searchModel.setEndDate(endDate);
		}
		
		List<Category> categories = categoryService.findAllActive();
		model.addAttribute("categories", categories);
		
		
//		List<Product> products = productService.search(searchModel);
//		model.addAttribute("products", products);
		
		List<Product> allProducts = productService.search(searchModel);
		
		// Tính toán phân trang
		searchModel.setCurrentPage(1); // Mặc định là 1
		// Lấy trang hiện tại
		str = request.getParameter("currentPage");
		if (str != null && !StringUtils.isEmpty(str)) {
			searchModel.setCurrentPage(Integer.parseInt(str));
		}
		
		//Trường hợp bấm search để tìm kiếm
		str = request.getParameter("totalItems"); // Tổng số sp trước tìm kiếm
		if (str != null && !StringUtils.isEmpty(str)) {
			int totalItems = Integer.parseInt(str);
			if (totalItems != allProducts.size()) {// Tìm kiếm mới thì lại về trang 1
				searchModel.setCurrentPage(1);
			}
		}
		searchModel.setTotalItems(allProducts.size());
		searchModel.setSizeOfPage(SIZE_OF_PAGE);
		int totalPages = allProducts.size() / SIZE_OF_PAGE;
		if (allProducts.size() % SIZE_OF_PAGE > 0) {
			totalPages++;
		}
		searchModel.setTotalPages(totalPages);
		
		//Lấy danh sách của trang hiện tại
		int firstIndex = (searchModel.getCurrentPage() - 1) * SIZE_OF_PAGE;
		int lastIndex = firstIndex + SIZE_OF_PAGE;
		if (lastIndex > allProducts.size()) {
			lastIndex = allProducts.size();
		}
		List<Product> products = allProducts.subList(firstIndex, lastIndex);
		
		model.addAttribute("products", products);
		model.addAttribute("searchModel", searchModel);
		
		//System.out.println(searchModel.getCurrentPage());
		
		return "backend/product/product-list";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	private String add(final Model model) {
		List<Category> categories = categoryService.findAllActive();
		List<User> users = userService.findAdminUsers();
		
		Product product = new Product();
		product.setCreateDate(new Date());
		model.addAttribute("categories", categories);
		model.addAttribute("users", users);
		model.addAttribute("product", product);
		
		return "backend/product/product-add";
	}
	
	@RequestMapping(value = "add-save", method = RequestMethod.POST)
	private String addSaveProduct(@ModelAttribute("product") Product product,
			@RequestParam("avatarFile") MultipartFile avatarFile,
			@RequestParam("imageFiles") MultipartFile[] imageFiles) throws IOException{
		//productService.saveOrUpdate(product);
		productService.saveProduct(product, avatarFile, imageFiles);
		return "redirect:/admin/product/add";
	}
	
	@RequestMapping(value = "edit/{productId}", method = RequestMethod.GET)
	private String edit(final Model model, @PathVariable int productId) {
		//Lấy sp trong db
		Product product = productService.getById(productId);
		product.setUpdateDate(new Date());
		//product.setUserUpdateProduct(loginedUser);
		List<Category> categories = categoryService.findAllActive();
		List<User> users = userService.findAdminUsers();
		
		//product.setCreateDate(new Date());
		model.addAttribute("categories", categories);
		model.addAttribute("users", users);
		model.addAttribute("product", product);
		
		return "backend/product/product-edit";
	}
	
//	@RequestMapping(value = "edit/{productId}", method = RequestMethod.GET)
//	private String edit(final Model model, @PathVariable int productId) {
//		List<Category> categories = categoryService.findAll();
//		List<User> users = userService.findAll();
//		
//		model.addAttribute("categories", categories);
//		model.addAttribute("users", users);
//		
//		Product product = productService.getById(productId);
//		product.setUpdateDate(new Date());
//		model.addAttribute("product", product);
//		
//		return "backend/product/product-edit";
//	}
	
//	@RequestMapping(value = "edit-save", method = RequestMethod.POST)
//	public String editSave(@ModelAttribute("product") Product product) {
//		productService.saveOrUpdate(product);
//		return "redirect:/admin/product/view";
//	}
	
	@RequestMapping(value = "edit-save", method = RequestMethod.POST)
	private String saveEditProduct(@ModelAttribute("product") Product product,
			@RequestParam("avatarFile") MultipartFile avatarFile,
			@RequestParam("imageFiles") MultipartFile[] imageFiles) throws IOException{
		//productService.saveOrUpdate(product);
		productService.saveEditProduct(product, avatarFile, imageFiles);
		return "redirect:/admin/product/view";
	}
	
//	@RequestMapping(value = "delete/{productId}", method = RequestMethod.GET)
//	public String delete(final Model model,@PathVariable int productId) {
//		productService.deleteById(productId);
//		return "redirect:/admin/product/view";
//	}
	@RequestMapping(value = "delete/{productId}", method = RequestMethod.GET)
	private String delete(final Model model, @PathVariable int productId) {
		//Lấy sp trong db
		Product product = productService.getById(productId);
		product.setStatus(false);
		// Xóa avatar
		if (product.getAvatar() != null && !StringUtils.isEmpty(product.getAvatar())) {
			String path = FOLDER_UPLOAD + product.getAvatar();
			File file = new File(path);
			file.delete();
			product.setAvatar(null);
		}
		//Xóa ảnh sản phẩm
		//+ Xóa file ảnh
		List<ProductImage> productImages = 
				productImageService.getImageByProductId(productId);
		for (ProductImage productImage : productImages) {
			String path = FOLDER_UPLOAD + productImage.getPath();
			File file = new File(path);
			file.delete();
			productImage.setProduct(product);
			product.removeRelationalProductImage(productImage);
		}
		//productService.delete(product); //xóa hẳn
		productService.saveOrUpdate(product); //inactive
		
		
		return "redirect:/admin/product/view";
		//return "backend/product/view";
	}
}
