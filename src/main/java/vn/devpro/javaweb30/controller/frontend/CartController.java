package vn.devpro.javaweb30.controller.frontend;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb30.controller.BaseController;
import vn.devpro.javaweb30.dto.Cart;
import vn.devpro.javaweb30.dto.CartProduct;
import vn.devpro.javaweb30.dto.Jw30Contant;
import vn.devpro.javaweb30.model.Product;
import vn.devpro.javaweb30.service.ProductService;

@Controller
public class CartController extends BaseController implements Jw30Contant {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/add-to-cart", method = RequestMethod.POST)
	public ResponseEntity<Map<String,Object>> addToCart(@RequestBody CartProduct cartProduct,final HttpServletRequest request) {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		
		if (cartProduct.getQuantity().intValue() < 1) {
			jsonResult.put("code", 120);
			jsonResult.put("message", "Số lượng không hợp lệ");
		}
		else {
			//Kiểm tra có giỏ hàng chưa
			Cart cart = new Cart();
			HttpSession session = request.getSession();
			if (session.getAttribute("cart") == null) {
				//Khởi tạo giỏ hàng
				session.setAttribute("cart", cart);
			}
			else {
				cart = (Cart) session.getAttribute("cart");
			}
			
			//Thêm sản phẩm vào giỏ hàng
			int index = cart.findProductById(cartProduct.getId());
			if (index == -1) { // Sản phẩm chưa có trong giỏ hàng
				//Lấy sp trong giỏ
				Product product = productService.getById(cartProduct.getId());
				cartProduct.setAvatar(product.getAvatar());
				cartProduct.setPrice(product.getPrice());
				
				cart.getCartProducts().add(cartProduct);
			}
			else {
				cart.getCartProducts().get(index).updateQuantity(cartProduct.getQuantity());
			}
			
			jsonResult.put("code", 420);
			jsonResult.put("message", "Đã thêm " + cartProduct.getQuantity() + " '" + cartProduct.getName() + "' vào giỏ hàng");
			//Tổng số sản phẩm trong giỏ hàng
			jsonResult.put("totalCartProducts", cart.totalCartProduct());
		}
		return ResponseEntity.ok(jsonResult);
		
	}
	
	@RequestMapping(value= "/cart-view", method = RequestMethod.GET)
	public String cartView( HttpServletRequest request,Model model) {
		
		BigDecimal totalCartPrice=BigDecimal.ZERO;
		HttpSession session=request.getSession();
		if(session.getAttribute("cart")!=null) {
			Cart cart=(Cart) session.getAttribute("cart");
			
		}
		return "frontend/cart-view";
	}
}
