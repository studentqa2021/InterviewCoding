package interview.pratice;

public class Plaindrome {
	
public static void main(String[] args) {
	
String x="mom2";
int i=0, j= x.length()-1;
while(i <j)
{
	if(x.charAt(i)!=x.charAt(j))
	{
		System.out.println("not plaindrom");
		System.exit(0);
	}
	i++;
	j--;
}

	
	System.out.println("plaindrom");
	
}	

}
