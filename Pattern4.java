package PattanJava;

public class Pattern4 {

	public static void main(String[] args) {

		int row = 5;
		int col = 5;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" " + (i + j) % 2 + " ");

			}
			System.out.println();
		}
	}

}
