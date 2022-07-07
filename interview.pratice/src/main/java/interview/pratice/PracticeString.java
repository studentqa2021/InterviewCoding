package interview.pratice;

public class PracticeString {
	
	public static void getValue() {
	String name="Capital123one";
	//System.out.println(name.length());
	//int number[]=new int[500];
	//float value[]=new float[1000];
	
	char letters[]=new char[13];
	for(int i=0;i<13;i++) {
    if (Character.isDigit(name.charAt(i))){
    System.out.print(name.charAt(i));
    
    }
    else {
    	letters[i]=name.charAt(i);
    	
    }
    
	}		
	System.out.println();	
	System.out.println(letters);
	}

		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getValue();

	}

}
