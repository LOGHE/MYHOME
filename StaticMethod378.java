/**
 * 
 */
package com.hspedu.static_;

/**
 * @author 日暮れて道遠し
 *
 */
public class StaticMethod378 {
	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建两个学生实例，交学费
		Stu tom = new Stu("tom");
		tom.payFee(100);
		
		Stu maryStu = new Stu("mary");
		maryStu.payFee(200);
		
		//输出当前收到的总学费
		Stu.showFee();
		//单独输出静态变量
		System.out.println("16开平方得到" + Math.sqrt(16));
		
	System.out.println(MyTools.calSun(20, 40));	
	}
}


class MyTools{
	//求和
	public static double calSun(double n1,double n2) {
		return n1 + n2;
	}
}
class Stu{
	private String name;//普通成员
	//定义一个静态变量 来积累学生的学费
	private static double fee = 0;
	public Stu(String name) {
		super();
		this.name = name;
	}
	
	//1当方法使用了static修饰后，该方法就是静态方法
	//2静态方法就可以访问静态属性/变量
	public static void payFee(double fee) {
		Stu.fee += fee;
	}
	public static void showFee() {
		System.out.println("学费总计为" + Stu.fee);
	}
}