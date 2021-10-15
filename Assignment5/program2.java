package Test1;

public class program2 {

	//write a method that receives any array of numbers and a key and return true if key value exist in array else false
 	
	public static void main(String[] args) {
		
		int[] value = {1,5,2,6,3,7,9,4};
		
		check(value, 0);
		
	}

	public static boolean check( int[] value, int n) {
		
		int key = value.length;
		
		for(int i = 0; i<key ;i++) {
			
			if(value[n] == key) {
				return true;
			}
		}
		return false;
		
		
	}
}