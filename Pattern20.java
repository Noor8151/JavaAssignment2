package PattanJava;

public class Pattern20 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;

		for (int i = 0; i < row; i++) {

			for (int k = 0; k < col; k++) {
				if (i == 2 || k == 2)
					System.out.print(" * ");
				else
					System.out.print(" 0 ");
			}

			System.out.println();
		}

	}

}
