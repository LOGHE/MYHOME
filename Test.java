/**
 * 
 */
package com.hspede.modifier;

/**
 * @author 日暮れて道遠し
 *
 */
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.m1();//这里是访问的方法 n4会输出
		System.out.println("n1="+a.n1+" n2="+ a.n2+" n3="+ a.n3 + " n4=");
		//a.n4访问不到只会在同一个类下访问
	}
}
