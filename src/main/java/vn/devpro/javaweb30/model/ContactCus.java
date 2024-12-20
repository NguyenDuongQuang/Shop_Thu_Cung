package vn.devpro.javaweb30.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_contact")
public class ContactCus extends BaseModel{
	@Column(name = "firstname", length = 120, nullable = true)
	private String firstName;
	
	@Column(name = "lastname", length = 120, nullable = true)
	private String lastName;
	
	@Column(name = "mobile", length = 60, nullable = true)
	private String mobile;
	
	@Column(name = "email", length = 200, nullable = true)
	private String email;
	
	@Column(name = "address", length = 300, nullable = true)
	private String address;
	
	@Column(name = "request_type",length = 300, nullable = true)
	private String requestType;
	
	@Column(name = "message", length = 1200, nullable = true)
	private String message;

	public ContactCus() {
		super();
	}

	public ContactCus(Integer id, Date createDate, Date updateDate, Boolean status, String firstName, String lastName,
			String mobile, String email, String address, String requestType, String message) {
		super(id, createDate, updateDate, status);
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.requestType = requestType;
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
