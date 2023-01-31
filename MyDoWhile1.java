package test;
/*进行重复操作的程序
while文的使用方法
*/
public class MyDoWhile1{
	//编写一个main方法
	public static void main(String[]agrs) {
		//变量的宣言和初期化
		int i=0;
		//重复操作处理
		do {
			System.out.println("i = " + i);//想要做的处理
			i++;//同上
		}while(i<5);//i<5为条件
		//11-15行为do-while的重复处理
		//输出书上为01234
	}
}