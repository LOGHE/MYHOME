package test1;
import java.util.Scanner;
public class ForExercise136{
	//编写一个main方法
	public static  void main(String[]agrs) {
		//打印出九九乘法表
		//1化繁为简
		//先定义1到9的乘法
		//再在外面套一层 1-9的变量这样就1-9自乘一个不漏
		//2先死后活,把可以替换的变量替换成其他的代替如heng  shu等等
		int heng =1;
		int shu = 1;
		 for(int j = shu; j<=9; j++) {
		for(int i = heng;i<= j; i++) {	//i<=j是避免重复相乘
			System.out.println(  j+ "*"+i + "="  +(i*j));	
		}
			}
		}
	}
