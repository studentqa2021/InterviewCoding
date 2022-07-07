package interview.pratice;

import java.security.DomainCombiner;

public class ReverseString {
	
	void getPallindrom(String text) {
		StringBuffer stext= new StringBuffer(text).reverse();
		
		System.out.println(stext);
		if(text.equals(text.toString())){
			System.out.println("its pallindrom");
			
		}else {
			System.out.println("not pallindrom");
		
	}
		
		
	}
public static void main(String[] args) {
	new ReverseString().getPallindrom("mom");
		
}
}
