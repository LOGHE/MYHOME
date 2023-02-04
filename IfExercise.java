package test;
public class IfExercise{
	//编写一个main方法
	public static void main(String[]agrs) {
		//声明两个double的值
		double d1=15.0;double d2 = 19.3;
		if(d1>10.0&&d2<20.0) {
			System.out.println("两个数之和=" + (d1 + d2));
		}
		//【课后自己练】定义两个变量 int，判断二者的和，是否能被 3 又能被 5 整除，打印提示信
		//先定义两个int
		//判断二者之后用两套if 加入条件
		int num1 = 20;
		int num2 =  40;
		int sum = num1+num2;
		if(sum%3 == 0 && sum%5 == 0 ) {
			System.out.println("能被5和5同时整除");
		}else {
			System.out.println("不能被整除");
		}
//		判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
		//(1)年份能被 4 整除，但不能被 100 整除；(2)能被 400整除
		int num = 2054;
		if((num%4 == 0 && num%100!=0) || num%400 == 0) {
			System.out.println(num + "年是闰年");
		}else {
			System.out.println(num + "年不是闰年");
		}
	}
}