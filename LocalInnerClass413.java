/**
 * 
 */
package com.hspedu.innerclass_;

/**
 * @author 日暮れて道遠し
 *
 */
public class LocalInnerClass413 {
	public static void main(String[] args) {
		Outer01 outer01 = new Outer01();
		outer01.m1();
		System.out.println("Outer01的哈希值= "+outer01);
	}
}
class Outer01{//外部类
	private int n1 = 100;
	private void m2() {System.out.println("Outer01m2()");}
	public void m1() {
		//一   1局部内部类，定义在局部位置方法或者代码块中，通常在方法中
		{
			class Inner05{}
		}
		 final class Inner02{//局部内部类 加了final表示不能被继承
			//一.3.不能添加访问修饰符,但是可以使用 final
			//一，2.可以直接访问外部类的所有成员，包含私有的
			//6. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
			// 使用 (外部类名.this.成员）去访问
			// 解读 Outer02.this 本质就是外部类的对象, 即哪个对象调用了 m1, Outer02.this 就是哪个对
			 private int n1 = 200;
	  public void f1() {
		  //一.4局部内部类可以直接访问外部成员n1 m2()
				System.out.println("n1内部类重名属性=" +n1+"，n1外部类重名属性="+Outer01.this.n1);
				m2();
				System.out.println("Outer01.this的哈希值"+Outer01.this);
			}
		}
		//class Inner03 extends Inner02{}
		 //一 .5 外部类在方法中可以创建Inner02对象然后调用方法即可
		 Inner02 inner02 = new Inner02();
		 inner02.f1(); 
	}
}
