/**
 * 
 */
package test8;
import java.sql.Date;
import java.util.Scanner;
/**
 * @author 日暮れて道遠し
 *
 */
public class SmallChangageSys335 {
	public static void main(String[] args) {
		//先化繁为简
		//创建Scanner对象 接收用户输入1-4分别实现调用1-4 消费和入账是默认的
		//打印菜单
		//对应1零钱通明细
		//2收益入账
		//3消费
		//4退出
		//用数组保存 入账和支出和余额
		//还要创建类A335 里面有入账消费余额 时间 属性
		//类里面有两个方法一个是 入账时的计算
		//一个是消费时的计算
//		题目要求明细有三次则创建三个对象
		
		boolean loop = true;//给do-while 添加条件如果为真无限循环  为假则提示
		//题目要求明细有三次则创建三个对象 提高灵活性
		A335 a1 = new A335(100,  "2021-01-21", 0.0);
		A335 a2 = new A335(600,  "2021-01-21", 0.0);
		A335 a3 = new A335(600,  "2021-01-21", 20);
		Scanner scanner = new Scanner(System.in);
		String key ;
//		double [] arr =new double[3];
//		for (int i = 0; i < arr.length; i++) {
//			arr[0] = 100;//入账
//			arr[1] = 0;//消费
//			arr[2] = arr[0] - arr[1];//余额 = 入账-消费
//		}
		
		do {
			System.out.println("------零钱通菜单------");
			System.out.print("\t"+"1 零钱通明细"+"\n"+"\t"+"2 收益入账"+"\n"+ 
			"\t"+"3 消费"+"\n"+"\t"+"4 退出"+"\n");
			System.out.println("请输入1-4查看");
			key = scanner.next();
			switch (key) {
			case "1": {
				System.out.println("------零钱通明细------");
				a1.arr();
				a2.arr();
				a3.arr();
				break;
			}
			case "2":{
				System.out.println("入账"+a1.getRu());
				break;
			}
			case "3":{
				System.out.println("支出"+a1.getXiao());
				break;
			}
			case "4":{
				System.out.println("你选择了退出，程序终止");
				break;
			}
			default:
				System.err.println("请正确输入1-4");
				loop = false;
				break;
			}
			
			//自己写的 for循环 但是项目一般用do- while
//			if (key == "1") {
//				System.out.println("------零钱通明细------");
//				System.out.println("收益入账 +"+ arr[0] + "\t"+time1 +"\t余额:" + arr[2]);
//			}else if (key == 2) {
//				System.out.println("入账"+arr[0]);
//			}else if (key == 3) {
//				System.out.println("支出"+arr[2]);
//			}else if (key == 4) {
//				System.out.println("你选择了退出，程序终止");
//				break;
//			}else {
//				System.err.println("请正确输入1-4");
//			}
		}while(loop);
		System.out.println("退出了零钱通项目");
	}
}

class A335{
	private double ru;
	private double xiao;
	private Date date = null;
	private String shi;
	private double yue ;
	public void arr() {//计算入账时
//	double [] arr =new double[3];
//		ru=arr[0] ;//入账
//		xiao = arr[1];//消费
//		yue = arr[2];
//		arr[2] = arr[0] - arr[1];//余额 = 入账-消费
		yue= ru - xiao;
		System.out.println("收益入账 +"+ ru + "\t"+shi +"\t余额:" + yue);
	}
		
	public void arr1() {//计算消费时
		yue= ru - xiao;
		System.out.println("支出 +"+ xiao + "\t"+shi +"\t余额:" + yue);
	}

	public double getRu() {
		return ru;
	}
	
		public A335(double ru, Date date ,double xiao) {
		super();
		this.ru = ru;
		this.xiao = xiao;
		this.date = date;
	}

		public A335(double ru, String shi,double xiao) {
			super();
			this.ru = ru;
			this.xiao = xiao;
			this.shi = shi;
		}
	
	/**
	 * 
	 */
	public A335() {
		super();
	}
	public void setRu(double ru) {
		this.ru = ru;
	}
	public double getXiao() {
		return xiao;
	}
	public void setXiao(double xiao) {
		this.xiao = xiao;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public double getYue() {
		return yue;
	}
	public void setYue(double yue) {
		this.yue = yue;
	}
	public void name() {
		
	}
	
}