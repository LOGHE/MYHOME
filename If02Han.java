package test;

import java.util.Scanner;//导入scanner类

public class If02Han{
	
	//编写一个main方法
	public static void main (String[]args){
		//先定义条件int = 18再假设该同志年龄是否小于或者大于18
		//然后用if假设
		//先定义一个scanner对象
		Scanner myScanner= new Scanner(System.in);
		System.out.println("请输入年龄");
		//把年龄保存到一个变量 int age
		int age = myScanner.nextInt();
		//使用 if 判断，输出对应信息
		if(age > 18) {
		System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
		}else {//双分支
			System.out.println("你的年龄不大这次放过你");
		}
		System.out.println("程序继续...");
		
		}	
	}
