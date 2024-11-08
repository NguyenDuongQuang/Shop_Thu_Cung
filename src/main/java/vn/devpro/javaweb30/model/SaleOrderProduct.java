package vn.devpro.javaweb30.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;

@Entity
@Table(name = "tbl_sale_order_product")
public class SaleOrderProduct extends BaseModel{
	@Column(name = "product_name", length = 300, nullable = true)
	private String productName;
	
	@Column(name = "quantity", nullable = true)
	private int quantity;
	
	@Column(name = "description", length = 500, nullable = true)
	private String description;
	
//	@ManyToOne
//	@JoinColumn(name="sale_order_id",referencedColumnName = "id")
//	private SaleOrder saleOrder;

	@ManyToOne
	@JoinColumn(name="product_id",referencedColumnName = "id")
	private Product product;

	
	public SaleOrderProduct() {
		super();
	}
	
	

//	public SaleOrder getSaleOrder() {
//		return saleOrder;
//	}
//
//
//
//	public void setSaleOrder(SaleOrder saleOrder) {
//		this.saleOrder = saleOrder;
//	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



//	public SaleOrderProduct(String productName, int quantity, String description, SaleOrder saleOrder,
//			Product product) {
//		super();
//		this.productName = productName;
//		this.quantity = quantity;
//		this.description = description;
//		this.saleOrder = saleOrder;
//		this.product = product;
//	}



	public SaleOrderProduct(Integer id, Date createDate, Date updateDate, Boolean status, String productName,
			int quantity, String description) {
		super(id, createDate, updateDate, status);
		this.productName = productName;
		this.quantity = quantity;
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
