package br.com.jdbc.model;

import java.util.Calendar;

public class Contact {
	private Long id;
	private String name;
	private String email;
	private String address;
	private Calendar birthday;
	

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Calendar getBirthday() {
		return this.birthday;
	}
	
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	
}
