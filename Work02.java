public class Work02{
//	编写一个main方法
	public static void main(String[]agrs) {
		int x = 5;
		int y = 5;
		if (x++ == 6 & ++y == 6) {//逻辑与 必须两个为真才执行
			x = 11;//x++ 先赋值比较再自增 显然6不等于5 所以第一个为false。
			//但是因为这是逻辑与，所以不管第一个是正还是假等二个还是要执行一下，但是不影响结果为假
//			所以y++要执行 先自增再赋值 6 = 6 为真 那么结果不执行但是 y++要执行 y=6
			//所以下面输出x = 6 y = 6
		}
		System.out.println("x=" + x + ",y =" + y );
	}
}