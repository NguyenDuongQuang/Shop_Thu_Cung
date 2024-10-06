package vn.devpro.javaweb30.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_category")
public class Category extends BaseModel {

	@Column(name = "name", length = 300, nullable = true)
	private String name;

	@Column(name = "description", length = 300, nullable = true)
	private String description;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "create_by", referencedColumnName = "id")
	private User userCreateCategory;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "update_by", referencedColumnName = "id")
	private User userUpdateCategory;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Integer id, Date create_date, Date update_date, Boolean status) {
		super(id, create_date, update_date, status);
		// TODO Auto-generated constructor stub
	}

	public User getUserCreateCategory() {
		return userCreateCategory;
	}

	public void setUserCreateCategory(User userCreateCategory) {
		this.userCreateCategory = userCreateCategory;
	}

	public User getUserUpdateCategory() {
		return userUpdateCategory;
	}

	public void setUserUpdateCategory(User userUpdateCategory) {
		this.userUpdateCategory = userUpdateCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category(String name, String description, User userCreateCategory, User userUpdateCategory) {
		super();
		this.name = name;
		this.description = description;
		this.userCreateCategory = userCreateCategory;
		this.userUpdateCategory = userUpdateCategory;
	}

}
