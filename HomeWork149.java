package test1;
public class HomeWork149{
	//编写一个main方法
	public static void main(String[]agrs) {
		//输出1-100不能被5整除的数，每五个一行
		//先化繁为简
		//先打印出1-100
		//再筛选不能被五整除的数
		//再打印每五个一行
		int n = 0;//记录循环次数
		for(int i = 1;i<=100; i++) {//打印出1-100
			if(i % 5 != 0) {//筛选满足不能被5整除的数
				System.out.print(i + "\t");//每个数完了隔空
				n +=1;//记录自增次数
				if(n % 5 == 0) {//当上面每自增次数为5 次时换行
					System.out.println();
				}
			 }
		   }
	    }
	 }