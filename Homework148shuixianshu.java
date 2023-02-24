package test1;

import java.util.Scanner;

public class Homework148shuixianshu{
	//编写一个main方法
	public static void main(String[]agrs) {
		//判断一个数是否为水仙数 一个三位数的每个位数的立方相加等于他本身 如153 = 1*1*1 + 5*5*5 + 3*3*3
		//先创建Scanner对象来接收一个数
		//d的百位数 d/100
		//d的十位数d%100/10
		//d的个位数d%10
		Scanner myScanner = new Scanner(System.in);
		for(;;) {
			System.out.println("请输入一个数");
			int d = myScanner.nextInt();
			int n1 = d / 100,n2 = d % 100 / 10, n3 = d % 10;
			if(d == n1 *n1 *n1 + n2 * n2 * n2 + n3 * n3 *n3) {
				System.out.println("该数为水仙数");
			}else {
				System.out.println("该数不是水仙数");
			}
		}
		
	}
	}