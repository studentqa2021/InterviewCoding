package interview.pratice;

public class PrimeNumber {
	
public static boolean isPrime(int n) {
	int m;
	boolean flag=true;
	m=n/2;
	if(n==0||n==1) {
	flag=false;
	
	}
	else {
		for(int i=2;i<=m;i++)
		{
		if(n%i==0)
			flag=false;
		}
		
	}
	return flag;	
}
public static void main(String[] args) {
	System.out.println("i is Prime:"+isPrime(17));
	System.out.println("3 is Prime:"+isPrime(3));
}
}


