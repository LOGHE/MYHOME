/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWork356 {
	public static void main(String[] args) {
		C c = new C();
	}
}
class A{
	
	public A() {
		// TODO 自动生成的构造函数存根
		System.out.println("我是A 类无参构造器");
	}
}

class B extends A{
	/**
	 * 
	 */
	public B() {
		// TODO 自动生成的构造函数存根
		System.out.println("我是B类无参");
	}
	public  B(String name) {
		System.out.println(name+"我是B我有参");
	}
}

class C extends B{
	public C () {
		this("hello");
		System.out.println("我是C无参");
	}
	public  C(String name) {
		super("hahaha");
		System.out.println("我是C有参");
	}
}