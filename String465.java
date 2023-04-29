/**
 * 
 */
package com.hspedu.string_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class String465 {
	public static void main(String[] args) {
		String str = "jack";
		str.intern();
		//6. String 是 final 类，不能被其他的类继承
		//7. String 有属性 private final char value[]; 用于存放字符串内容
		//8. 一定要注意：value 是一个 final 类型， 不可以修改(需要功力)：即 value 不能指向
		// 新的地址，但是单个字符内容是可以变化
		final char value [] = {'a','b','c'};
		value[0] = 'h';
		char v2[] = {'t','o','m'};
		char c1[] = value;
		//value = v2;//不行，不能指向新的地址，但是单个字符内容是可以变化
		//Exercise
		String a = "hsp";//a指向常量池
		String b = new String("hsp");//b指向堆中的对象
		System.out.println(a.equals(b));//判断字符串是否相等  equals  t
		System.out.println(a == b);//判断对象或者字符串是否相等 这里对象不等于字符串  f
		System.out.println(a == b.intern());//t 看方法如何对象中，是否有相同常量池字符串则返回字符串
		//没有则将String对象添加到池中 并返回String对象
		System.out.println(b == b.intern());//f
		
		
	}
}
