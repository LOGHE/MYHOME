/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class BankAccount349 {//父类
	private double  balance;
	//余额
	public BankAccount349(double balance) {
		super();
		this.balance = balance;
	}
	//存款
	public void deposit(double amount) {
		balance += amount;
	}
	//取款
	public void withdraw(double amount) {
	 	 balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
