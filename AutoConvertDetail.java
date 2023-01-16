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
		
		//细节2：当我们把精度（容量大）的数据类型赋值给精度（容量）小的数据类型时，
		//就会报错，繁殖就会进行自动类型转换。
		//int n2 = 1.1;错误double > int
		
		//细节3：（byte，short）和char之间不会相互自动转换
		//当把具体数赋给 byte 时，（1）先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10; //对 ,byte区间为-128 _ 127
		//int n2 = 1;n2是整数对的
		//byte b2 = n2；错误，原因如果是变量赋值，判断类型
		//char c1 = b1;错误，因为byte不能自动转成char
		
		//细节4：byte short char 他们三者可以计算，在计算时首先转换为int类型
		
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1; 会报错 b2+s1 =>int(高精度不能向低精度计算或者转换
		int s2 = b2+ s1;//对 b2 + s1 =>int
		//byte b4 = b2 +b3;//错误 b2 + b3 => int
		
		//boolean 不参与转换
		Boolean pass = true;
		//int num100 = pass;错误 boolean 不参与类型的自动转换
		
		//自动提升原则： 表达结果的类型自动提升为 操作数中最大的类型
		//看一道题
		
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		float num300=1.1f;
		
		float num600 =b4 + s3 + num200 + num300;//也可以
		double num500 =b4 + s3 + num200 + num300;//float可以给double 
		System.out.println(num600);
		System.out.println(num500);
	}
}