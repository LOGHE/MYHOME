package test7;
public class Method201 {
	//编写一个 main 方法
	public static void main(String[] args) {
//添加 speak 成员方法,输出 “我是一个好人” 2) 添加 cal01 成员方法,可以计算从 1+..+1000 的结果
//添加 cal02 成员方法,该方法可以接收一个数 n，计算从 1+..+n 的结果
//添加 getSum 成员方法,可以计算两个数的和代码
		Per p1= new Per();//创建一个新对象
		//方法写好后不去调用是不会输出的
		p1.speak();//调用方法speak
		p1.cal01();//调用方法cal01
		p1.cal2(5);
		p1.getsum(20, 10);
	}
	}

class Per {//创建对象
	//属性
	String name;
	int age;
	//成员方法
	//public 表示方法是公开
	//void 表示方法没有返回值
	//speak()：speak是方法名 （）是形参列表
	//{}方法体，可以写我们要执行的代码。
	//System.out.println("我是一个好人");表示我们的方法就是输出一句话
	public void speak(){//方法
		System.out.println("我是一个好人");
	}
	public void cal01(){
		int sum = 0;
		for (int i = 1; i <=100 ; i++) {
			sum += i;
		}
		System.out.println("1-100的和="
				+ ""+sum);
	}
	public void cal2(int n ) {
		int sum =0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("输入n的值后循环得到的和=" + sum);
	}
	public void getsum(int n ,int m) {
		int sum = 0;
		sum = n+m;
		System.out.println("用户输入两个值相加后的结果=" +sum);
	}
}