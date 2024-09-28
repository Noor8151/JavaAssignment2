package PatternCode;

public class Pattern27 {

	public static void main(String[] args) {
		int i, j;
		int n = 3;

		for (i = 1; i <= n; i++) {

			for (j = 1; j < i; j++) {
				System.out.print("0");
			}

			for (j = i; j <= n; j++) {
				if (j == i || j == n)
					System.out.print("* ");
				else
					System.out.print(" 0");
			}

			System.out.println();
		}

		for (i = n - 1; i >= 1; i--) {

			for (j = 1; j < i; j++) {
				System.out.print("0");
			}

			for (j = i; j <= n; j++) {
				if (j == i || j == n)
					System.out.print("* ");
				else
					System.out.print("0 ");
			}

			System.out.println();
		}
	}

}
