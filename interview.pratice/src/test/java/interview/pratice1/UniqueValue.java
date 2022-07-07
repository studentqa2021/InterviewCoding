package interview.pratice1;

import java.util.Arrays;

public class UniqueValue {
	public static void main(String[] args) {
		int []id = {2,3,4,5,4,4,5,3,4,2,6,6,7};
		Arrays.sort(id);
		
		int firstNumber= id[0];
		//System.out.println("remove duplicate id or unique id="+firstNumber);
		for(int i = 1;i<id.length; i++) {
		if(id[i]!= firstNumber) {
			System.out.println("remove duplicate id or unique id="+firstNumber);
		}
			firstNumber = id[i];
		}
	}
	

}
