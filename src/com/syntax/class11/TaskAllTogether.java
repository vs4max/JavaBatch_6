package com.syntax.class11;

import java.util.Scanner;

public class TaskAllTogether {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password from a user and check
		 * following requirements:
		 * 
		 * Username and Password cannot be empty, if so→ message=“Username and Password
		 * cannot be empty”. Password should be minimum 8 characters, if less →
		 * message=“Password is too short”. Password cannot contain username if so, →
		 * message=“Password cannot contain username”. Password should match confirmed
		 * password, if not → message=“Passwords do not match”.
		 * 
		 * Only after all requirements met → message “Your username and password has
		 * been created”
		 */

		String username;
		String password;
		String confirmpassword;
		String message;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		username = scan.nextLine();
		
		System.out.println("Please enter your password");
		password = scan.nextLine();


		if (!(username.isEmpty()) || !(password.isEmpty())) {
			message="Let's proceed";
			
			if (password.length() >= 8) {
				
			if (password.contains(username)) {
					
				System.out.println("Please confirm password");
				confirmpassword=scan.nextLine();
				
				if (password.equals(confirmpassword)) {
					System.out.println("Your accaunt is created");
				}else {
					System.out.println("Password is NOT matched");
				}
				
			}else {
				System.out.println("Password cannot contain username");
			}
		} else {
			System.out.println("Password is too short");
		}
		} else {
			System.out.println("Username and Password cannot be empty");
		}
	}
	}

