package vn.devpro.javaweb30.controller;

import java.math.BigInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import vn.devpro.javaweb30.dto.Cart;

@Controller
public class BaseController {
	
	@ModelAttribute("title")
	public String title() {
		return "Javaweb-30";
	}
	
	@ModelAttribute("totalCartProducts")
	public BigInteger totalCartProducts(final HttpServletRequest request) {
		BigInteger total = BigInteger.ZERO;
		//Lấy giỏ hàng
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart)session.getAttribute("cart");
			total = cart.totalCartProduct();
		}
		return total;
	}
}
