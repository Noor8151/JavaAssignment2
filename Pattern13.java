package PattanJava;

public class Pattern13 {

	public static void main(String[] args) {
	
			int row = 3;
			int col = 6;
			int space =2;
			int star = 1;
			int a=1;
			for (int i = 0; i <=row; i++) {

				for (int k = 0; k < space; k++) {
					System.out.print(" ");

				}

				for (int l = 0; l < star; l++) {
					System.out.print(a+l+i+" ");

				}
				space--;
				star++;

				System.out.println();
			}

		}

	}


