package Assignment1;

import java.util.Scanner;

public class ArrayDiagonals {

	public static void main(String[] args) {
		
		int[][] arr = { {1,3,2} ,
						{6,4,5} , 
						{7,4,8} };
		
		int size=arr.length;
		
		 System.out.print("Left Diagonal Elements: ");
		 for (int i = 0; i < size; i++) {
	            for (int j = 0; j <size; j++) {
	 
	                // Condition for left diagonal
	                if (i == j) {
	                    System.out.print(arr[i][j] + " ");
	                }
	            }
	        
		 	}
		 
		 System.out.println();
		 
		 System.out.print("Right Diagonal Elements: ");
		 
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	 
	                // Condition for secondary diagonal
	                if ((i + j) == (size - 1)) {
	                    System.out.print(arr[i][j] + " ");
	                }
	            }
	        }

		}
}
