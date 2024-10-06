package vn.devpro.javaweb30.model;

import java.math.BigDecimal;
import java.util.Date;

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
	private BigDecimal salePrice;

	@Column(name = "is_hot", nullable = true)
	private Integer isHot;
	
	@Column(name = "seo", nullable = true)
	private Integer seo;

	@Column(name = "short_description", length = 2000, nullable = true)
	private String shortDescription;

	@Column(name = "detail_description", length = 1000, nullable = true)
	private String detailDescription;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "create_by", referencedColumnName = "id")
	private User userCreateProduct;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "update_by", referencedColumnName = "id")
	private User userUpdateProduct;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Product(String name, String avatar, BigDecimal price, BigDecimal salePrice, Integer isHot, Integer seo,
			String shortDescription, String detailDescription, Category category, User userCreateProduct,
			User userUpdateProduct) {
		super();
		this.name = name;
		this.avatar = avatar;
		this.price = price;
		this.salePrice = salePrice;
		this.isHot = isHot;
		this.seo = seo;
		this.shortDescription = shortDescription;
		this.detailDescription = detailDescription;
		this.category = category;
		this.userCreateProduct = userCreateProduct;
		this.userUpdateProduct = userUpdateProduct;
	}



	public Integer getIsHot() {
		return isHot;
	}



	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}



	public Integer getSeo() {
		return seo;
	}



	public void setSeo(Integer seo) {
		this.seo = seo;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getisHot() {
		return isHot;
	}

	public void setisHot(Integer isHot) {
		this.isHot = isHot;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUserCreateProduct() {
		return userCreateProduct;
	}

	public void setUserCreateProduct(User userCreateProduct) {
		this.userCreateProduct = userCreateProduct;
	}

	public User getUserUpdateProduct() {
		return userUpdateProduct;
	}

	public void setUserUpdateProduct(User userUpdateProduct) {
		this.userUpdateProduct = userUpdateProduct;
	}


	
}
