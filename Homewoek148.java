package test1;

import java.util.Scanner;

public class Homewoek148{
	//编写一个main方法
	public static void main(String[]agrs) {
	//判断一个年份是否为闰年
		//先创建一个接收对象
		//闰年是能被4整除 且不能被100整除。或者能被400整除
		Scanner myScanner = new Scanner(System.in);
		for(;;) {
			System.out.println("请输入年份");
			int yeas = myScanner.nextInt();
			if(yeas%4 == 0&&yeas % 100 !=0) {
				System.out.println("该年为闰年");
				//break;
			}else if(yeas % 400 == 0) {
				System.out.println("该年为闰年");
				//break;
			}else {
				System.out.println("该年为平常年");
				//break;
			}
		}
	}	
	}