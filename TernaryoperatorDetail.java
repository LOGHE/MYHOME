public class TernaryoperatorDetail{
	//编写一个main方法
	public static void main (String[]args){
		////表达式 1 和表达式 2 要为可以赋给接收变量的类型
		//(或可以自动转换/或者强制转换)
		int a = 3;
		int b = 8;
		int c = a>b? (int)1.1:(int)3.3;//可以的强制转换不加（int）不行
		System.out.println(c);//3
		double d = a > b ? a : b + 3;//可以的double比int大所以包容int
		System.out.println(d);//11.0
	}
	
	}