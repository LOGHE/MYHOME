/*三元运算符
条件表达式  ?  表达式 1: 表达式 2;
运算规则：
1. 如果条件表达式为 true，运算后的结果是表达式 1；
2. 如果条件表达式为 false，运算后的结果是表达式 2；
口诀: [一眼丁真]*/


public class TernaryOperator{
	//编写一个main方法
	public static void main(String[]args) {
		int a = 10;
		int b = 99;
		//解读
		//1 a>b 为false
//		result 执行b--，先返回b的值，然后再自减。 
//		返回结果是99  所以result输出为99
		int result = a > b ? a++:b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
	}
}