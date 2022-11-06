package be.pxl.ja.h9_multithreading.oefening3;

import java.io.BufferedWriter;

public class BankAccount {
	private int balance;
	private String accountNumber;
	private BufferedWriter logger;
	
	public BankAccount(String accountNumber, int initialBalance, BufferedWriter logger) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		this.logger = logger;
	}
	
	public void deposit(int amount, String user) {
		// TODO
	}

	public void withdraw(int amount, String user) {
		// TODO
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
