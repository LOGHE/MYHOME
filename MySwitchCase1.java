package test;
/*根据条件来改变程序运行
switch-case文的使用方法
*/
public class MySwitchCase1{
	//编写一个main方法
	public static void main(String[]agrs) {
		//变量的宣言和初期化
		int i =6;
		//i的值来改变表示的文字
		switch(i) {
		case 5:
			System.out.println("i是5");
			break;//表示终止
		case 6:
			System.out.println("i是6");
			break;
			default:
				System.out.println("i值是5,6以外");
		}
		System.out.println("结束");
	}
}