package interview.pratice;

public class FindNumberorLetterorSignfromString {

	static String text ="saro33wer123$#";
	public static void main(String[] args) {
		String number =text.replaceAll("\\D", "");
		System.out.println(number);
		
		
		String nonumber = text.replaceAll("\\d", "");
		System.out.println(nonumber);
		
		String noSign = text.replaceAll("\\W", "");
		System.out.println(noSign);
		
		String onlySign = text.replaceAll("\\w", "");
		System.out.println(onlySign);
		
		String onlyletter = text.replaceAll("\\d ", "").replaceAll("\\w", "");
		System.out.println(onlyletter);
	}
}
