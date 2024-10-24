package vn.devpro.javaweb30.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_role")
public class Role extends BaseModel{
	@Column(name = "name", length = 200, nullable = true)
	private String name;
	
	@Column(name = "description", length = 500, nullable = true)
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "create_by", referencedColumnName = "id")
	private User userCreateRole;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "update_by", referencedColumnName = "id")
	private User userUpdateRole;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "tbl_user_role",joinColumns = @JoinColumn(name = "role_id"),
	inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users = new ArrayList<User>();
	

	public Role() {
		super();
	}


	public Role(Integer id, Date createDate, Date updateDate, Boolean status, String name, String description,
			User userCreateRole, User userUpdateRole, List<User> users) {
		super(id, createDate, updateDate, status);
		this.name = name;
		this.description = description;
		this.userCreateRole = userCreateRole;
		this.userUpdateRole = userUpdateRole;
		this.users = users;
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


	public User getUserCreateRole() {
		return userCreateRole;
	}


	public void setUserCreateRole(User userCreateRole) {
		this.userCreateRole = userCreateRole;
	}


	public User getUserUpdateRole() {
		return userUpdateRole;
	}


	public void setUserUpdateRole(User userUpdateRole) {
		this.userUpdateRole = userUpdateRole;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	
	
	
}
