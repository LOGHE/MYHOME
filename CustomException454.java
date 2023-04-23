/**
 * 
 */
package com.hspedu.exception_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class CustomException454 {
	public static void main(String[] args) {
		int age = 180;
		if (!(age >= 18 && age <= 120)) {//! 取反 表示年纪不在18 - 120范围执行if文
			throw new AgeException("年纪需要在18-120之间");
		}
		System.out.println("你的年龄范围正确");
	}
}
//自定义一个异常
//1. 一般情况下，我们自定义异常是继承 RuntimeException
//2. 即把自定义异常做成 运行时异常，好处时，我们可以使用默认的处理机制
//3. 即比较方便

class AgeException extends RuntimeException{//自定义 继承运行异常处理父类 即把自定义异常做成 运行时异常，好处时，我们可以使用默认的处理机制
	public AgeException(String message) {//构造器
		// TODO 自动生成的构造函数存根
		super(message);
	}
}