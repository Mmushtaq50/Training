package Assignment1;

import java.util.Scanner;

public static void main(String[] args) {
	User obj1=new User("Mushtaq","0582");
	obj1.Menu();
}

public class User {
	private static final String Credit = null;
	private static final String Debit = null;
	int balance;
	String userName;
	String userId;	
	
	 User( String Name, String Id) {
		 userName=Name;
		 userId=Id;
		
	}
	
	void Credit(int amount)
	{
		if(amount != 0) {	// the number should not be negitive
			balance = balance + amount;
		}
		else
			System.out.println("Amount cannot be negitive");
	}
	
	void Debit(int amount) {
		if(amount != 0) {
			balance = balance - amount;
		}
		else{
			if(amount < balance) {
				System.out.println("Insufficient Funds");
			}
		}
		
	}
	
	void Menu() {
		char option='\0';
		Scanner sc=new Scanner(System.in); 
		System.out.println("Welcome dear User"+userName);
		System.out.println("A. Your Id id :"+userId);
		System.out.println();
		System.out.println("B. Show Balance");
		System.out.println("C. Credit");
		System.out.println("D. Debit");
		System.out.println("E. Exit");
		
		
		do
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter an Option:");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			option=sc.next().charAt(0);
			System.out.println();
			
			switch(option) {
			case 'A':
				System.out.println("Your Bank User ID:"+userId);
				System.out.println();
				break;
			case 'B':
				System.out.println("Your Bank Balance:"+balance);
				System.out.println();
				break;
			case 'C':
				System.out.println("Credit:"+Credit);
				System.out.println("The Amount Credited is :");
				int amount=sc.nextInt();
				Credit(amount);
				System.out.println();
				break;
				
			case 'D':
				System.out.println("Debit:"+Debit);
				System.out.println("The Amount Debited is :");
				int amount1 = sc.nextInt();
				Debit(amount1);
				System.out.println();
				break;
				
			case 'E':
				System.out.println("Your Bank User ID:"+userId);
				System.out.println();
				break;
			default:
				System.out.println("Invalid Option! Try Again");
				break;
			}
			
			
		}while(option != 'E');
		{
			System.out.println("Thank You User.....!");
		}
	}
}

