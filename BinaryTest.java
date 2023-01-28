/*进制介绍
对于整数，有四种表示方式：
二进制：0,1 ，满 2 进 1.以 0b 或 0B 开头。
十进制：0-9 ，满 10 进 1。
八进制：0-7 ，满 8 进 1. 以数字 0 开头表示。
十六进制：0-9 及 A(10)-F(15)，满 16 进 1. 以 0x 或 0X 开头表示。此处的 A-F
*/
//演示


	public class BinaryTest {
			//编写一个 main 方法
			public static void main(String[] args) {
			//n1 二进制
			int n1 = 0b1010;
			//n2 10 进制
			int n2 = 1010;
			//n3 8 进制
			int n3 = 01010;
			//n4 16 进制
			int n4 = 0X10101;
			System.out.println("n1=" + n1);
			System.out.println("n2=" + n2);
			System.out.println("n3=" + n3);
			System.out.println("n4=" + n4);
			System.out.println(0x23A);
			}
		}