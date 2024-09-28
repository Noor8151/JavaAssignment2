package PattanJava;

public class Pattern9 {
	public static void main(String[] args) {

		int row = 5;
		int col = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" " + (int) (i + j) + " ");

			}
			col++;
			System.out.println();
		}
	}

}
