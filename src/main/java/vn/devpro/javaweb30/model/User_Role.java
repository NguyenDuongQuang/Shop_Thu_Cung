package vn.devpro.javaweb30.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user_role")
public class User_Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id", referencedColumnName = "id")
	private Role role;
}
