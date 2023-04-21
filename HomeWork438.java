/**
 * 
 */
package com.hspedu.homework436_;


/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork438 {
	public static void main(String[] args) {
		A a = new A();
		a.f1();
	}
}

class A {
	private String name = "知识改变自己的命运";
	public void f1() {
		class B{
			private String name = "知识改变命运";
			public void show() {
				//使用A.this.name调用内部类的重名属性
				System.out.println(A.this.name + "   " +name);
			}
		}
		B b = new B();
		b.show();
	}
}