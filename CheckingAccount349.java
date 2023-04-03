/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
//	(1）在上面类的基础上扩展新类 CheckingAccount 对每次存款和取款都收取1美元的手续费
//	(2）扩展前一个练习的 BankAccount 类，新类 SavingsAccount 每个月都有利息产生
//	( earnMonthlylnterest 方法被调用），并且有每月三次免手续费的存款或取款。
//在 earnMonthlylnterest 方法中重置交易计数
//	(3）体会重写的好处
class CheckingAccount349 extends BankAccount349 {
	public CheckingAccount349(double balance) {
		super(balance);
		// TODO 自动生成的构造函数存根
	}
	@Override
	//重写存款
	public void deposit(double amount) {
		// TODO 自动生成的方法存根
		super.deposit(amount-1);
	}
	@Override
	public void withdraw(double amount) {
		// TODO 自动生成的方法存根
		super.withdraw(amount+1);
	}
}
