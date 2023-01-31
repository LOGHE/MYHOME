package test;
/*从重复文中用break终止程序
*/
public class Mybreak1{
	//编写一个main方法
	public static void main(String[]agrs) {
		//重复处理
		for( int i = 0;i<6;i++) {
			if(i == 3 )break;//在途中满足条件的地方，终止全文都终止
			System.out.println(i);
		}//8-11为重复文语法
		System.out.println("程序终止");
	}
}