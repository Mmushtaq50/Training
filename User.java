package Assignment1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public static void main(String[] args) {
	
	User m = new User("Mushtaq","0582");
	m.Menu();
	
}

public class User {
	
	int balance;
	String userName;
	String userId;	
	
	 User( String Name, String Id) {
		 userName=Name;
		 userId=Id;
	}
	
	void Credit(int amount)
	{
		if(amount != 0) {	// the number should not be Negative
			balance = balance + amount;
			System.out.println("Transaction  done on " +LocalDateTime.now()+": Amount Credited to Account Sucessfully: Remaining Amount:" +balance);
		}
		else
			System.out.println("Amount cannot be Negative");
	}
	
	void Debit(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			System.out.println("Transaction  done on " +LocalDateTime.now()+": Amount Debited from Account Sucessfully: Remaining Amount:" +balance);
		}
		else{
			if(amount < balance) {
				System.out.println("Insufficient Funds");
			}
		}
		
		
	}
	
	void Menu() {
		char option='\0';
		System.out.println("Welcome dear User"+userName);
		System.out.println("A. Your Id id :"+userId);
		System.out.println();
		System.out.println("B. Show Balance");
		System.out.println("C. Credit");
		System.out.println("D. Debit");
		System.out.println("E. Exit");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter an Option:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Scanner sc=new Scanner(System.in); 
		option=sc.next().charAt(0);
		System.out.println();
		
		do
		{
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
				int amount=sc.nextInt();
				Credit(amount);
				System.out.println();
				break;
				
			case 'D':
				int amount1 = sc.nextInt();
				Debit(amount1);
				System.out.println();
				break;
				
	
			default:
				System.out.println("Invalid Option! Try Again");
				break;
			}
			
			
		}while(option != 'E');
		{
			System.out.println("Exit");
		}
	}
}

