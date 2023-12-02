/**
 * 
 */
package kadai09;

import java.time.Year;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class TBankAccount  extends BanBase{
	private int due;
	private int year;
	private static int currentYear;
	private static double rate;
	private static int counter = 1001;
	
	
	public TBankAccount( String name, int money, int due,int year) {
		super(("T" + counter), name, money);
		this.due = due;
		this.year = year;
		counter += 10;
	}


	public int getDue() {
		return due;
	}


	public int getYear() {
		return year;
	}

	public static int getCounter() {
		return counter;
	}
	public void addInterest() {
		int num2 = currentYear - year;
		double num = 0;
		if (num2 >= due) {
		 num =Math.pow(1 + rate, currentYear - year ) ;
		 depositMoney((int)(getMoney() * num));
		}else {
			depositMoney(getMoney());
		}
	}


	public static void setCurrentYear(int currentYear) {
		TBankAccount.currentYear = currentYear;
	}


	public static void setRate(double rate) {
		TBankAccount.rate = rate;
	}
	public static int getCurrentYear() {
		return currentYear;
	}


	public static double getRate() {
		return rate;
	}
	
}
