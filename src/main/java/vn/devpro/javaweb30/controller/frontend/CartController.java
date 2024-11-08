//package vn.devpro.javaweb30.controller.frontend;
//
//import java.math.BigDecimal;
//import java.sql.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import vn.devpro.javaweb30.controller.BaseController;
//import vn.devpro.javaweb30.dto.Cart;
//import vn.devpro.javaweb30.dto.CartProduct;
//import vn.devpro.javaweb30.dto.Jw30Contant;
//import vn.devpro.javaweb30.model.Product;
//import vn.devpro.javaweb30.model.SaleOrder;
//import vn.devpro.javaweb30.model.SaleOrderProduct;
//import vn.devpro.javaweb30.model.User;
//import vn.devpro.javaweb30.service.ProductService;
//import vn.devpro.javaweb30.service.SaleOrderSevice;
//
//@Controller
//public class CartController extends BaseController implements Jw30Contant {
//
//	@Autowired
//	private ProductService productService;
//	
//	@Autowired 
//	SaleOrderSevice saleOrderSevice;
//
//	@RequestMapping(value = "/add-to-cart", method = RequestMethod.POST)
//	public ResponseEntity<Map<String, Object>> addToCart(@RequestBody CartProduct cartProduct,
//			final HttpServletRequest request) {
//		Map<String, Object> jsonResult = new HashMap<String, Object>();
//
//		if (cartProduct.getQuantity().intValue() < 1) {
//			jsonResult.put("code", 120);
//			jsonResult.put("message", "Số lượng không hợp lệ");
//		} else {
//			// Kiểm tra có giỏ hàng chưa
//			Cart cart = new Cart();
//			HttpSession session = request.getSession();
//			if (session.getAttribute("cart") == null) {
//				// Khởi tạo giỏ hàng
//				session.setAttribute("cart", cart);
//			} else {
//				cart = (Cart) session.getAttribute("cart");
//			}
//
//			// Thêm sản phẩm vào giỏ hàng
//			int index = cart.findProductById(cartProduct.getId());
//			if (index == -1) { // Sản phẩm chưa có trong giỏ hàng
//				// Lấy sp trong giỏ
//				Product product = productService.getById(cartProduct.getId());
//				cartProduct.setAvatar(product.getAvatar());
//				cartProduct.setPrice(product.getPrice());
//
//				cart.getCartProducts().add(cartProduct);
//			} else {
//				cart.getCartProducts().get(index).updateQuantity(cartProduct.getQuantity());
//			}
//
//			jsonResult.put("code", 420);
//			jsonResult.put("message",
//					"Đã thêm " + cartProduct.getQuantity() + " '" + cartProduct.getName() + "' vào giỏ hàng");
//			// Tổng số sản phẩm trong giỏ hàng
//			jsonResult.put("totalCartProducts", cart.totalCartProduct());
//		}
//		return ResponseEntity.ok(jsonResult);
//
//	}
//
//	@RequestMapping(value = "/cart-view", method = RequestMethod.GET)
//	public String cartView(HttpServletRequest request, Model model) {
//
//		BigDecimal totalCartPrice = BigDecimal.ZERO;
//		HttpSession session = request.getSession();
//		if (session.getAttribute("cart") != null) {
//			Cart cart = (Cart) session.getAttribute("cart");
//
//		}
//		return "frontend/cart-view";
//	}
//
//	@RequestMapping(value = "/update-product-quantity", method = RequestMethod.POST)
//
//	ResponseEntity<Map<String, Object>> updateProductQuantity(@RequestBody CartProduct cartproduct, final Model model,
//			final HttpServletRequest request) {
//		// tim sp trong gio hang
//		Cart cart = (Cart) request.getSession().getAttribute("cart");
//		int index = cart.findProductById(cartproduct.getId());
//		CartProduct productInCart = cart.getCartProducts().get(index); // sp dang trong gio hang
//		if (cartproduct.getQuantity().intValue() == -1) {
//			if (productInCart.getQuantity().intValue() > 1) {
//				cart.getCartProducts().get(index).updateQuantity(cartproduct.getQuantity());
//			}
//		} else {
//			cart.getCartProducts().get(index).updateQuantity(cartproduct.getQuantity());
//		}
//
//		Map<String, Object> jMap = new HashMap<String, Object>();
//		jMap.put("newQuantity", cart.getCartProducts().get(index).getQuantity());
//		jMap.put("totalCartPrice", cart.totalCartPrice());
//		jMap.put("totalPrice", cart.getCartProducts().get(index).totalPrice());
//		jMap.put("totalCartProducts", cart.totalCartProduct());
//		jMap.put("productId", cartproduct.getId());
//		return ResponseEntity.ok(jMap);
//
//	}
//
//	public StringBuilder toCurrency(BigDecimal number) {
//		StringBuilder str = new StringBuilder(number.toString());
//		int gr = 1;
//		int i = str.length() - 1;
//		while (i > 0) {
//			if (gr % 3 == 0) {
//				str.insert(i, ',');
//			}
//			i--;
//			gr++;
//		}
//		return str;
//	}
//
////	@PostMapping("/place-order")
////	public ResponseEntity<Map<String, Object>> placeorder(HttpServletRequest request,
////			@RequestBody SaleOrder saleOrder) {
////		Map<String, Object> jMap = new HashMap<String, Object>();
////		if (saleOrder.getCustomerName() == null || StringUtils.isEmpty(saleOrder.getCustomerName().trim())) {
////			jMap.put("code", 500);
////			jMap.put("message", "Chưa Nhập Họ Tên");
////			return ResponseEntity.ok(jMap);
////		}
////		if (saleOrder.getCustomerMobile() == null || StringUtils.isEmpty(saleOrder.getCustomerMobile().trim())) {
////			jMap.put("code", 500);
////			jMap.put("message", "Chưa Số Điện Thoại");
////			return ResponseEntity.ok(jMap);
////		}
////		HttpSession session=request.getSession();
////		if(session.getAttribute("cart")==null) {
////			jMap.put("code", 600);
////			jMap.put("message", "Không Có Sản Phẩm Nào Trong Giỏ Hàng");
////			return ResponseEntity.ok(jMap);
////		}
////		Cart cart=(Cart) session.getAttribute("cart");
////		User user=new User();
////		user.setId(1);
////		saleOrder.setUser(user);
////		
////		for(CartProduct cartProduct:cart.getCartProducts()) {
////			SaleOrderProduct saleOrderProduct=new SaleOrderProduct();
////			Product dbProduct= productService.getById(cartProduct.getId());
////			
////			saleOrderProduct.setProductName(dbProduct.getName());
////			saleOrderProduct.setProduct(dbProduct);
////			saleOrderProduct.setQuantity(cartProduct.getQuantity().intValue());
////			saleOrderProduct.setSaleOrder(saleOrder);
////			saleOrder.addRelationalSaleOrderProduct(saleOrderProduct);
////		}
////		saleOrder.setTotal(cart.totalCartPrice());
////		saleOrder.setCode(saleOrder.getCustomerName());
////		saleOrderSevice.saleOrder(saleOrder);
////		
////		
////		jMap.put("code", 500);
////		jMap.put("message", "Đặt Hàng Thành Công");
////		return ResponseEntity.ok(jMap);
////	}
//
//}
