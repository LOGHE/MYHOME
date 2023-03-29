/**
 * 
 */
package com.hspedu.extend;

/**
 * @author 日暮れて道遠し
 *
 */
//输入ctlr+h可以看到类的继承方式

public class Base extends Topbase{//父类 是Topbase
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	/**
	 * 
	 */
	public Base() {
		// TODO 自动生成的构造函数存根
		System.out.println("最大父类无参构造器base()...");
	}	
	
	/**
	 * 
	 */
	public Base(String name,int age) {//有参构造器
		//如果父类没有提供无参构造器，则必须在子类的构造器中用 
		//super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则编译不会通过 看Sub类就知道了
		//this 和super不能共存 而且只能排第一位
		super();//再父类可有可无，但是再子类 要调用父类有参构造器必要有super（传入参数）
		System.out.println("父类的(String name,int age) 有参构造器被调用");
	}

	/**
	 * 
	 */
	public Base(String name) {//有参构造器
		super();
	}

	public void test100() {
		System.out.println("test100");
	}
	protected void test200() {
		System.out.println("test200");
	}
	 void test300() {
		System.out.println("test300");
	}
	private void test400() {
		System.out.println("test400");
	}
	//父类提供一个公开的方法，可以让子类访问到n4私有属性 
	public int getN4() {
		return n4;
	}
	public void calltest400() {
		test400();
	}
}
