package test;
/*从重复文中用break终止程序
*/
public class Mycontinue1{
	//编写一个main方法
	public static void main(String[]agrs) {
		//重复处理
		for( int i = 0;i<6;i++) {
			if(i == 3 )continue;//在途中,只终止满足条件的地方（i=3)的时候终止它，后面其他地方照常运行
			System.out.println(i);//书上输出为0 1245
		}//8-11为重复文语法
		System.out.println("程序终止");
	}
}