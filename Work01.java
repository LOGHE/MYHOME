public class Work01{
//	编写一个main方法
	public static void main(String[]agrs) {
		int x = 5;
		int y = 5;
		if (x++ == 6 && ++y == 6) {//短路与  规则要两个都为真才运算，其中一个为假两个都不执行
			x = 11;//x++ 6先赋值给x，显然x不等于6为false。整句话结果为假，但是第一个x++还是要自增。
			//++y先自增后赋值，自增1后前面的y就等于6，等号后面的6赋值给y（6）二者相等。为true
			//根据短路与的规则 要两个都为真才运算，其中一个为假两个都不执行。
			//所以下面输出x = 自增后的6   y因为不执行是最开始的5
		}
		System.out.println("x=" + x + ",y =" + y );
	}
}