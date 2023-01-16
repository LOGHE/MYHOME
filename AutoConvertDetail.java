public class AutoConvertDetail{
	//编写一个main方法
	public static void main(String[]args) {
		//有很多种类型的数据混合运算时,
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;//ok
		//float d1 = n1 + 1.1;//错 n1 + 1.1 的结果类型为double类型
		//double d1 = n1 + 1.1;对的 结果类型是double类型
		float d1 = n1 + 1.1f;//对的 n1 + 1.1(float类型要在数字后面加f  表示低精度小数）是float类型
		System.out.println(n1);
		System.out.println(d1);
	}
}