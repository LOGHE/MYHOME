/**
 * 
 */
package com.hspedu.homework_346___;



/**
 * @author 日暮れて道遠し
 *
 */
public class Doctor351 {
	//创建Doctor351对象
	
	private String name;
	private int age;
	private String job;
	private char gender;
	private double sal;
	public Doctor351(String name, int age, String job, char gender, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	//重写父类obj的equals方法
	@Override
	public boolean equals(Object obj) {
		//判断两个比较对象是否相同
		if (this == obj) {
			return true;
		}
		//判断obj是否是Doctor351类型或者是其子类
		//过关斩将 校验方式
//		if (obj instanceof Doctor351) {
//			Doctor351 Doctor351 = (Doctor351)obj;//向下转型判断obj是Doctor351类型或者是其子类
//			return this.name.equals(Doctor351.name)&&this.age 
		//== Doctor351.age && this.gender == Doctor351.gender;
//		}
		//新方法
		if (!(obj instanceof Doctor351)) {//取反如果obj不是是Doctor351类型或者是其子类
			return false;
		}
		Doctor351 Doctor351 = (Doctor351)obj;//obj是Doctor351类型或者是其子类
		return this.name.equals(Doctor351.name)&&this.age == Doctor351.age
				&& this.gender == Doctor351.gender&&this.sal== Doctor351.sal&&this.job== Doctor351.job;
		
	}
}
