/**
 * 
 */
package com.hspedu.abstract_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Abstract397 {
	public static void main(String[] args) {
		Cat cat = new Cat("福星", 3);
		cat.cry();
	
	}
}

//即： 父类方法不确定性的问题
//考虑将该方法设计为抽象(abstract)方法
// 所谓抽象方法就是没有实现的方法
// 所谓没有实现就是指，没有方法体
// 当一个类中存在抽象方法时，需要将该类声明为 abstract 类
// 一般来说，抽象类会被继承，有其子类来实现抽象方法.
 abstract class Animal{//抽象类不能被创建实例
	private String name;
	private int age;
	 abstract public void cry();
	 //抽象方法不能使用 private、final 和 static 来修饰，因为这些关键字都是和重写相违背的
	  public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void name() {
		
	}
}
//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法 （重写方法写具体 ），除非它自己也声明为 abstract 类
 class Cat extends Animal{

	/**
	 * @param name
	 * @param age
	 */
	public Cat(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void cry() {
		// TODO 自动生成的方法存根
		System.out.println("小猫"+getName()+"今年"+ getAge()+"岁了");
	}
	 
 }
