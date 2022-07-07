package interview.pratice;

public class PracticeStringBuffer {
	
public static void main(String[] args) {
	
	String name="United states of";
	StringBuffer obj=new StringBuffer(name);
	String reverse=obj.reverse().toString();
	if(name.equalsIgnoreCase(reverse)) {
		System.out.println("palindrome");
	}
	else {
	System.out.println("not a palindrom");}
}	

}
