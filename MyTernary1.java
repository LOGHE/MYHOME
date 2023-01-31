package test;
/*根据条件来改变程序运行
switch-case文的使用方法
*/
public class MyTernary1{
	//编写一个main方法
	public static void main(String[]agrs) {
		//变量的宣言和初期化
		int i = -10;
		int j = (i<0) ? (-i):(i);//如果表达式为true运行-i false运行i
		System.out.println(j);//j= 10
	}
}