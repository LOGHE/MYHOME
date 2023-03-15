package test7;
public class Recursion228{
	//编写一个main方法
	public static void main (String[]agrs) {
		T t1= new T();
		t1.test(4);
		int res = t1.factorial(5);
		System.out.println(res);
	}
}

class T{
	//分析
	public void test(int n ) {
		if(n > 2) {
			test(n - 1);
		}//else {
//		System.out.println("n="+n);
//		}
	}
//	factorial阶乘
	public int factorial(int n) {
		if(n == 1){
		return 1;
		
	}else {
		return factorial(n - 1)*n;
	}
	}
}
