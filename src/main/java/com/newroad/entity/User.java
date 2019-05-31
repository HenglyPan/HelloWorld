package com.newroad.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


@SuppressWarnings("serial")
public class User implements Serializable{
	@NotNull
	private String username;
	@NotEmpty(message="{password.empty.message}")
	private String password;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	//@JsonFormat(pattern="yyyy-MM-dd")
	private Date time;
	
	
	public User(String username, String password, Date time) {
		super();
		this.username = username;
		this.password = password;
		this.time = time;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
	}
	public User() {
		super();
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
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", time=" + time + "]";
	}
	

}
