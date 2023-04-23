/**
 * 
 */
package com.hspedu.exception_;
import java.lang.reflect.Method;
import java.util.Scanner;
/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class TryExercise451 {
	public static void main(String[] args) {
		method();
		
	}
	//1. 创建 Scanner 对象
	//2. 使用无限循环，去接收一个输入
	//3. 然后将该输入的值，转成一个 int
	//4. 如果在转换时，抛出异常，说明输入的内容不是一个可以转成 int 的内容
	//5. 如果没有抛出异常，则 break 该循
	public static void method() {
		boolean loop = true;//控制显示菜单
		Scanner scanner = new Scanner(System.in);
		int i = 0 ;//接收用户输入
		String str = "";
		do {
			System.out.println("请输入整数");
			str = scanner.next();
			try {
				i = Integer.parseInt(str);//将该输入的值，转成一个 int 
				//相当于判断 字符串是不是数字 不是就报错 是就转换成数字
				loop = false;//如果没有抛出异常，则 break 该循
				System.out.println("输入正确");
				System.out.println("您输入的是 " + i);
			}catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("输入有误,请重新输入");
			} 
			
		} while (loop);
	}
}
