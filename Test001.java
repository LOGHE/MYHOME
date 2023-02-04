package test;
//导入scanner类
import java.util.Scanner;
//开始编写
public class Test001{
	//编写一个main方法
	public static void main(String[]agrs) {
		//先建立一个Scanner
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		//把年龄保存到一个int里面
		int age = myScanner.nextInt();
		//使用if判断
		if( age >18) {
			System.out.println("你的年龄已经满18岁，需要对自己的行为负责");
		}else {//与之相反
			System.out.println("你的年纪不大这次放过你");
		}
		System.out.println("程序继续......");
	}
}