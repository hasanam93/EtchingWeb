package com.etchingweb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


	@Entity
	@Table(name = "etching")
	public class EtchingIT 
	{
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private int id;
		
		@NotEmpty
		@Pattern(regexp="[^0-9]+")
		@Size(min=3,max=20)
		@Column(name = "firstname")
		private String firstname;
		
		@NotEmpty
		@Pattern(regexp="[^0-9]+")
		@Size(min=3,max=20)
		@Column(name = "lastname")
		private String lastname;
		
		
		@NotEmpty
		@Column(name = "address")
		private String address;
		
		@NotEmpty
		@Column(name = "state")
		private String state;
		
		
		@NotEmpty
		@Column(name = "city")
		private String city;
		
		
		@NotNull
		@Column(name = "zip")
		private Long zip;
		
		
		@NotNull
		@Min(value = 1000000000)
		@Column(name = "phone")
		private Long phone;
		
		
		@NotEmpty
		@Email
		@Column(name = "email")
		private String email;
		
		
		@NotEmpty
		@Column(name = "password")
		private String password;

		@Transient
		 private List<String> experience;
		
		public List<String> getExperience() {
			return experience;
		}


		public void setExperience(List<String> experience) {
			this.experience = experience;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public Long getZip() {
			return zip;
		}


		public void setZip(Long zip) {
			this.zip = zip;
		}


		public Long getPhone() {
			return phone;
		}


		public void setPhone(Long phone) {
			this.phone = phone;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}
		
		

}
