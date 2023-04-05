/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class Teacher354 extends Person354{
	private double work_age;
	//重写父类个人信息
	@Override
	public void say() {
		// TODO 自动生成的方法存根
		System.out.println("老师的信息：");
		super.say();
		System.out.println("工龄："+getWork_age());
		System.out.println(teacher());
		System.out.println(pay());
	}
	//重写父类玩的方法
	@Override
	public String pay() {
		// TODO 自动生成的方法存根
		return getName()+"老师爱下象棋";
	}
	//特有属性方法
	public String teacher() {
		return "我承诺，我会认真教学";
	}
	public Teacher354(String name, int age, char gender, double work_age) {
		super(name, age, gender);
		this.work_age = work_age;
	}

	public double getWork_age() {
		return work_age;
	}

	public void setWork_age(double work_age) {
		this.work_age = work_age;
	}
	
}
