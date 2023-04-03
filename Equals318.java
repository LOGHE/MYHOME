/**
 * 
 */
package com.hspedu.Object_;

import com.hspedu.modifier.A;

/**
 * @author 日暮れて道遠し
 *
 */
public class Equals318 {
	public static void main(String[] args) {
		A a =new A();
		A b = a;
		A c = b;
		System.out.println(a == c); 
		//equals方法 原码怎么查看
		//把光标放在equals方法直接输出ctrl+b
		"hello".equals("obj");
		/*
		//带大家看看 Jdk 的源码 String 类的 equals 方法
		//把 Object 的 equals 方法重写了,变成了比较两个字符串值是否相同
		public boolean equals(Object anObject) {
		if (this == anObject) {//如果是同一个对象
		return true;//返回 true
		}
		if (anObject instanceof String) {//判断类型
		String anotherString = (String)anObject;//向下转型
		int n = value.length;
		if (n == anotherString.value.length) {//如果长度相同
		char v1[] = value;
		char v2[] = anotherString.value;
		int i = 0;
		while (n-- != 0) {//然后一个一个的比较字符
		if (v1[i] != v2[i])
		return false;
		i++;
		}
		return true;//如果两个字符串的所有字符都相等，则返回 true
		}
		}
		return false;//如果比较的不是字符串，则直接返回 false
		}
		*/
		// Object 的 equals 方法默认就是比较对象地址是否相同
		//==比较对象地址是否相同，也就是判断两个对象是不是同一个对象
		Integer integer1 = new Integer(5);
		Integer integer2 = new Integer(5);
		System.out.println(integer1 == integer2);//false == 因为new的是两个新地址 不是同一个对象
		System.out.println(integer1.equals(integer2));//equals 是判断两个对象是不是同一个地址

			
	}
}

class A318{
	
}
