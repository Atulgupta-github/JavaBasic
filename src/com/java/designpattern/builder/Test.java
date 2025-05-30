package com.java.designpattern.builder;

public class Test {
	
	public static void main(String args[]) {
		
		User user = new User.UserBuilder()
			    .setUserId("123")
			    .setName("Atul Gupta")
			    .setAddress("Delhi")
			    .setEmail("atul@example.com")
			    .build();
		
		System.out.println(user.toString());
	}

}
