package assignment_22nov;

import java.util.Scanner;

public class PrintFibonacci {
	public static void printFibonacciSeries(int n) {
		int a = 0, b = 1, c = 1, d = 2;
		int e = 0;
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
		for (int i = 4; i < n; i++) {
			e = a + b + c + d;
			a = b;
			b = c;
			c = d;
			d = e;
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		PrintFibonacci.printFibonacciSeries(n);

	}
}
