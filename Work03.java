public class Work03{
//	编写一个main方法
	public static void main(String[]agrs) {
		int x = 5;
		int y = 5;
		if (x++ == 6 || ++y == 6) {//短路或 规则两个其中一个为真结果为真。
//			和逻辑或的区别是短路或第一个为真不管第二个是否为真假都不会去执行判断了
//			x++ 先赋值比较再自增 为假 但还是要自增一下 x= 6
			//y 为真 先自增再赋值比较 6 = 6 结果为真 执行x取值11
			x = 11;
//			输出结果x = 11 y=6
		}
		System.out.println("x=" + x + ",y =" + y );
	}
}