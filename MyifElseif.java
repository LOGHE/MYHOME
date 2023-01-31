package test;

/*根据条件来改变程序运行
if文的使用方法
*/
public class MyifElseif{
	//编写一个main方法
	public static void main(String[]agrs) {
		//变量的宣言和初期化
		int i = 6;
		//根据i 的值改变表示的文字
		if ( i == 5 ) {
			System.out.println("i = 5");
		} else if (i == 6 ) {
			System.out.println("i = 6");
		} else if (i > 5 ) {
			System.out.println("i大于5");
		} else {
			System.out.println("i是5，6以外5以下");
		}
		System.out.println("结束");
	}
}