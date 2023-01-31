package test;

/*根据条件来改变程序运行
if文的使用方法
*/
public class Myif{
	//编写一个main方法
	public static void main(String[]agrs) {
		//变量的宣言和初期化
		int i = 5;
		
		//根据i的值的不同来改变文字
		if(i == 5 )System.out.println("i是5");
		if(i < 5 )System.out.println("i小于5");
		if(i >5 )System.out.println("i比5大");
	}
}