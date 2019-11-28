package Solutions;

import java.util.Scanner;

class Account {
	static String bank_name = "SBI BANK";
	String user_name;
	int acunt_no;
	double money;

	public Account(String name, int num) {
		this.user_name = name;
		this.acunt_no = num;
	}

	public void deposit(int amount) {
		money = +amount;
		System.out.println("Availabe Balance after deposit is " + money + "\n");

	}

	/**
	 * This method is used to desposit money
	 *
	 */

	public void withdraw(int amount) throws ISF {
		if (money < amount) {
			throw new ISF();
		} else {
			money -= amount;
			System.out.println("Availabe Balance after withdraw is " + money);
		}
	}

	/**
	 * This method is used to withdraw money
	 *
	 */

	public void show() {

		System.out.println("Current blnc in  account is  " + money + "\n");
	}

	/**
	 * This method is used to show available money
	 *
	 */

	public void transfer(int amount, Account vinod) throws ISF {

		try {
			if (money < amount) {
				throw new ISF();
			} else {
				money -= amount;
				vinod.money = +amount;
				System.out.println("Current blnc in " + user_name + " account after transfer  " + money);
				System.out.println("balance in vinod account is " + vinod.money);
			}
		} catch (ISF e) {
			System.out.println("You have insufficient funds to transfer");
			System.out.println("please maintain blnc....");
		}

	}

	/**
	 * This method is used to Transfer money
	 *
	 */

	public void welcome(int pin) {

		if (pin == 1) {
			System.out.println("Welcome to " + bank_name + " " + user_name + "\n");
		}

	}

	public void logout() {
		System.out.println("Logged out.....");

	}

}

class ISF extends Exception {
	public ISF() {
		super();
	}
}

/**
 * This class is used to throw custom exceptions and we are extending it with {@
 * Exception} class
 *
 */

public class Bank {

	public static void main(String[] args) throws ISF {
		Account nawin = new Account("Naveen", 123);
		Account vinod = new Account("Vinodh", 456);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin to display details:");
		int pin = sc.nextInt();
		nawin.welcome(pin);
		System.out.println("Enter 2 to show balance:");
		int show = sc.nextInt();
		if (show == 2) {
			nawin.show();
		}
		System.out.println("Enter amount of money to deposit:");
		int cash = sc.nextInt();
		nawin.deposit(cash);
		System.out.println("Enter amount of money to withdraw:");
		int cash_draw = sc.nextInt();
		nawin.withdraw(cash_draw);
		System.out.println("Enter amount of money to transfer:");
		String user_name = sc.nextLine();
		int cash_trans = sc.nextInt();
		nawin.transfer(cash_trans, vinod);
		nawin.logout();

	}

}
