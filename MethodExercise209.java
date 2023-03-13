package test7;
public class MethodExercise209 {
	//编写一个 main 方法
	public static void main(String[] args) {
//		1) 编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolea
//		2) 根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果
		AA aa = new AA();
		if(aa.isodd(1)) {//num为真输出奇数 反之输出偶数
			System.out.println( "是一个奇数");
		}else {
			System.out.println("是一个偶数");
		}
		System.out.println();
		aa.jin(5,5,'#');
	}
}
class AA{
	//思路
	//1 方法的返回类型  boolean
	//2方法的名字 isodd
	//3方法的形参 (int num)
	//4方法体 public
	public  boolean isodd(int num) {
//		if(n %2 !=0) {
//			return true;
//		}else {
//		return false;
//		}
		return num % 2 !=0;
	}
	public void jin(int n,int t,char c) {
		//思路分析
		/*
		####
		####
		####
		####
		*/
		//1 方法的返回类型  void
		//2方法的名字 jin
		//3方法的形参 (int n)
		//4方法体 public
		//两重循环 第一层为4 第二层也为4 就ok了
		for (int i = 0; i <n ; i++) {
			for (int j = 0; j < t; j++) {
			System.out.print(c);
			}
			System.out.println();
		}
	}
	}