package test;
//导入scanner类
import java.util.Scanner;
//开始编写
public class Switch01{
	//编写一个main方法
	public static void main(String[]agrs) {
		//请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
		//a 表示星期一，b 表示星期二 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入字母a-g");
		char c1 = myScanner.next().charAt(0);
		switch (c1){
		case 'a':
			System.out.println("今天是星期一");
			break;
		case 'b':
			System.out.println("今天是星期er");
			break;
		case 'c':
			System.out.println("今天是星期san");
			break;
		case 'd':
			System.out.println("今天是星期si");
			break;
		case 'e':
			System.out.println("今天是星期wu");
			break;
		default:
			System.out.println("您输入的不正确请重新输入");
		}
		System.out.println("退出switch,继续执行");
	}
	}