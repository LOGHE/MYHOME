/**
 * 
 */
package com.hspedu.codeblock_;

import java.awt.geom.Dimension2D;

public class CodeBlockDetail386 {
	public static void main(String[] args) {
//		①创建对象实例时（ new )
		//AA aa = new AA();
		
//		②创建子类对象实例，父类也会被加载.父类先加载，子类后加载
		//AA aa2 = new AA();
		
//		③使用类的静态成员时（静态属性，静态方法）父类先加载，子类后加载
		//System.out.println(Cat.n1);
		
		//下面演示创建类 代码块只会被执行一次。
//		BB bb = new BB();
//		BB b1 = new BB();
		
		//下面演示普通代码块在创建对象实例时，会被隐式的调用。
		//被创建一次，就会调用一次。
		//如果只是使用类的静态成员时，普通代码块并不会执行。
		DD dd = new DD();
		DD dd2 = new DD();
		System.out.println(DD.n2);//因为n2是静态属性不会调用代码块的
		System.out.println(dd.n1);//单独调用 普通成员属性也不会调用 代码块
		
	}
}


//2）类什么时候被加载［重要背◇]
//①创建对象实例时（ new )
//②创建子类对象实例，父类也会被加载
//③使用类的静态成员时（静态属性，静态方法）案例演示： A 类 extends B 类的静态块
//3）普通的代码块，在创建对象实例时，会被隐式的调用。
//被创建一次，就会调用一次。
//如果只是使用类的静态成员时，普通代码块并不会执行。
class DD{
	public int n1 = 100;
	public  static int  n2 = 100;
	{
		System.out.println("DD的普通代码块被执行");
	}
}
class Animal{
	//静态代码块
	static {
		System.out.println("animal的静态代码块1被执行");
	}
}
class Cat extends Animal{
	public static  int n1 = 999;
	
	//静态代码块
	static {
		System.out.println("Cat的静态代码块被执行");
	}
}
class AA extends BB{
	//静态代码块
	static {
		System.out.println("AA的静态代码块1被执行");
	}
}
class BB {
	static {
		System.out.println("BB的静态代码块1被执行");
	}
}