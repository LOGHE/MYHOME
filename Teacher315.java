/**
 * 
 */
package com.hspedu.poly_.polyarr_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Teacher315 extends	Person315 {
	private double salary;
	
	public Teacher315(String name, int age, double salary) {
	super(name, age);
	this.salary = salary;
	}
	public double getSalary() {
	return salary;
	}
	public void setSalary(double salary) {
	this.salary = salary;
	}
	//写重写父类的 say 方法
	@Override
	public String say() {
	return "老师 " + super.say() + " salary=" + salary;
	}
	//编写特有方法
	public void teacher() {
		System.out.println("老师 "+getName()+"正在授课");
	}
}
