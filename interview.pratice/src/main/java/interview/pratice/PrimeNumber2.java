package interview.pratice;

public class PrimeNumber2 {
	
	

	public static void main(String[] args) {
		
	int	n = 50;
	boolean prime = true;
	for(int i = 2; i< n; i++)
		
	{
	
        if(n % i == 0)
    
		 {
			prime = false;
			break;
		}
	}
       System.out.println(prime);
	}
}