/**
 * 
 */
package com.hspedu.poly_.polyarr_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Person315 {//父类
	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person315(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age 要设置的 age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public String say() {//方法返回名字和年龄
		return name + "\t"+age;
	}
}
