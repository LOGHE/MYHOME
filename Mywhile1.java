package test;
/*进行重复操作的程序
while文的使用方法
*/
public class Mywhile1{
	//编写一个main方法
	public static void main(String[]agrs) {
		//变量的宣言和初期化
		int i = 0;
		//重复操作处理
		while( i < 5 ){//i<5为条件
			System.out.println(i);
			i++;//11-13行为while的重复操作处理  //i取0执行两次 1 2 3  完了下面+1  输出01234
		}
	}
}