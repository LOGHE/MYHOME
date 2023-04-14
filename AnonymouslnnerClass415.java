/**
 * 
 */
package com.hspedu.innerclass_;

/**
 * @author 日暮れて道遠し
 *匿名内部类  同样定义在局部
 */
public class AnonymouslnnerClass415 {
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
	}
}

//匿名内部类  同样定义在局部
//1本质是类
//2内部类
//3该类没有名字
//4同时还是一个对象
class Outer04{//内部类
	private int n1 = 100;
	public void method() {
		//基于接口的匿名内部类
		//1.需求： 想使用 IA 接口,并创建对象
		//2.传统方式，是写一个类，实现该接口，并创建对象
		//3.需求是 Tiger/Dog 类只是使用一次，后面再不使用
		//4. 可以使用匿名内部类来简化开发
		//5. tiger 的编译类型 ? IA
		//6. tiger 的运行类型 ? 就是匿名内部类 Outer04$1
		//7 jdk 底层在创建匿名内部类 Outer04$1,立即马上就创建了Outer04$1实例，并且把地址返回给tiger.
		//8.匿名内部类使用一次，就不能再使用.但是tiger这个对象可以反复使用
		/*
		我们看底层 会分配 类名 Outer04$1 
		class Outer04$1 implements IA {
		public void cry() {
		System.out.println("老虎叫唤...");}}
		*/
		A tiger  = new A() {
			public void cry() {
				System.out.println("老虎嗷嗷叫");
			}
		};
		System.out.println("tiger的运行类型=" + tiger.getClass());
		tiger.cry();
		// IA tiger = new Tiger();// tiger.cry();
		
		
		//基于类的内部类
		//1. father 编译类型 Father
		//2. father 运行类型 Outer04$2
		//3. 底层会创建匿名内部类
		/*class Outer04$2 extends Father{
		public void test() {
		System.out.println("匿名内部类重写了 test 方法");}}*/
		//4. 同时也直接返回了 匿名内部类 Outer04$2 的对象
		//5. 注意("jack") 参数列表会传递给 构造
//		Father father = new Father("jack") ;这就是创建一个普通类
		Father father = new Father("jack") {//匿名内部类
			public void test() {
				System.out.println("匿名内部类重写了 test 方法");
			}
		};
		System.out.println("father 运行类型=" + father.getClass());
		father.test();
		
		//基于抽象类的匿名内部类
		Animal animal = new Animal() {
			@Override
			void eat() {
				// TODO 自动生成的方法存根
				System.out.println("小狗吃骨头");
			}
		};
		animal.eat();
	}
}

//接口
interface A{
	public void cry() ;}
//class Tiger implements IA {
//public void cry() {
//System.out.println("老虎叫唤...");
//	}
//}
//class Dog implements IA{
//@Override
//public void cry() {
//System.out.println("小狗汪汪...");
//	}
//}

//普通类
class Father{
	public Father(String name) {System.out.println(name);}
	public void test() {}
}

//抽象类
abstract class Animal{
	abstract void eat();
}