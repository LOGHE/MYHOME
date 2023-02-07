package test;
public class Dowhile131{
	//编写一个main方法
	public static void main(String[]agrs) {
		//计算 1—100 的和 
		//先化繁为简
		//用dowhile打印出1-100
		//先int i= 1；
		//再用语法do{
		//System.out.println(i)
		//}while(i<=100)i++;
		int i = 0;
		int num =0 ;
		do {
			System.out.println("num=" + num);
			i++;
			num += i;
		}while(i<=100);
	}
	}