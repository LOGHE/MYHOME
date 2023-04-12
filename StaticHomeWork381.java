/**
 * 
 */
package com.hspedu.static_;

/**
 * @author 日暮れて道遠し
 *
 */
public class StaticHomeWork381 {
	public static void main(String[] args) {
		new StaticHomeWork381().n1();//9虽然是匿名对象但是属性是静态属性大家共享的
		new StaticHomeWork381().n1();//10
		System.out.println(new StaticHomeWork381().count);//11
	}
	int n1 = 9;
	static int count = 9;
	public void n1() {
		System.out.println("count= " + (count++));
	}
	public void n2() {
		System.out.println("n1=" + (n1++));
	}
}
