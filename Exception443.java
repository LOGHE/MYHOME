/**
 * 
 */
package com.hspedu.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Exception443 {
	public static void main(String[] args) throws Exception {//throws Exception默认
		int num1 = 10;
		int num2 = 0;
		//1. num1 / num2 => 10 / 0
		//2. 当执行到 num1 / num2 因为 num2 = 0, 程序就会出现(抛出)异常 ArithmeticException
		//3. 当抛出异常后，程序就退出，崩溃了 , 下面的代码就不在执行
		//4. 大家想想这样的程序好吗? 不好，不应该出现了一个不算致命的问题，就导致整个系统崩溃
		//5. java 设计者，提供了一个叫 异常处理机制来解决该问题
		// int res = num1 / num2;
		//如果程序员，认为一段代码可能出现异常/问题，可以使用 try-catch 异常处理机制来解决
		//从而保证程序的健壮性
		//将该代码块->选中->快捷键 ctrl + alt + t -> 选中 try-catch
		//6. 如果进行异常处理，那么即使出现了异常，程序可以继续执行
		try {
			int res  = num1 / num2;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println(	"异常的原因= "+e.getMessage());
		}//num2分母为零会报错
		System.out.println("程序继续运行");
//		Throwable
		FileInputStream fis;
		
		//编译异常
		//编译异常
		//编译异常
		try {
			fis = new FileInputStream("d:\\aa.jpg");
			int len;
			while ((len = fis.read()) != -1) {
				System.out.println(len);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
