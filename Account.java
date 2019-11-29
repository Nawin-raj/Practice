package com.Users;

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.UUID;

import com.bank.Bank;

public class Account implements Bank {
	private String bank_name;
	private int account_no;
	private String user_name;
	private double blnc;
	static Hashtable<LocalDate, String> transaction = new Hashtable<LocalDate, String>();

	private Account(String bank_name, int account_no, String user_name) {

		this.bank_name = bank_name;
		this.account_no = account_no;
		this.user_name = user_name;
	}

	private Account() {

	}

	/**
	 * getters and setters
	 *
	 */
	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * This method is used to deposit money
	 *
	 */
	public void deposit(int amount) {
		blnc = +amount;
		System.out.println("You have deposited " + amount + " Rupees\n");
		System.out.println("Available money after deposited " + blnc + " Rupees\n");
	}

	/**
	 * This method is used to with draw money
	 *
	 */
	public void withdraw(int amount) {
		blnc -= amount;
		System.out.println("Available money after withdraw is " + blnc + " Rupees\n");
	}

	/**
	 * Shows the available money
	 *
	 */
	public void showBlnc() {

	}

	/**
	 * Generate a transaction is using String uniqueID =
	 * UUID.randomUUID().toString(); Store the transaction id in Hashtable with name
	 *
	 */
	public void transfer(int amount, Account vinod) {

		vinod.blnc = +amount;
		System.out.println(vinod.blnc);
		String uniqueID = UUID.randomUUID().toString();
		LocalDate date = LocalDate.of(2019, 11, 28);
		transaction.put(date, uniqueID);
		

	}

	/**
	 * This method shows the transactions
	 *
	 */
	public void view_transactions(Hashtable<LocalDate, String> hash) {
		hash.forEach((k,v)->System.out.println("Transcation date was "+k+ " and "+ "Transaction ID is "+v));
		
		
		
	}
	public static void main(String[] args) {
		Account nawin = new Account("HDFC", 112233, "NaveenKumar");
		Account vinod = new Account();
		nawin.deposit(100);
		nawin.withdraw(10);
		nawin.transfer(10, vinod);
		nawin.transfer(20, vinod);
		
		nawin.view_transactions(transaction);
		

	}

	

}
