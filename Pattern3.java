package PattanJava;

public class Pattern3 {

	public static void main(String[] args) {

		char row = 5;
		int col = 5;
		char a = 'A';
		for (char i = 0; i < 5; i++) {
			for (char j = 0; j < 5; j++) {
				System.out.print(" " + (char) (a + i + j) + " ");

			}
			System.out.println();
		}
	}

}
