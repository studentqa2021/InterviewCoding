package interview.pratice1;

public class Pallindrom {
	
	void getpallindrom(String text){
		StringBuilder revtext =new StringBuilder(text).reverse ();
		System.out.println(revtext);

		if(text.equals(revtext.toString ())){
		System.out.println("it is pallindrom");

		}else{
		System.out.println("it is not pallindrom");

		}

		}
		public static void main (String[] args ){
		new Pallindrom().getpallindrom("roly");
		}
		}

	


