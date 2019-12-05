package com.exception;

import java.util.Scanner;

class BalanceException extends Exception {
	public BalanceException(String str) {
		super(str);

	}

}

public class Hdfc implements Bank {
	private int balance;

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("you deposited "+balance+" rupees\n");

	}

	public void withdraw(int amount) {
		try {
			if (balance < amount) {
				throw new BalanceException("*******Insufficient funds in account*******\n");
			} else {
				balance = balance - amount;
				System.out.println(balance+" rupees"+" is debited");

			}
		} catch (BalanceException custom) {
			System.out.println(custom.getLocalizedMessage());

		}

	}

	public static void main(String[] args) {
		Hdfc obj = new Hdfc();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter amount of money you want to deposit");
		int amount=sc.nextInt();
		obj.deposit(amount);
		System.out.println("Please enter amount of money you want to withdraw");
		int debit=sc.nextInt();
		obj.withdraw(debit);

	}

}
