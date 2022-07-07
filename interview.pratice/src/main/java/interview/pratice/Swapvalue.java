package interview.pratice;

public class Swapvalue {
	
	
		public void getSwap(int a, int b){
		System.out.println( "Before swap a value ="+a) ;
		System.out.println("Before swap b value ="+b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out .println( "After swap a value ="+a) ;
		System.out .println("After swap b value ="+b);


		}

		public static void main (String[]args){
		new Swapvalue().getSwap(10 ,20);
		}


		}


