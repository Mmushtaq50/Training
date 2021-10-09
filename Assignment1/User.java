package Assignment1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
	
public static void main(String[] args) {
	
	User m = new User("Mushtaq","0582");
	m.Menu();
}

	int balance = 5000;
	String userName;
	String userId;	
	
	 User( String Name, String Id) {
		 userName=Name;
		 userId=Id;
	}
	
	public void Credit(int amount)
	{
		if(amount > 0) {	// The number should not be Negative
			balance = balance + amount;
			System.out.println("Transaction  done on "+LocalDateTime.now().toLocalDate()+": Amount Credited to Account Sucessfully: Remaining Amount:" +balance);
		}
		else
			System.out.println("Amount cannot be Negative");
	}
	
	public void Debit(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Transaction  done on "+LocalDateTime.now().toLocalDate()+": Amount Debited from Account Sucessfully: Remaining Amount:" +balance);
		}
		else{
			if(amount > balance) {
				System.out.println("Insufficient Funds");
			}
		}
			
	}
	
	public void Menu() {
		
		char option='\0';
		System.out.println("Welcome Dear User : "+userName);
		System.out.println("A. Account Id");
		System.out.println("B. Show Balance");
		System.out.println("C. Credit");
		System.out.println("D. Debit");
		System.out.println("E. Exit");
		System.out.println("__________________________________");
		
		System.out.print("Enter an Option:");
		
		Scanner sc =new Scanner(System.in); 
		option=sc.next().charAt(0);
		System.out.println();
		
		while(option != 'E') {
			switch(option) {
			case 'A':
				System.out.println("Your Bank Account ID : "+userId);
				option = 'E';	
				break;
				
			case 'B':
				System.out.println("Your Bank Balance:"+balance);
				option = 'E';					//Break from the while loop 
				break;
				
			case 'C':
				System.out.println("Please enter amount to credit:");
				int amount=sc.nextInt();
				Credit(amount);
				option = 'E';	
				break;
				
			case 'D':
				System.out.println("Please enter amount to debit:");
				int amount1 = sc.nextInt();
				Debit(amount1);
				option = 'E';	
				break;
				
			default:
				System.out.println("Invalid Option");
				break;
			}	
		}
		if(option == 'E') {
			System.out.println("Exiting From the System.");
		}
	}
}
