package test;
import java.util.Scanner;
public class IfTicket{
	//编写一个main方法
	public static void main(String[]agrs) {
		//先写出Scanner方便输出淡季还是旺季4-10
		//接着执行if假设为旺季的执行岁数输出什么
		//如果输出淡季操作同上
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int yue = myScanner.nextInt();
		if(yue>=4&&yue<=10) {
			System.out.println("该月为旺季，请输入您的年纪");
			int year = myScanner.nextInt();
			if (year>=18&&year<=60) {
				System.out.println("你的票价为60元");
			}else if(year>0&&year<18) {
				System.out.println("未成年人半价");
			}else if(year>60) {
				System.out.println("老年人收取原价的3/1");
			}else {
				System.out.println("您输入的年龄有误，请重新输入");
			}
		}else if((yue>=1&&yue<=3)||(yue==11||yue==12)) {
			System.out.println("该月为淡季，请输入你的年纪");
			int year1 = myScanner.nextInt();
			if( year1>=18) {
				System.out.println("成人票价为为40");
			}else if(year1<18&&year1>0) {
				System.out.println("您的票价为20");
			}else
				System.out.println("请输入正确年龄");
			}
		}
	}
