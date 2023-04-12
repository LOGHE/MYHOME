/**
 * 
 */
package com.hspedu.static_;

import test7.This245;

/**
 * @author 日暮れて道遠し
 *
 */

//static的使用注意事项
//1 类方法中不允许使用合对象有关的关键字比如this和super.而普通成员方法可以
//2 类方法只能访问静态变量或静态方法
//3 普通成员方法既可以访问普通变量（方法）又可以访问静态变量（方法）
public class StaticMethodDetail380 {
	public static void main(String[] args) {
		D.hi();//静态方法可以直接通过类名调用
		new D().say();//非静态方法需要创建类名调用  这里是匿名对象
		System.out.println(D.sum());
	}
}

class D{
	private int n1 = 100;
	private static int n2 = 200;
	public static int sum() {
		return  n2 * 4;
	}
	public static void hi() {
//		this.n1 = 50;不行
//		super.n2 = 20;不行
		//1 类方法中不允许使用合对象有关的关键字比如this和super.而普通成员方法可以
		//2 类方法只能访问静态变量或静态方法
		//静态方法
//		 n1 = 20;不行
//		say();不行
		sum();//同属性静态方法
		n2 = 2;//同属性静态属性
		
	}
	public void say() {
		//非静态方法
		n1 = 20;
		n2 = 30;
		hi();
		sum();
		
	}
}