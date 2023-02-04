package test;

import java.util.Scanner;



public class MyIf02{
	
	//编写一个main方法
	public static void main (String[]args){
		//先定义条件int = 18再假设该同志年龄是否小于或者大于18
		//然后用if假设
		Scanner myScanner= new Scanner(System.in);
		System.out.println("请输入年龄");
		//把年龄保存到一个变量 int age
		int age = myScanner.nextInt();
		//使用 if 判断，输出对应信息
		if(age > 18) {
		System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
		}
		System.out.println("程序继续...");
		
		}	
	}
