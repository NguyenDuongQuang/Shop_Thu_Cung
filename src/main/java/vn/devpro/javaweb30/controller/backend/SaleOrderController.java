package vn.devpro.javaweb30.controller.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.devpro.javaweb30.controller.BaseController;
import vn.devpro.javaweb30.model.SaleOrder;
import vn.devpro.javaweb30.service.SaleOrderSevice;
@Controller
@RequestMapping("/admin/order")
public class SaleOrderController extends BaseController{
	
	@Autowired
	private SaleOrderSevice saleOrderSevice;
	@GetMapping("/view")
	public String ViewOrder(Model model) {
		
		List<SaleOrder> saleOrders=new ArrayList<SaleOrder>();
		saleOrders=saleOrderSevice.findAll();
		model.addAttribute("saleOrders",saleOrders);
		return "/backend/order/order-list";
	}

}
