package Blogz;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class User {
	
	private String username;
	private String password;
	
	private List<User> users = new ArrayList<User>();
	
	//Constructor
	public User(String username, String password){
		this.username = username;
		this.password = password;
		users.add(new User(username, password));
	}
	
	//method to has the given password
	private static String hashPassword(String pass){
		return pass;
	}
	
	//method to verify password against its hash
	public boolean isValidPassowrd(String password){
		if(password == this.hashPassword(password)){
			return false;
		}
		else{
			return true;
		}
	}
	
	//method to signify if string is valid
	public static boolean isValidUsername(String username){
		if(Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", username)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//method to display user list
	public void userList(){
		for(int i = 0; i < users.size(); i++){
			System.out.println(this.users.get(i));
		}
	}
}
