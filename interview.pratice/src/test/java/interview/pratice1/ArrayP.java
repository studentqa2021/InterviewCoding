package interview.pratice1;

public class ArrayP {

	public static void main(String[] args) {
	//	“Cat dog cat tiger rat cat dog” how do you get output as cat = 3 times, dog = 2 times, tiger =1 time, rat = 1 time.
	String st="Cat dog cat tiger rat cat dog";
	String split []= st.split(" ");
	int catCount = 0;
	int dogCount = 0;
	int tigerCount =0;
	int ratCount =0;
	
	for(int i=0;i<split.length;i++)	{
		if(split[i].equalsIgnoreCase("Cat")) {
	    catCount++;
		
		}else if (split[i].equalsIgnoreCase("dog")) {
			dogCount++;
		}else if (split[i].equalsIgnoreCase("tiger")) {
			tigerCount++;
		}else if (split[i].equalsIgnoreCase("rat")) {
			ratCount++;
		}
	}
		
		System.out.println("Cat= "+catCount+" times");
		System.out.println("dog= "+dogCount+" times");
		System.out.println("tiger = "+tigerCount+" times");
		System.out.println("rat= "+ratCount+" times");
	}
}