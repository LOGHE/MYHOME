/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
//(1）在上面类的基础上扩展新类 CheckingAccount 对每次存款和取款都收取1美元的手续费
//(2）扩展前一个练习的 BankAccount 类，新类 SavingsAccount 每个月都有利息产生
//( earnMonthlylnterest 方法被调用），并且有每月三次免手续费的存款或取款。
//在 earnMonthlylnterest 方法中重置交易计数
//(3）体会重写的好处
public class SavingsAccount349 extends BankAccount349 {
		 private int count = 3 ;//每个月免3次手续费
		 private double rate = 0.01;//利率
		 public void earnMonthlylnterest() {//每个月的利息 每个月初我们统计上个月的利息同时将count = 3
			count = 3;
			 super.deposit(getBalance()*rate);
		}
		 @Override
		public void deposit(double amount) {
		// TODO 自动生成的方法存根
			 if (count > 0) {
				 super.deposit(amount);
			}else {
				super.deposit(amount-1);//1快转入银行
			}
			 count--;
		}
		 @Override
		public void withdraw(double amount) {
		// TODO 自动生成的方法存根
			 if (count>3) {
				 super.withdraw(amount);
			}else {
				super.withdraw(amount+1);
			}
			 count--;
		}
		public SavingsAccount349(double balance) {
				super(balance);
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
			
			
}
