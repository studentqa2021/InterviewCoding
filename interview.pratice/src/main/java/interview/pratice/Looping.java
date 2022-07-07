package interview.pratice;

public class Looping {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = (a.length) - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
			if (a[i] == 7) {
				System.out.println();
			}
			if (a[i] == 4) {
				System.out.println();
			}
			if (a[i] == 2) {
				System.out.println();
			}

		}

	}
}
