package vn.devpro.javaweb30.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_sale_order")
public class Sale_Order extends BaseModel {
	@Column(name = "code", length = 60, nullable = true)
	private String code;

	@Column(name = "total")
	private BigDecimal total;

	@Column(name = "customer_name", length = 300, nullable = true)
	private String customer_Name;

	@Column(name = "customer_mobile", length = 120, nullable = true)
	private String customer_Mobile;

	@Column(name = "customer_email", length = 120, nullable = true)
	private String customer_Email;

	@Column(name = "customer_Address", length = 300, nullable = true)
	private String customer_Address;
}
