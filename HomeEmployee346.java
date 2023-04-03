/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeEmployee346 {
	//属性 日工资和 一年的天数
	private double salary;
	
	private int salMonth = 12;
	//构造器
	public HomeEmployee346(double salary) {
		super();
		this.salary = salary;
		
	}

	public int getSalMonth() {
		return salMonth;
	}

	public void setSalMonth(int salMonth) {
		this.salMonth = salMonth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	//计算工资的方法
	public void annualsalary() {
		System.out.println(getSalary()*getSalMonth());
	}
}
