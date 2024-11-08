package vn.devpro.javaweb30.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name = "tbl_sale_order")
public class SaleOrder extends BaseModel{
	
	@Column(name = "code", length = 60, nullable = true)
	private String code;
	
	@Column(name = "total", nullable = true)
	private BigDecimal total;
	
	@Column(name = "customer_name",length = 300, nullable = true)
	private String customerName;
	
	@Column(name = "customer_mobile",length = 120, nullable = true)
	private String customerMobile;
	
	@Column(name = "customer_email",length = 120, nullable = true)
	private String customerEmail;
	
	@Column(name = "customer_address", length = 300, nullable = true)
	private String customerAddress;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	private User user;

	public SaleOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaleOrder(Integer id, Date createDate, Date updateDate, Boolean status) {
		super(id, createDate, updateDate, status);
		// TODO Auto-generated constructor stub
	}

	public SaleOrder(String code, BigDecimal total, String customerName, String customerMobile, String customerEmail,
			String customerAddress, User user) {
		super();
		this.code = code;
		this.total = total;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.user = user;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
