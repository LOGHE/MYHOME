/**
 * 
 */
package com.hspedu.homework_346___;

import com.hspedu.super_.Super297;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWork352 {

//	11．现有 Person 类，里面有方法 run 、 eat , Student 类继承了 Person 类，
	//并重写了 run 方法，自定义了 study 方法，试写出对象向上转型和向下转型的代码，
	//并写出各自都可以调用哪些方法，并写出方法输出什么？
	public static void main(String[] args) {
		//向上转型
		Person352 p1 = new Student352();
		//编译类型看左边，运行看右边；一般是调用执行左边父类的方法 或者执行子类重写父类的方法
		//想要调用子类特有方法得向下转型
		p1.run();//子类run方法因为子类重写了父类方法
		p1.eat();//父类eat方法
		//向下转型
		System.out.println("------向下转型------");
		Student352 student352 = (Student352)p1;
		student352.run();//子类
		student352.study();//子类特有方法
		student352.eat();//父类方法
	}
}
