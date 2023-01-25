/*演示运算符使用
*/

/*面试题1
		int i = 1;//i = 1
		i = i++;//规则使用零时变量；（1）temp = i(第一个被1赋值的i）; i = i++ 是先赋值给i再加1 所以第二个i（等号前的i）等于1
		//(2)i（第二个）i = i（第一个i) + 1;
		//(3)i = temp=1;后项赋值給前项反着来的
		System.out.println(i);//输出1。i = i++ 是先赋值给i再自增加1 所以第二个i（等号前的i）等于1
		
		int i = 1;//i = 1
		i = ++i;//规则使用零时变量；（1）i = i+1=2;(2)temp = i=2; (3)i = temp=2;后项赋值給前项反着来的
		System.out.println(i);//输出2。i = ++i  是先自增加1再赋值1给i 所以第二个i（自增后加i）等于2
		*/
public class ArithmeticOperator{
	//编写一个main方法
	public static void main(String[]args){
		//使用
		System.out.println(10/4);//数学角度等于2.5 但是java中默认运算为输出为2
		System.out.println(10.0/4);//java是2.5
//		注释快捷键ctrl+ /  取消也是一样的
		double d = 10/4; //java中10/4 = 2， 2高精度变成2.0
		System.out.println(d);
		
		//% 取模取余
		//在%的本质 看一个公式!!!! a % b = a - a / b *b
		// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		// 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		// -10 % -3 = (-10) - (-10) / (-3) * (-3)
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); // -1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3);//-1
		//++的使用
		//
		int i = 10;
		i++;//自增 等价于 i = i + 1; => i = 11
		++i;//自增 等价于 i = i + 1; => i = 12
		System.out.println("i=" + i);//12
		/*
		作为表达式使用
		前++：++i 先自增后赋值
		后++：i++先赋值后自增
		*/
		int j = 8;
		//int k = ++j; //等价 j=j+1;k=j;
		int k = j++; // 等价 k =j;j=j+1;
		System.out.println("k=" + k + "j=" + j);//8 9
		
	}
	
}