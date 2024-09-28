package PattanJava;

public class Pattern12 {

	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		int space = 5;
		int star = 1;
		for (int i = 1; i <=row; i++) {

			for (int k = 0; k < space; k++) {
				System.out.print(" ");

			}

			for (int l = 0; l < star; l++) {
				System.out.print((int) (i + l) +" ");

			}
			space--;
			star++;

			System.out.println();
		}

	}

}
