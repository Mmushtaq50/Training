package Test1;

import java.util.Arrays;
import java.util.Random;

public class program4 {
	
	
	public static void main(String[] args) {
		
		  int[] value = {1, 2, 3, 4, 5, 6, 7, 8};
		  
	         int b = value.length;
	         rand (value, b);
		
	}

	 static void rand( int array[], int a)
	    {
		 											
	        Random rd = new Random();	// Creating object for Random class
	         
	        														
	        for (int i = a-1; i > 0; i--) {			// Starting from the last element and swapping one by one.
	             
	            												     
	            int j = rd.nextInt(i+1);		 // Pick a random index from  array 0 to i
	             
	            													
	            int temp = array[i];			// Swap array[i] with the element at random index
	            array[i] = array[j];
	            array[j] = temp;
	        }
	        														
	        System.out.println(Arrays.toString(array));		// Printing the random generated array
	    }
		
		
     
		
	}



