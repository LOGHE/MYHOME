package test;
public class DoWhileExersice131{
	//编写一个main方法
	public static void main(String[]agrs) {
		//统计 1---200 之间能被 5 整除但不能被 3 整除的个数
		//先化繁为简
		//先打印1-200的数
		//再筛选出符合条件的数用if和短路与
		//2先死后活
		//int i= 1；
		//dowhile 和if
		int i =1;
		int count  = 0;
		do {
			if(i % 5 ==0&&i %3!=0) {
			System.out.println(i);
			count++;
			}
			i++;
		}while(i<=200);
		System.out.println("共有"+ count+"个");
	}
	}