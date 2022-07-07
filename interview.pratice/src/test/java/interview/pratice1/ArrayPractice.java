package interview.pratice1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayPractice {
	
	 
	   public static void main(String[] args) {
		int [] number = {2,3,4,2,3,4,5,6,6};	
   
	 
	 Set<Integer> myHashSet =new HashSet<>();
	 for(int i =0;i< number.length; i++) {
		myHashSet.add(number[i]) ;
	 }
	 
	 System.out.println(myHashSet);
	 
	  
	 
   
   for(int i= 0;i<number.length;i++) {
	 for(int j=(i+1);j<number.length;i++) {
		if(number[i]== number[j]) {
		System.out.println("Duplicats Valu="+number[i]);
		break;
		}
	 }  
   
	 }
   
   }
   
 
}


   
   