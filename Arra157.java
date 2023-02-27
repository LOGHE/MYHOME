package test6;
import java.util.Scanner;
public class Arra157{
	//编写一个main方法
	public static void main(String[]agrs) {
		//循环输入5个成绩保存到double数组中，并输出
		//先化繁为简
		//先创建一个Scanner对象接收输入
		//再创建数组double[] scores = new double[5];
		//创建循环输入一个保存一个
		//最后打印
		Scanner myScanner = new Scanner(System.in);
		double[] scores = new double[5];//创建double数组5个成绩
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入成绩");
			scores [i] = myScanner.nextDouble();//把myScanner赋值给double
			//System.out.println("第"+ (i+1 )+"个成绩=" + scores[i]);
		}
		for (int i = 0; i < scores.length; i++) {//这里是为了简洁打印没有这里就会可读性变差
			System.out.println("第"+ (i+1 )+"个成绩=" + scores[i]);
		}
		
	}
	}