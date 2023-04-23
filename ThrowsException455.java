/**
 * 
 */
package com.hspedu.exception_;

import javax.management.RuntimeErrorException;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class ThrowsException455 {
	public static void main(String[] args) {
		try {
			ThrowsException455.methodA();//
		} catch (Exception e) {// 制造异常 要执行catch。 throw new RuntimeException("制造异常"); 
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
		ThrowsException455.methodB();
		
		//输出内容
		//1 System.out.println("进入方法A");
		//2 System.out.println("用方法A的finally");
		//3 System.out.println(e.getMessage());
		//4 System.out.println("进入方法B");
		//5 System.out.println("用方法B的finall");
	}
	static void methodA() {
		try {
			System.out.println("进入方法A");
			throw new RuntimeException("制造异常");//传入上面的  e.getMessage()
		}finally {
		System.out.println("用方法A的finally");	
		}
	}
	 static void methodB() {
		try {
			System.out.println("进入方法B");
			return;
		} finally {
			System.out.println("用方法B的finall");
		}
	}
}
