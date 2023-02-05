package test;
import java.util.Scanner;
public class SwitchExercise118{
	//编写一个main方法
	public static void main(String[]agrs) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入a-e");
	char c1 = myScanner.next().charAt(0);
	switch (c1) {
	case 'a':
		System.out.println("A");
		break;
	case 'b':
		System.out.println("B");
		break;
	case'c':
	System.out.println("C");
	break;
	case'd':
		System.out.println("D");
		break;
	case'e':
		System.out.println("E");
		break;
		default:
			System.out.println("other");
		
	}
	
	////对学生成绩大于 60 分的，输出"合格"。低于 60 分的，
	//输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
	//思路分析
	//1. 这道题，可以使用 分支来完成， 但是要求使用 switch
	//2. 这里我们需要进行一个转换, 编程思路 :
	// 如果成绩在 [60,100] , (int)(成绩/60) = 1
	// 如果成绩在 [0,60) , (int)(成绩/60) = 0
	//代码实现
	System.out.println("请输入成绩0-100");
	double score = myScanner.nextDouble();
	if(score<=100&&score>=0) {
	
	switch((int)score/60) {
	case 1:
		System.out.println("合格");
		break;
	case 0:
		System.out.println("不合格");
		
	}
	}else {
		System.out.println("请输入正确分数");
	}
	
	//根据用于指定月份，
	//打印该月份所属的季节。
	//3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
	//[课堂练习, 提示 使用穿透 ]
	//
	//思路分析
	//1. 创建 Scanner 对象， 接收用户输入
	//2. 使用 int month 接收
	//3. 使用 switch 来匹配 ,使用穿透来完成，比较简洁
		System.out.println("请输入月份");
		int yue = myScanner.nextInt();
		if (yue<=12&&yue>=1) {
			switch(yue) {
			case 4:
			case 3:
			case 5:
				System.out.println("春季");
				break;//没有的话会往下执行输出夏季秋季冬季
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			}
				
		}else {
			System.out.println("输入有误");
		}
	}
	}