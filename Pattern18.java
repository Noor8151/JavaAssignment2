package PattanJava;

public class Pattern18 {

	public static void main(String[] args) {
		int row = 6;
		int sp = 0;
		int st = 5;

		for (int i = 1; i < row; i++) {

			for (int k = 0; k < sp; k++) {
				System.out.print(" ");

			}
			for (int j = 0; j < st; j++) {
				System.out.print(" " + (int) (i + j));
			}
			sp++;
			st--;
			System.out.println();
		}

	}

}
