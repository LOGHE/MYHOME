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
public class HomeWork349 {
	public static void main(String[] args) {
//		CheckingAccount349 c1 = new CheckingAccount349(500);
//		c1.deposit(10);
//		System.out.println(c1.getBalance());
//		c1.withdraw(20);
//		System.out.println(c1.getBalance());
		SavingsAccount349 s1 = new SavingsAccount349(1000);
		s1.deposit(100);//存
		s1.deposit(100);
		s1.deposit(100);
		System.out.println(s1.getBalance());
		s1.withdraw(100);//取
		System.out.println(s1.getBalance());
		//月初 计算利息时 定时器自动调用earnMonthlylnterest方法
		//相当于我用了一次查看利息 就是到了一个月了
		//此时就重置了存取款次数
		s1.earnMonthlylnterest();
		System.out.println(s1.getBalance());
		s1.deposit(500);
		System.out.println(s1.getBalance());
	}
}
