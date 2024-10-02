package vn.devpro.javaweb30.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "tbl_category")
public class Category extends BaseModel {

	@Column(name = "name", length = 300, nullable = true)
	private String name;

	@Column(name = "description", length = 300, nullable = true)
	private String description;
}
