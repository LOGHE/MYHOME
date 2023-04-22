package com.hspedu.exception_;
public class Exception446 {
	private static final A B = null;

	public static void main(String[] args) {
		/*举例Exception 的常见类型 运行异常
		1 空指针异常NullPointerException
		String name = null;//空指针异常NullPointerException
		System.out.println(name.length());
		
		2 ArithmeticException 数学运算异常 看Exception443文件 分母为0
		
		3 ArrayIndexOutOfBoundsException 数组下标越界异常
		int [] arr = {1,2,4};
		for (int i = 0; i <= arr.length; i++) {//i = 3 时多了一个位置
			System.out.println(arr[i]);
		}
		
		//4ClassCastException 类型转换异常
		A b = new B();
		 B b2 = (B)b;//向下转型ok
		 C c2 = (C)b;//类型转换异常*/
		 
		 //5 NumberFormatException 数字格式不正确异常
		 //当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，
		 //抛出该异常 => 使用异常我们可以确保输入是满足条件数字.
		String name1 = "1234";//可以转成int
		 String name2 = "知识改变命运";//会NumberFormatException 数字格式不正确异常
		 int num = Integer.parseInt(name1);
		 System.out.println(name1);
		 int num1 =  Integer.parseInt(name2);//会NumberFormatException 数字格式不正确异常
	}
}
class A{}
class B extends A{}
class C extends A{}