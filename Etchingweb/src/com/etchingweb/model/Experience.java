package com.etchingweb.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "experience")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "experienceid")
	private int experienceid;
	
	
	@NotEmpty(message = "User name is required.")
	@Column(name = "title")
	private String title;
	
	
	@NotEmpty(message = "User name is required.")
	@Column(name = "company")
	private String company;
	
	@NotEmpty(message = "User name is required.")
	@Column(name = "location")
	private String location;
	
	
	@Column(name = "frommonthyear")
	private Date frommonthyear;
	
	
	@Column(name = "tomonthyear")
	private Date tomonthyear;
	
	@NotEmpty(message = "User name is required.")
	@Column(name = "description")
	private String description;

	@NotEmpty(message = "User name is required.")
	@Column(name = "upload")
	private byte[] upload;
	
	/*
	@ManyToOne
	 @JoinColumn(name ="id")
	 private EtchingIT etchingit;
	 */
	@Column(name = "id")
	private int id;
	 public Experience()
	 {
		 
	 }


	public Experience(int experienceid, String title, String company, String location, Date frommonthyear,
			Date tomonthyear, String description, byte[] upload, int id/*, EtchingIT etchingit*/) {
		super();
		this.experienceid = experienceid;
		this.title = title;
		this.company = company;
		this.location = location;
		this.frommonthyear = frommonthyear;
		this.tomonthyear = tomonthyear;
		this.description = description;
		this.upload = upload;
		this.id=id;
		//this.etchingit = etchingit;
	}


	public int getExperienceid() {
		return experienceid;
	}


	public void setExperienceid(int experienceid) {
		this.experienceid = experienceid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getFrommonthyear() {
		return frommonthyear;
	}


	public void setFrommonthyear(Date frommonthyear) {
		this.frommonthyear = frommonthyear;
	}


	public Date getTomonthyear() {
		return tomonthyear;
	}


	public void setTomonthyear(Date tomonthyear) {
		this.tomonthyear = tomonthyear;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public byte[] getUpload() {
		return upload;
	}


	public void setUpload(byte[] upload) {
		this.upload = upload;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

/*
	public EtchingIT getEtchingit() {
		return etchingit;
	}


	public void setEtchingit(EtchingIT etchingit) {
		this.etchingit = etchingit;
	}
	 
	*/
	
}
