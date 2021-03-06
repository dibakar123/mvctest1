package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*create table myuser(
username varchar(20) not null primary key,
password  varchar(20),
firstname  varchar(20),
lastname  varchar(20),
email  varchar(20),
address  varchar(20),
phone  varchar(20)
);*/

@Entity
@Table(name="myusers")
public class User {
  @Id
  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String email;
  private String address;
  private String phone;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public User() {
	super();
}

  
}
