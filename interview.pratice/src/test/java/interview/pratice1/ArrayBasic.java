package interview.pratice1;

import java.util.Arrays;

public class ArrayBasic {
	
	public static void main(String[] args) {
		//int a = 10;
		int [ ]myArray = {1,2,3,4,5,6,};
		//System.out.println(0);
		//System.out.println(2);	
		//System.out.println(myArray[3]);	
		//try {
			///System.out.println(3);
			
		//} catch(excepation e);
		
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		for(int a:myArray) {// enhance for loop
		System.out.println(a);	
			
		}
		Arrays.stream(myArray).forEach( i -> {
			
		System.out.println(i);
	
		});
	}

}
