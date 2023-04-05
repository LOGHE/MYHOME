/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class Student354 extends Person354{
	private String stu_id;
	//重写父类个人信息
	@Override
	public void say() {
		// TODO 自动生成的方法存根
//		System.out.println(getName()+"的年龄="+getAge()+",性别"+
//		getGender()+"学号是"+stu_id+","+pay()+"并且"+student());
		System.out.println("学生的信息：");
		super.say();
		System.out.println("学号："+getStu_id());
		student();
		System.out.println(pay());
	}
//重写父类玩的方法
	@Override
	public String pay() {
		// TODO 自动生成的方法存根
		return getName()+"学生爱踢足球";
	}
	//特有方法
	public void student() {
		System.out.println( getName()+"我承诺我会好好学习");
	}
	public Student354(String name, int age, char gender, String stu_id) {
		super(name, age, gender);
		this.stu_id = stu_id;
	}
	
	//打印属性 不调用方法或者特殊方法用toString
	@Override
	public String toString() {
		return "Student354 [stu_id=" + stu_id + "]" +super.toString();
	}
	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	
}
