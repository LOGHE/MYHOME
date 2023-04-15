/**
 * 
 */
package com.hspedu.innerclass_;

/**
 * @author 日暮れて道遠し
 *
 */
public class AnonymouslnnerClassDetail417 {
	public static void main(String[] args) {
		//创建
		Outer05 outer05 = new Outer05();
		outer05.f1();
	}
}

class Outer05{
	private int n1 = 99;
	public void f1() {
		//创建一个基于类的匿名内部类
		Person person = new Person() {

			@Override
			public void hi() {
				// TODO 自动生成的方法存根
				//可以访问外部类的所有成员包括隐私的
				System.out.println("匿名内部类重写了hi方法" + "，私有属性n1被访问="+n1);
			}
		};
		person.hi();//动态绑定机制。因为不是多态所有编译类型是 Person 运行类型是Outer05$1
		
		//匿名内部类本身也是返回对象
		//相当于 extends Person{}
		new Person() {
			public void hi() {
				// TODO 自动生成的方法存根
				System.out.println("匿名内部类重写了hi方法..hhh");
			}
			public void ok(String str) {
				super.ok(str);
			}
		}.ok("蒲无语");//匿名内部类可以看作是一个对象这里直接调用的是直接内部的hi()方法 ok()方法
	}
}
class Person{
	public void hi() {
		System.out.println("Person的hi()fangfa");
	}
	public void ok(String str) {
		System.out.println("Person类的ok方法传参="+ str);
	}
}
