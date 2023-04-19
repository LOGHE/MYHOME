/**
 * 
 */
package com.hspedu.homework436_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
//按要求实现下列问题：1min完成﹣＞抽象类的使用
//1．动物类 Animal 包含了抽象方法 shout ();
//2. Cat 类继承了 Animal ，并实现方法 shout ，打印"猫会喵喵叫"
//3. Dog 类继承了 Animal ，并实现方法 shout ，打印"狗会汪汪叫"在测试类中实例化对象 Animal cat = new Cat ()，并调用 cat 的 shout 方法
//4在测试类中实例化对象 Animal dog = new Dog ()，并调用 dog 的 shout 方法

public class HomeWork437 {
	public static void main(String[] args) {
		Animal cat = new CAT();
		cat.shout();
		Animal dog = new Dog();
		dog.shout();
	}
}

abstract class Animal{
	abstract public void shout();
}

class CAT extends Animal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
	System.out.println("猫会喵喵叫");	
	}
}

class Dog extends Animal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存根
	System.out.println("狗会汪汪叫");	
	}
	
}