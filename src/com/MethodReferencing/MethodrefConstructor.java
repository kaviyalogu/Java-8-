package com.MethodReferencing;

public class MethodrefConstructor {

	public static void main(String[] args) {

		
		IUser iuser = User :: new;
		User u = iuser.getuser("kaviya");
		System.out.println(u.getName());
	}

}

@FunctionalInterface
interface IUser{
	User getuser(String name); 
}

class User{
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
