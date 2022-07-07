package interview.pratice1;

import java.util.Arrays;

public class PracticeArray {
	public static void main(String[] args) {
	int [] age 	= {30,26,27,26,30,40,45,50,40,45};
	System.out.println("Actual array="+Arrays.toString(age));
		
		Arrays.sort(age);
		System.out.println("Asc order or sortung="+Arrays.toString(age));
		
		int firstValue = age[0];
		System.out.println("unique value ="+firstValue);
		
		 for(int i=1;i<age.length;i++) {
			if (firstValue!=age[i]) {
				System.out.println("Unique value="+age);
			}
			firstValue =age[i];
		 }
		 
		 }
		 
		 
	}
	
	


