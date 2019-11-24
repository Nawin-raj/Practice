package Solutions;
import java.util.Scanner;

class Ele_Bill {
	public static void main(String args[]) {
		long units;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of units");

		units = sc.nextLong();

		double billpay = 0;

		if (units <= 100)
			billpay = units * 5;

		else if (units <= 300)
			billpay = 100 * 5 + (units - 100) * 10;

		else if (units > 300)
			billpay = 100 * 5 + 200 * 10 + (units - 300) * 20;

		System.out.println("Bill to pay : " + billpay);
	}
}