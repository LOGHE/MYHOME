package test1;

import java.util.Scanner;

public class BreakExercise142{
	//编写一个main方法
	public static void main(String[]agrs) {
		//实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，
		//否则提示还有几次机会，请使用 for+break完成
		
		//先化繁为简
		//先创建一个Scanner接收对象
		//再创建 String 名字和密码的空
		//还需要在外面创建一个表示提示还剩几次的int s = 3 i-- 每输入一次提示机会减少一次
		//在for循环创建条件3此机会 i=3 
		Scanner myScanner = new Scanner(System.in);
		String name = "";//接收名字
		String passwd = "";//接收密码
		int chance = 3;//表示提示机会
		for(int i = 1; i <= 3; i++) {//i表示可输入次数
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入用户密码");
			passwd = myScanner.next();
			if("丁真".equals(name) && "666".equals(passwd)) {//加入条件虽然没见过equale
				System.out.println("恭喜你输入正确登录成功");
				break;//不停止即使输入正确也还会循环两次
			}else {
				chance--;//输入一次就提示机会减少一次
				System.out.println("你的机会还剩" + chance + "次");
		  }
		}
	  }
	}