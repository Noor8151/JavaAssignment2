package PattanJava;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 5;
		int col = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" " + i + " ");
			}
			System.out.println();
		}
	}

}
