/**
 * 
 */
package com.hspedu.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Throws452 {
	public static void main(String[] args) {
		f2();
	}
	public static void f1() throws Exception {
		//1. 因为 f3() 方法抛出的是一个编译异常
		//2. 即这时，就要 f1() 必须处理这个编译异常
		//3. 在 f1() 中，要么 try-catch-finally ,或者继续 throws
		f3();//f3（）抛出了异常，他自己没有处理你要处理才不会报错
	}
	
	
	public static void f5() throws ArithmeticException {//运行异常
		
	}
	public static void f4() {
		//1. 在 f4()中调用方法 f5() 是 OK
		//2. 原因是 f5() 抛出的是运行异常
		//3. 而 java 中，并不要求程序员显示处理,因为有默认处理机制
		f5();
	}
	
	
	public static void f3() throws FileNotFoundException {//编译异常
		FileInputStream fis = new FileInputStream("d://aa.txt");
	}
	public static void f2() {//throws ArithmeticException被隐藏默认的
		//1.对于编译异常，程序中必须处理，比如 try-catch 或者 throw
		//2.对于运行时异常，程序中如果没有处理，默认就是 throws 的方式
		int n1 = 10;
		int n2 = 0;
		double res = n1 / n2;//throws ArithmeticException被隐藏默认的
	}
}

class Father{
	public void method() throws RuntimeException{
		
	}
}
class Son extends Father{
	//3. 子类重写父类的方法时，对抛出异常的规定:
	//子类重写的方法，所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
	//4. 在 throws 过程中，如果有方法 try-catch , 就相当于处理异常，就可以不必 throw
	@Override
	public void method() throws NumberFormatException {
		//NumberFormatException是RuntimeException的子类 Exception就不行
		// TODO 自动生成的方法存根
		super.method();
	}

	
}