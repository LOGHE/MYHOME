package test;
public class ForExercise124{
	
	//编写一个main方法
	public static void main (String[]args){
		//打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和
		//化繁为简
		//老韩的两个编程思想(技巧)
		//1. 化繁为简 : 即将复杂的需求，拆解成简单的需求，逐步完成 编程 = 思想 --练习-> 代码
		//2. 先死后活 : 先考虑固定的值，然后转成可以灵活变化的值

//		(1) 完成 输出 1-100
		//(2)在输出过程中进行过滤，只输出9的倍数
		//（3）统计个数，定义一个变量int = count = 0;当满足条件时count++;
		//（4)求总和，定义一个变量int sun = 0;当条件满足时sun+=i;
		
		int count = 0;//统计9的倍数的个数变量
		int sum = 0;
		int i = 1;
		for(;i<=100;i++) {
		if(i%9==0) {
			System.out.println(i);
			count++;
			sum +=i;
		}
		}
		System.out.println("9的个数="+count+"个");
		System.out.println("数的总和为"+sum);
	}
	}