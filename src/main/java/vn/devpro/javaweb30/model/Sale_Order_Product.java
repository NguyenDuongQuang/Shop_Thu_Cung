package vn.devpro.javaweb30.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_sale_order_product")
public class Sale_Order_Product extends BaseModel {
	@Column(name = "product_name", length = 300, nullable = true)
	private String product_Name;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "description", length = 300, nullable = true)
	private String description;
}
