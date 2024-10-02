package vn.devpro.javaweb30.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_role")
public class Role extends BaseModel {
	@Column(name = "name", length = 300, nullable = true)
	private String name;

	@Column(name = "description", length = 450, nullable = true)
	private String descriptione;
}
