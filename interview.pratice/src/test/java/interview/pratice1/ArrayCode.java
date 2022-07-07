package interview.pratice1;

import java.util.Arrays;

public class ArrayCode {
	
public static void main(String[] args) {
	int []id = {2,3,4,4,3,2,5,6,7};
	Arrays.sort(id);
	//System.out.println(Arrays.toString(id));
	
	int firstNumber = id[0];
	for(int i = 1;i< id.length; i++) {
	
		if(id[i]== firstNumber) {
			System.out.println("only duplicate id ="+id[i]);
			}
		firstNumber =id[i];
		}
	}	
	
}	


