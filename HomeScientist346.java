/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeScientist346 extends HomeEmployee346 {
	private double bonus;

	public HomeScientist346(double salary) {
		super(salary);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void annualsalary() {
		// TODO 自动生成的方法存根
		System.out.println("科学家的年工资="+(getSalary()*getSalMonth()+getBonus()));
	}
	
	
}
