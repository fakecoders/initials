package com.initials.utils;

public class Users {
	private int id;
	
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		Users u = new Users();
		u.setId(1);
		u.setName("lalit");
		System.out.println(u);

}
}
