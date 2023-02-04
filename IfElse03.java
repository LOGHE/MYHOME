package test;
import java.util.Scanner;
public class IfElse03{
	//编写一个main方法
	public static void main(String[]agrs) {
		//先编写Scanner类
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入该同志的成绩");
		double grade = myScanner.nextDouble();
		if(grade>=8.0) {
			System.out.println("恭喜通过进入决赛");
			System.out.println("请输入你的性别");
					char gender = myScanner.next().charAt(0);
					if (gender == '男') {
						System.out.println("你应该加入男子组");
					}else {
						System.out.println("你应该加入女子组");
					}
			
		}else {
			System.out.println("你被淘汰了");
		}
	}
}