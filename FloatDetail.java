public class FloatDetail {
	//编写一个main方法
	public static void main (String[]args) {
		//java 的浮点型常量（具体值）默认为double型，声明float型常量，需后面加‘f’ 或‘F’
		//float num1 =1.1;错误
		float num2 = 1.1f;//对的
		double num3 = 1.1; //对的
		double num4 = 1.1f//对的
				
		//十进制数形式：如5.12 .0f  .512 (前面省略了0，原本为0.512  .不能省略）
		double num5 = .123;//等于0.123
		System.out.println(num5);
		//科学计数法形式：如5.12e2（5.12*10的2次方） 5.12E-2
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512
		
		//通常情况下，应该使用double型，因为它比float型更精准。
		//举例说明 double num9 = 2.1234567851；float num10 = 2.1234567851F；
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);
		System.out.println(num10);
		
		//浮点数使用陷阱：如2.7和 8.1 / 3 比较
		//看看一段代码
		double num11 = 2.7;
		double num12 = 8.1 / 3;//人算为2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//接近2.7的一个小数，而不是2.7.如2.6999999...
//		因此得到一个重要的使用点：当我们对运算结果是小数的 进行相等判断时，要小心
//		应该是以两个数的差值的绝对值，在某个精度范围类判断
		if（ num11==num12){
			System.out.println(“相等”)；
		}
		//正确的写法， ctrl+/ 注释快捷键，再次输入就取消注释
		//if(Math.abs(num11 - num12)){
		//}
		//可以通过Java API 来看 下一个介绍如何使用A
		System.out.println(Math.abs(num11-num12));
	}
}