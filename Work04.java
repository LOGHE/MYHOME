public class Work04{
//	编写一个main方法
	public static void main(String[]agrs) {
		int x = 5;
		int y = 5;
		if (x++ == 6 | ++y == 6) {//逻辑或 规则条件 1|条件 2 只要有一个条件成立，结果为 true,否则为 false
			// x++ 先赋值比较 6 不等于5 为false 但是要自增加1 x= 6 . 
			//不管第一个条件是否为 true，第二个条件都要判断，效率低
//			++y 先自增再赋值比较  等于6  6=6 为真 结果为真  x 取结果值x = 11
			 //x 输出11 y输出6
			x = 11;
			
		}
		System.out.println("x=" + x + ",y =" + y );
	}
}