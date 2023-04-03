/**
 * 
 */
package test8;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import test7.This245;

/**
 * @author 日暮れて道遠し
 *
 */
/* 该类是完成零钱通的各个功能的 类
 * 使用OOP（面向对象编程）
 * 将各个功能对应一个方法
 * */
//1) 先完成显示菜单，并可以选择
//2) 完成零钱通明细. 
//3) 完成收益入账
//4) 消费
//5) 退出
public class SmallChangageSysOOP341 {
	boolean loop = true;//给do-while 添加条件如果为真无限循环  为假则提示
	Scanner scanner = new Scanner(System.in);
	String key ="" ;
	
	//2完成零钱通明细
	//1可以把收益入账和消费保存到数组 2可以使用对象 3最简单 直接用String输出
	String details = "------零钱通明细------";
	
	//3完成收益入账，完成功能驱动程序员增加新的变化和代码
	//定义新的变量
	
	//消费 定义新的变量 保存消费
	String note = "";
	
	double money = 0;
	double barance = 0;
	Date date = null;//date 是java.ulit.Date类型 表示日期
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化的

//	1先完成显示菜单，并可以选择
	public void mainMenu() {
		do {
			System.out.println("------选择零钱通菜单------");
			System.out.print("\t"+"1 零钱通明细"+"\n"+"\t"+"2 收益入账"+"\n"+ 
					"\t"+"3 消费"+"\n"+"\t"+"4 退出"+"\n");
			System.out.println("请输入1-4查看");
			key = scanner.next();
			switch (key) {
			case "1": {
				this.detail();
				
				break;
			}
			case "2":{
				this.income();
				break;
			}
			case "3":{
				this.pay();
				break;
			}
			case "4":
				this.exit();
				break;
			default:
				System.out.println("请正确输入1-4");
			}
		}while(loop);
	}
//	2完成零钱通明细.
	public void detail() {
		System.out.println(details);
	}
//	完成收益入账
	public void income() {
		System.out.println("收益入账");
		money =scanner.nextDouble();
		//找出不正确的金额条件给出提示，就直接return
		if (money <=0 ) {
			System.out.println("收益金额要大于0");
			return;
		}
		barance += money;
		//拼接收益入账信息到 details
		 date = new Date(0);
		//System.out.println(sdf.format(date));
		details += "\n收益入账\t"+money +"\t" +sdf.format(date)+
				"\t"+barance;
		return;
	}
//	消费
	public void pay() {
		System.out.println("支出");
		money =scanner.nextDouble();
		//找出金额不正确情况
		if (money <=0 || money >barance) {
			System.out.println("消费金额应该在0- "+barance);
			return;
		}
		System.out.println("消费说明");
		note =scanner.next();
		barance -= money;
		details += "\n"+note +"\t-" + money+"\t"+sdf.format(date)+"\t"+barance;
		return;
	}
	//退出
	public void exit() {
		//接收用户是否退出
		String choice = "";
		while (true) {
			System.out.println("你确定退出吗？y/n");
			choice = scanner.next();
			if ("y".equals(choice)|| "n".equals(choice)) {
				break;
			}
		}
		//当用户退出while后 进行判断
		if (choice.equals("y")) {
			loop = false;
		}
	
	}
}
