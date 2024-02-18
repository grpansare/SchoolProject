package com.sms.models;

import java.util.Collection;

import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name="Users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int userid;
	@Column(length=30)
	private String firstname;
	@Column(length=30)
	private String username;
	
	@Column(length=30)
	private String lastname;
	@Column(length=30)
	private String email;
	@Column(length=30)
	private String password;
	@Column(length=50)
	private String address;
	@Column(length=15)
	private String contact;
	@Column(length=10)
	private String gender;
	private boolean enable=true;
	private String profile;
	
	private String  roleName;
	
	
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public User(int userid, String firstname, String username, String lastname, String email, String password,
			String address, String contact, String gender, boolean enable, String profile, String roleName) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.username = username;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact=contact;
		this.gender = gender;
		this.enable = enable;
		this.profile = profile;
		this.roleName = roleName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", username=" + username + ", lastname="
				+ lastname + ", email=" + email + ", password=" + password + ", address=" + address + ", contact="
				+ contact + ", gender=" + gender + ", enable=" + enable + ", profile=" + profile + ", roleName="
				+ roleName + "]";
	}

	
	

	
	

}
