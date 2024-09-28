package PattanJava;

public class Pattern16 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;

		for (int i = 0; i <= row; i++) {
			int l = 5;
			for (int k = 1; k <= col; k++) {
				System.out.print(l-- + " ");

			}
			col--;

			System.out.println();
		}

	}

}
