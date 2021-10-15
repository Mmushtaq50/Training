package Test1;

public class program3 {
	
	// Write a array that receives a method and sort it in increasing order 
	
	public static void main(String[] args) {
		
		int[] value = {1,5,2,6,3,7,9,4};
		
		sort(value);

	}

	private static void sort(int[] input) {
		
		int temp=0;
		
		System.out.println("Elements of original array: ");    
        for (int i = 0; i < input.length; i++) {     		////Iterating each and every element through for loop
            System.out.print(input[i] + " ");    
        }    
		
        
        for (int i = 0; i < input.length; i++) {     
            for (int j = i+1; j < input.length; j++) {     
               if(input[i] > input[j]) {    
                    temp = input[i];    
                   input[i] = input[j];    
                   input[j] = temp;    
               }     
            }     
        }    
        
       System.out.println();
        
       System.out.println("Elements after sorting in Increasing way ");
       for (int i = 0; i < input.length; i++) {     
           System.out.print(input[i] + " ");    
       }    
	}

}
