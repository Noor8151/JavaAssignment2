package PattanJava;

public class Pattern17 {

	public static void main(String[] args) {
		int row = 5;
		int sp = 0;
		int st = 5;

		for (int i = 0; i < row; i++) {

			for (int k = 0; k < sp; k++) {
				System.out.print(" ");

			}
			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}
			sp++;
			st--;
			System.out.println();
		}

	}

}
