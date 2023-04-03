/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeTeacher346 extends HomeEmployee346 {
	private double remuneration;//课时费
	private double days;//一年上课次数

	public HomeTeacher346(double salary) {
		super(salary);
	}
	
	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

	public double getDays() {
		return days;
	}

	public void setDays(double days) {
		this.days = days;
	}

	@Override
	public void annualsalary() {
		// TODO 自动生成的方法存根
		System.out.println("老师的年工资="+(getSalary()*getSalMonth()+getRemuneration()*getDays()));
	}
}
