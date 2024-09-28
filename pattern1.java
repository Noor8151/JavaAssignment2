package PattanJava;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 1; j < col; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
		}
	}

}
