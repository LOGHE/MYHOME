package test;
public class ForDetail{
	
	//编写一个main方法
	public static void main (String[]args){
		/*1. for 关键字，表示循环控制
			2. for 有四要素: (1)循环变量初始化(2)循环条件(3)循环操作(4)循环变量迭代
			3. 循环操作 , 这里可以有多条语句，也就是我们要循环执行的代码
			4. 如果 循环操作(语句) 只有一条语句，可以省略 {}, 建议不要省略*/
				for(int i = 1;i<=10;i++) {
					System.out.println("meishi是大帅哥" + i);
				}
		
		
		/*1循环条件是返回一个布尔值的表达式
		2) for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。
		*/
				int f = 1;
				for(; f <=10; ) {
					System.out.println("meishi是个大帅哥"+ f);
					f++;
				}
				System.out.println("f="+ f);
				//补充int g=1;
				//for(;;){表示无限循环，死循环
				//System.out.println("ok"+g++);//无线循环ok1234...
				
				//3) 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代
//				语句，中间用逗号隔开
				int count = 3;
				for (int i1 = 0,j = 0; i1<count;i1++,j+=2) {
					System.out.println("i1="+ i1 + "j=" + j);
				}
	}
	}