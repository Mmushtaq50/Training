package Assignment1;

import java.util.Scanner;

public class DimondStarPattern {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of line /n (Make sure the number is ODD)");
		Scanner sc=new Scanner(System.in);
		
		int Nlines =sc.nextInt();
		
		int mid =(Nlines+1)/2;   /* let Nlines =7 ;min =(7+1)/2 ;mid =4;
									so mid line should have 7 starts and no spaces */
		//Upper Traingle
		for(int i=1;i<=mid;i++) {   //i for both Traingles
			
			//For spaces							
				
			for(int s=1; s <=(mid-i); s++) {
				 System.out.print(" ");
			}
			
			//For stars
			for(int j=1; j <=(i*2 - 1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//Lower Traingle 
											/* if Nlines=7 ;min =(7+1)/2 ;mid =4
		 									when mid =4 ,upper traingle will have 3 lines 
		 									and lower traingle will also have 3 lines,
		 									which is mid-1 = 4-1 = 3 */
		for(int i=1 ;i <=(mid-1); i++) {
			
			// Spaces
			for(int s=1 ;s<=i ;s++) {
				System.out.print(" ");
			}
			
			// Stars								//if order to obtain relation according to algorith 
			for(int j=1; j<=2*(mid-i)-1; j++){		// 2*(mid-i)-1 =2*(5-1)-1=7 
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}

/*
						
						Upper Traingle
 
 i		j		s			
 1		1		4			*
 2		3		3		     *	*  *
 3		5		2		  *  *  *  *  *
 4		7		1              *  *  *  *  *  *  *
 5		9		0	    *  *  *  *  *  *  *  *  *



 1		7		1	       *  *  *  *  *  *  *
 2     		5		2		  *  *  *  *  *  
 3		3		3		     *  *  *
 4		1		4			*
						Lower Traingle
						
	*/					
						





