package vn.devpro.javaweb30.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class BaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "create_date", nullable = true)
	private Date create_date;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "update_date", nullable = true)
	private Date update_date;

	@Column(name = "status", nullable = true)
	private Boolean status = Boolean.TRUE;

	public BaseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseModel(Integer id, Date create_date, Date update_date, Boolean status) {
		super();
		this.id = id;
		this.create_date = create_date;
		this.update_date = update_date;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
