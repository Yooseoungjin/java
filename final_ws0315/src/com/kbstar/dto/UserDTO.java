package com.kbstar.dto;

public class UserDTO {
	private String id;
	private String pwd;
	private String name;
	private String contact;

	public UserDTO() {
	}

	public UserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public UserDTO(String id, String pwd, String name, String contact) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name +  ", contact=" + contact
				+ "]";
	}

}
