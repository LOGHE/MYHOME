package test6;
public class ArrayhensExercise156{
	//编写一个main方法
	public static void main(String[]agrs) {
		//一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。
		//请问这六只鸡的总体重是多少?平均体重是多少? 请你编一个程序
		//先化繁为简
		//先定义一组数组
		//再进行循环
		//再在循环里面继续和 运算 和平均值运算。先建立两个保存sum和平均值的变量
		//统计数组的个数用 hens.length
		double totalweight = 0;//求和
		double[] hens = {3,5,1,3.4,2,50};//定义鸡群
		for (int i = 0; i < hens.length; i++) {//打印循环，打印出数组中的每一个数
			//System.out.println("第" + (i+1) + "个元素的值=" + hens[i]);
			totalweight += hens[i];//求和
		}
		System.out.println("鸡群的总和="+ totalweight + "\n"+"鸡群的平均重="+totalweight/hens.length);
		
	}
	}