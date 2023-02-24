package test1;
public class HomeWork152{
	//编写一个main方法
	public static void main(String[]agrs) {
		//先化繁为简
		//先求出一个int i的1-100的自增
		//i在自增过程中 再创建在一个数 让这个数小于等于i 并自增
		//让拦截的自增数相加sum += 拦截数
		//代码实现
		int sum = 0;//保留所有的和
		for(int i = 1; i <= 100; i++) {//先创建一个自增
			for(int d = 0; d<=i; d++) {// 再创建一个d使其小于等于自增的i ， 并自增， 这样i每自增一个数 d就会出现小于i的若干个数
				sum += d;//让上面的多个数d相加 就得出答案了
			}
		}
		System.out.print(sum);
	}
	}