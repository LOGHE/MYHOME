/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWork351 {
	public static void main(String[] args) {
		Doctor351 d1 = new Doctor351("张三", 25, "free", '男', 5000);
		Doctor351 d4 = d1;
		Doctor351 d2 = new Doctor351("张三", 25, "free", '男', 5000);
		Doctor351 d3 = new Doctor351("lisa", 25, "free", '男', 5000);
		System.out.println(d1.equals(d2)); 
		System.out.println(d1.equals(d3));
		System.out.println(d4.equals(d2));
	}
}
