/**
 * 
 */
package test8;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author 日暮れて道遠し
 *
 */
public class SmallChangageSys340 {
	public static void main(String[] args) {
//  1) 先完成显示菜单，并可以选择
//	2) 完成零钱通明细. 
//	3) 完成收益入账
//	4) 消费
//	5) 退出
//6) 用户输入4退出是，给出提示“你确定要退出吗？y/n”，必须输入正确的y/n 否则循环输入指令 知道输入y 或者 n
// 7）在收益入账和消费时 判断金额是否合理 并给出相应的提示
		//定义相关变量
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
		
		System.out.println();
		do {
			System.out.println("------零钱通菜单------");
			System.out.print("\t"+"1 零钱通明细"+"\n"+"\t"+"2 收益入账"+"\n"+ 
			"\t"+"3 消费"+"\n"+"\t"+"4 退出"+"\n");
			System.out.println("请输入1-4查看");
			key = scanner.next();
			switch (key) {
			case "1": {
				System.out.println(details);
				
				break;
			}
			case "2":{
				System.out.println("收益入账");
				money =scanner.nextDouble();
				//找出不正确的金额条件给出提示，就直接break
				if (money <=0 ) {
					System.out.println("收益金额要大于0");
					break;
				}
				date =new Date(0);
				barance += money;
				//拼接收益入账信息到 details
				//System.out.println(sdf.format(date));
				details += "\n收益入账\t"+money +"\t" +sdf.format(date)+
						"\t"+barance;
				break;
			}
			case "3":{
				System.out.println("支出");
				money =scanner.nextDouble();
				//找出金额不正确情况
				if (money <=0 || money >barance) {
					System.out.println("消费金额应该在0- "+barance);
					break;
				}
				System.out.println("消费说明");
				note =scanner.next();
				barance -= money;
				date =new Date(0);
				details += "\n"+note +"\t-" + money+"\t"+sdf.format(date)+"\t"+barance;
				break;
			}
			case "4":{
				//接收用户是否退出
				String choice = "";
				while (true) {
					System.err.println("你确定退出吗？y/n");
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
			break;
			default:
				System.out.println("请正确输入1-4");
				loop = false;
				break;
			}
		}while(loop);
		System.out.println("退出了零钱通项目");
	}
}

