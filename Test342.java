/**
 * 
 */
package test8;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * @author 日暮れて道遠し
 *
 */
public class Test342 {
	public static void main(String[] args) {
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
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化的
	 double money = 0;
	 double balance = 0;
	 String note = "";//消费
	//这种短的1-4的用do-while
	 String details = "----------零钱通明细----------";
	 System.out.println();
	 do {
		 System.out.println("\n------零钱通菜单------");
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
			money = scanner.nextDouble();
			date = new Date();
			if (money <=0) {//使用不正确的情况要方便管理些
				System.out.println("请输入大于0的金额");
			}
			balance += money;
			details += "\n收益入账\t"+money +"\t" +sdf.format(date)+
					"\t余额 "+balance;
			break;
		}
		case "3":{
			System.out.println("支出");
			money =scanner.nextDouble();
			//找出金额不正确情况
			if (money <=0 || money >balance) {
				System.out.println("消费金额应该在0- "+balance);
				break;
			}
			System.out.println("消费说明");
			note =scanner.next();
			balance -= money;
			date = new Date();
			details += "\n"+note +"\t-" + money+"\t"+sdf.format(date)+"\t"+balance;
			break;
			}
		case "4":{
			String choice = "";
			while (true) {//加入条件只有输入 yn时才停止 其他输入会一直循环
				System.out.println("你确定退出吗？y/n");
				choice = scanner.next();
			if ( "y".equals(choice)|| "n".equals(choice)) {
				break;
			}
			}
			if ("y".equals(choice)) {
				loop = false;//这里返回false是用户输入y之后直接跳出do - while循环 输出“您已经退出”
			}
			
		}
		break;//当用户输入n调出当前case4循环回到最开始
		default:{
			System.err.println("请正确输入1-4");
			loop = false;
			break;
		}
		}
	} while (loop);
	 System.out.println("您已退出");
	}
}
