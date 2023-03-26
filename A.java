/**
 * 
 */
package com.hspede.modifier;

/**
 * @author 日暮れて道遠し
 *
 */

public class A {
	//四个属性
	/*
	 *  1) 公开级别:用 public 修饰,对外公开
	 *  2) 受保护级别:用 protected 修饰,对子类和同一个包中的类公开
		3) 默认级别:没有修饰符号,向同一个包的类公开. 
		4) 私有级别:用 private 修饰,只有类本身可以访问,不对外公开.
	 */
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	public  void m1() {//关键在于 static 
		//该方法可以访问四个属性
		System.out.println("n1="+n1+"  n2="+n2+"  n3"+n3+"  n4="+n4);
	}
	//访问修饰符可以修饰属性方法
	private void m2() {}
	void m3() {}
	private void m4() {}
}
