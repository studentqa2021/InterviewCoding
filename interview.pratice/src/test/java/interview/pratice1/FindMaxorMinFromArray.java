package interview.pratice1;

import java.util.Arrays;

public class FindMaxorMinFromArray {
		
	public static void getmaxorMin(int[]myArray){
		
		int max =Arrays.stream(myArray).max().getAsInt();
		System.out.println("Max value ="+max);
		
		int secondmax =Arrays.stream(myArray).filter(i->(i<max)).max().getAsInt();
		System.out.println(secondmax);
		
		int thirddmax =Arrays.stream(myArray).filter(i->(i<max)).max().getAsInt();
		System.out.println(thirddmax);
		
		
		
		
		int min =Arrays.stream(myArray).min().getAsInt();
		System.out.println("Min value ="+min);
		
		
		
	}
			
	
	
	public static void main(String[] args) {
	int []myArray = {3,6,22,44,55};
	FindMaxorMinFromArray.getmaxorMin(myArray);
}
}
