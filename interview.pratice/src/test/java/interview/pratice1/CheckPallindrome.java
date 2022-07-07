package interview.pratice1;

	public class CheckPallindrome {

		void getPallindromeCheck(String text) {

			StringBuffer reverText = new StringBuffer(text).reverse();

			System.out.println(reverText);

			if (text.equals(reverText.toString())) {
				System.out.println("Its pallindrome");
			} else {
				System.out.println("Not pallindrome ");
			}

		}

		public static void main(String[] args) {
			
			new CheckPallindrome().getPallindromeCheck("MOM");
		}

	}