/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class Person354 {
	//学生和老师得共有属性 方法
	private String name;
	private int age;
	private char gender;
	//需要一个输出信息的方法
	public void say() {
		System.out.println( "姓名："+getName()+"\n年龄："+getAge()+"\n性别："+getGender());
	}
	public String pay() {
		return"";
	}
	public Person354(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
