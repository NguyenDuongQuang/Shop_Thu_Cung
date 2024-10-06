package vn.devpro.javaweb30.model;

import java.sql.Date;

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

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, Date createDate, Date updateDate, Boolean status) {
		super(id, createDate, updateDate, status);
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, String name, String mobile, String email, String address,
			String avatar, String description) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.avatar = avatar;
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
