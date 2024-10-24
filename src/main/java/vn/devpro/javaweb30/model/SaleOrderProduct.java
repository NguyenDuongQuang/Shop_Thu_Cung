package vn.devpro.javaweb30.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_sale_order_product")
public class SaleOrderProduct extends BaseModel{
	@Column(name = "product_name", length = 300, nullable = true)
	private String productName;
	
	@Column(name = "quantity", nullable = true)
	private int quantity;
	
	@Column(name = "description", length = 500, nullable = true)
	private String description;

	public SaleOrderProduct() {
		super();
	}

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
