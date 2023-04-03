/**
 * 
 */
package test8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import test7.This245;

/**
 * @author 日暮れて道遠し
 *
 */
public class TestOOP342 {
//  1) 先完成显示菜单，并可以选择
//	2) 完成零钱通明细. 
//	3) 完成收益入账
//	4) 消费
//	5) 退出
//6) 用户输入4退出是，给出提示“你确定要退出吗？y/n”，必须输入正确的y/n 否则循环输入指令 知道输入y 或者 n
// 7）在收益入账和消费时 判断金额是否合理 并给出相应的提示
		//定义相关变量
	//创建 loop 判断真假
	boolean loop = true;
	 Scanner scanner = new Scanner(System.in);
	 //创建钥匙 让用户输入1-4
	 String key = "";
	 Date date = null;
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	// date = new Date();
	 double money = 0;
	 double balance = 0;
	 String note = "";//消费
	//这种短的1-4的用do-while
	 String details = "----------零钱通明细----------";
	public void mainMnus() {
		 do {
			 System.out.println("\n------零钱通菜单------");
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
			case "4":{
				this.exit();
				break;}
			 default:
				System.err.println("请正确输入1-4");
			}
		} while (loop);
		
	}
	public void detail() {//提示零钱通表格
		System.out.println(details);
		return;
	}
	public void income() {
		System.out.println("收益入账");
		money = scanner.nextDouble();
		date = new Date();
		if (money <=0) {//使用不正确的情况要方便管理些
			System.out.println("请输入大于0的金额");
		}
		balance += money;
		details += "\n收益入账\t"+money +"\t" +sdf.format(date)+
				"\t余额 "+balance;
		return;
	}
	public void pay() {
		System.out.println("支出");
		money =scanner.nextDouble();
		//找出金额不正确情况
		if (money <=0 || money >balance) {
			System.out.println("消费金额应该在0- "+balance);
			return;
		}
		System.out.println("消费说明");
		note =scanner.next();
		balance -= money;
		date = new Date();
		details += "\n"+note +"\t-" + money+"\t"+sdf.format(date)+"\t"+balance;
		return;
	}
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
