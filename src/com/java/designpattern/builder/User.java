package com.java.designpattern.builder;
// bulider is help for immutable object
public class User {

	private final String userId;
	private final String name;
	private final String address;
	private final String email;
	
	
	private User(UserBuilder builder) {
		this.userId=builder.userId;
		this.name=builder.name;
		this.address=builder.address;
		this.email=builder.email;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	
	
	
	 @Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}



	static class UserBuilder{
		private  String userId;
		private  String name;
		private  String address;
		private  String email;
		
		
		
		
		public UserBuilder() {
			
			// TODO Auto-generated constructor stub
		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return  this;
		}
	
		public UserBuilder setName(String name) {
			this.name = name;
			return  this;
		}
		
		public UserBuilder setAddress(String address) {
			this.address = address;
			return  this;
		}
		
		public UserBuilder setEmail(String email) {
			this.email = email;
			return  this;
		}
		
		
		public User build() {
			User user = new User(this);
			return user;
		}
		
		
	}



	
	
	
}
