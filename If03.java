package test;
import java.util.Scanner;
public class If03{
	//编写一个main方法
	public static void main(String[]agrs) {
	/*先定义一个int
		输入保国同志的芝麻信用分：
		如果：
		1) 信用分为 100 分时，输出 信用极好；
		2) 信用分为(80，99]时，输出 信用优秀;
		3) 信用分为[60,80]时，输出 信用一般；
		4) 其它情况 ，输出 信用 不及格
		5) 请从键盘输入保国的芝麻信用分，并加以判断再假设情况当*/
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入保国同志的行用分1-100");
		int grade = myScanner.nextInt();
		//开始假设
		if(grade <=100&&grade>=0) {
			if(grade==100) {
				System.out.println("该同志信用极好");
			}else if (grade<=99&&grade>=80) {
				System.out.println("该同志信用优秀");
			}else if(grade<80&&grade>=60) {
				System.out.println("该同志信用一般");
			}else {
				System.out.println("该同志行用不合格");
			}
			
		}else {
			System.out.println("请输入正确分数");
		}
		
	}
	}