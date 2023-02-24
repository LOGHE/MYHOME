package test1;
public class HomeWork151{
	//编写一个main方法
	public static void main(String[]agrs) {
		//先打印double的 1-100
		//再加入每打印一个除以1
		//再筛选质数和偶数质数为正+ 偶数为-
		//代码实现
		double d = 0;
		double t = 0;
		double j = 0;
		for(double h = 1; h <= 100; h++) {
			if(h % 2 == 0) {//筛选偶数
				d += 1 /h;//偶数分之一自增
			//System.out.print(h);
			}else {//反之为质数
				t -= 1/h; //质数分之一相减
			}
		}
		j = d + t;//求出质数偶数分之一的和
		System.out.print(j);
	}
	}