package Assignment1;

import java.util.Scanner;

public class UserPass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String username;
		System.out.println("Enter Username:");
		username=sc.next();
		
		String passcode;
		System.out.println("Enter Password:");
		passcode=sc.next();
		
		if(username.contains("Mushtaq") && passcode.contains("Cho2")) {
			System.out.println("login sucessfull");
		}
		else
			System.out.println("Login failed ");

	}

}
