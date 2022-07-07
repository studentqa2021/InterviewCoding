package interview.pratice1;

public class MaxorMinOld {
	static int max;
	public static void getmax(int[]myArray) {
		
		for (int i = 0; i<myArray.length;i++) {
			System.out.println(myArray[i]);
			if(myArray[i]>max) {
			max= myArray[i];
			}
			System.out.println(max);
		}
		
}
	
public static void main(String[] args) {
	int[] myArray = {3,6,22,44,55,99};
	MaxorMinOld.getmax(myArray);
}
}
