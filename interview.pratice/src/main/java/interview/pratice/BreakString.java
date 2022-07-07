package interview.pratice;

import java.util.Arrays;

public class BreakString {
	static String country ="Unitedstateamerica ";
	public static void main(String[] args) {
		
		//String [] pieces =country.split(" ");
		String s = country.substring(0,6);
		//System.out.println(Arrays.toString(pieces));
		System.out.println(s);
	}
	
	
}