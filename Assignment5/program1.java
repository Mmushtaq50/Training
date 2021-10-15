package Test1;

//write a method that recives a character array and returs the no of symbols in an array

public class program1 {

	public static void main(String[] args) {
		
		char[] sheet= {'M','u','$','h','t','@','q'};
		
		display(sheet);
	}

	private static char display(char[] input) {
		
		 for(int i=0 ; i < input.length ; i++) { 	////Iterating each and every element through for loop
			 System.out.println(input[i]);
		 }
		return 0;
		
	}
}
