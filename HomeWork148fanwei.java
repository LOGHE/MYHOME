package test1;
import java.util.Scanner;
public class HomeWork148fanwei{
	//编写一个main方法
	public static void main(String[]agrs) {
		Scanner myScanner = new Scanner(System.in);
		for(;;) {
		System.out.println("请输入一个数");
		int i = myScanner.nextInt();
		if(i <0) {
			System.out.println("这个数小于0");
		}else if(i == 0) {
			System.out.println("这个数等于0");
		}else {
			System.out.println("这个数大于0");
		}
		}
	}
	}