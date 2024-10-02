package vn.devpro.javaweb30.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product extends BaseModel {
	@Column(name = "name", length = 300, nullable = true)
	private String name;

	@Column(name = "avatar", length = 300, nullable = true)
	private String avatar;

	@Column(name = "price", nullable = true)
	private BigDecimal price;

	@Column(name = "sale_price", nullable = true)
	private BigDecimal sale_price;

	@Column(name = "is_hot", nullable = true)
	private Integer is_hot;

	@Column(name = "short_description", length = 2000, nullable = true)
	private String short_description;

	@Column(name = "detail_description", length = 1000, nullable = true)
	private String detail_description;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id",referencedColumnName = "id")
	private Category category;
}
