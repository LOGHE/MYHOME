/**
 * 
 */
package com.hspedu.innerclass_;

import com.hspedu.innerclass_.Outer10.Inner10;

/**
 * @author 日暮れて道遠し
 *
 */
public class StaticInnerClass421 {
	public static void main(String[] args) {
		Outer10 outer10 = new Outer10();
		outer10.m1();
		System.out.println("第一种方法===========");
		//外部其他类使用静态内部类
		//方式1 因为静态内部类，是可以通过类名直接访问(前提是满足访问权限)
		Inner10 inner10 = new Outer10.Inner10();//Inner10()前面不需要new
		inner10.say();
		System.out.println("第二种方式==========");
		//方式2 编写一个方法，可以返回静态内部类的对象实例.
		Outer10.Inner10 inner102 = outer10.Inner10Instance();
		inner102.say();
		System.out.println("第二种方式==========");
		outer10.Inner10Instance().say();
	}
}

class Outer10{
	private int n1 = 10;
	private static String name = "张三";
	private static void cry() {}
	//Inner10 虽然加了static但是是在成员位置算是成员内部类。满足static的要求
	//Inner10 就是静态内部类
	//1. 放在外部类的成员位置
	//2. 使用 static 修饰
	//3. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
	//4. 可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
	//5. 作用域 ：同其他的成员，为整个类体
	static class Inner10{
		public static String name = "李四";
		public void say() {
			//如果外部类和静态内部类的成员重名时，静态内部类访问的时，
			//默认遵循就近原则，如果想访问外部类的成员，则可以使用 （外部类名.成员)
			System.out.println("静态内部类成员"+name+"，外部类成员"+ Outer10.name);
			cry();
		}
	}

	public void m1() { //外部类---访问------>静态内部类 访问方式：创建对象，再访问
		Inner10 inner10 = new Inner10();
		inner10.say();
	}
//	可以返回静态内部类的对象实例.
	public static Inner10 Inner10Instance() {//static可有可无，只是后面调用起来方便
		return new Inner10();
	}
}