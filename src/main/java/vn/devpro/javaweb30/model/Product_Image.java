package vn.devpro.javaweb30.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product_image")
public class Product_Image extends BaseModel {
	@Column(name = "title", length = 500, nullable = true)
	private String title;

	@Column(name = "path", length = 300, nullable = true)
	private String path;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private Product product;
}
