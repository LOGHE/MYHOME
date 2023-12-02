/**
 * 
 */
package kadai09;

import java.util.Scanner;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai0904 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TBankAccount [] tb = new TBankAccount[3];
		System.out.print("Current Year-->");
		int year = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i < tb.length; i++) {
			System.out.print("Name-->");
			String name = sc.next();
			System.out.print("Money-->");
			int money = sc.nextInt(); 
			System.out.print("Due(1/3/5)-->");
			int due = sc.nextInt();
			tb[i] = new TBankAccount(name, money, due,year);
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < tb.length; i++) {
			tb[i].addInterest();
			System.out.print(tb[i].getNumber() + "\t" + tb[i].getName() + "\t" + tb[i].getMoney() +"\t" + tb[i].getDue());
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Current Year-->");
		year = sc.nextInt();
		TBankAccount.setCurrentYear(year);
		
		System.out.print("Rate-->");
		double rate =sc.nextDouble();
		TBankAccount.setRate(rate);
		
		System.out.println();
		for (int i = 0; i < tb.length; i++) {
			tb[i].addInterest();
			System.out.print(tb[i].getNumber() + "\t" + tb[i].getName() + "\t" + tb[i].getMoney() +"\t" + tb[i].getDue());
			System.out.println();
		}
		
	}
}