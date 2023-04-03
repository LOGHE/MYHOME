/**
 * 
 */
package com.hspedu.Object_;

/**
 * @author 日暮れて道遠し
 *
 */
public class EqualsExercise322 {
	public static void main(String[] args) {
		Person_ p1 = new Person_();
		p1.name = "hspedu";
		Person_ p2 = new Person_();
		p2.name = "hspedu";
		System.out.println(p1==p2); //False 因为是两个不同的对象
		System.out.println(p1.name .equals( p2.name));//T  String类已经把equals方法重写了。
		System.out.println(p1.equals(p2));//False Person类没有重写obje父类的equals方法
		String s1 = new String("asdf");
		String s2 = new String("asdf");
		System.out.println(s1.equals(s2));//T String类已经把equals方法重写了。
		System.out.println(s1==s2); //F 两个不同的对象不相等
	}
}

class Person_{//类
public String name;
}