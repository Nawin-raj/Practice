package assignment_27nov;

import java.util.Scanner;

/**
 * @author nawin
 * @version 10.00
 * 
 *
 */

public class Pattern {

	private static void printnumbers(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/**
	 * This method is used to print starts
	 *
	 */

	private static void printstars(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(n - i);
			}
			System.out.println();
		}

	}

	/**
	 * This method is used to print Numbers
	 *
	 */

	public static void main(String[] args) {
		// Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		printstars(n);
		printnumbers(n);
	}
}
