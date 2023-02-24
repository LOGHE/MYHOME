package test1;
public class HomeWork150{
	//编写一个main方法
	public static void main(String[]agrs) {
		//输出小写的a-z和大写的Z-A
		//先化繁为简
		//先定义一个char c = 'a'让其自增到z停止c<=z;c++
		//再创建一个循环定义 char d = 'Z' .....d--
		//代码实现
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println();
		for(char d = 'Z'; d >= 'A'; d--) {
			System.out.print(d + " ");
		}
	  }
	}