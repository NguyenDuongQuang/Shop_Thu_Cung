package vn.devpro.javaweb30.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User extends BaseModel {
	@Column(name = "username", length = 120, nullable = true)
	private String username;

	@Column(name = "password", length = 120, nullable = true)
	private String password;

	@Column(name = "name", length = 120, nullable = true)
	private String name;

	@Column(name = "mobile", length = 120, nullable = true)
	private String mobile;

	@Column(name = "email", length = 40, nullable = true)
	private String email;

	@Column(name = "address", length = 300, nullable = true)
	private String address;

	@Column(name = "avatar", length = 300, nullable = true)
	private String avatar;

	@Column(name = "description", length = 450, nullable = true)
	private String description;

}
