public class ForceConvertDetail{
	//编写一个main方法
	public static void main(String[]args) {
		//演示强制类型转换
		//强制符号只针对于最近的的操作数有效，万钢会使用小括号（）提升优先级
		//int x = (int)10*3.5+6*1+1.5;错误的因为有小数表示double类型->int 有运算时也要在运算的内容加括号 
		//下面为改正后的
		int x = (int)(10*3.5+6*1+1.5);//(int)44.0->再强制转化为int为44	
		System.out.println(x);
	
		char c1= 100;
		int m =100;
		//char c2 = m;错误
		char c3 = (char)m;
		System.out.println(c3);//char是字符所有输出为100对应的ASCLL的字符码
	}
}