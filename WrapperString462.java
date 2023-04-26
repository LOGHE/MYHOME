/**
 * 
 */
package com.hspedu.wrappertype_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class WrapperString462 {
public static void main(String[] args) {
	//包装类Integer包装箱为String
	Integer integer = 100;//自动装箱
	//方法1
	String s1 = integer + "";
	//2
	String s2 = integer.toString();//字符串
	//3
	String s3 = String.valueOf(integer);
//	String.valueOf(integer); == public static String valueOf(int i) {
//	        return Integer.toString(i);
//	    }
	
	String s4 = "12345";
	Integer i1 = Integer.parseInt(s4);//使用到自动装箱
	Integer i2 = new Integer(s4);//构造器
	System.out.println("ok");
}
}
