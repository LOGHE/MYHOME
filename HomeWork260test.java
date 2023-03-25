package test7;
public class HomeWork260test {
	//编写一个 main 方法
	public static void main(String[] args) {
		Circle260tset c = new Circle260tset();
		PassObject260 p1 = new PassObject260();
		p1.printAreas(c,5);//5表示下面times循环5次
	}
}
//13．将对象作为参数传递给方法。题目要求：
//(1）定义一个 Circle 类，包含一个 double 型的 radius 属性代表圆的半径， findArea (）方法返回圆的面积。
//(2)定义一个类 PassObject ，在类中定义一个方法 printAreas ()，
//该方法的定义如下： public void printAreas ( Circle c , int times ) //方法签名／声明
//(3)在 printAreas 方法中打印输出1到 times 之间的每个整数半径值，以及对应的面积。
//例如， times 为5，则输出半径1,2,3,4,5，以及对应的圆面积。
//(4）在 main 方法中调用 printAreas (）方法，调用完毕后输出当前半径值。程序运行结果如图所示，
//老韩提示，如果还是不明确，自己画一个内存图，一定可以搞定

class Circle260tset{
	double radius;
//	public  Circle260test(Double radius) {//构造器保存输入的半径值.但是可以不使用构造器
//		this.radius=radius;
//	}
	public double findArea() {//计算面积
		return Math.PI*radius*radius;
	}
	public void name(double radius) {//新建一个方法用来保存半径 后面的类好调用
		this.radius = radius;
	}
}
class PassObject260{
	public void printAreas(Circle260tset c,int times) {//Circle260tset c 表示需要传进去的对象 需要和mian方法里面创建的对象保持一致；
		//times 表示用户输入需要循环的次数
		//Circle260 c = new Circle260(1.0);//不新建对象Circle260 c 麻烦直接mian方法里面创建之后传进来
		System.out.println("当半径="+"\t"+"\t"+"面积=");
		for (int i = 1; i <= times; i++) {
			c.name(i);
			//当用户输入times后 开始给半径赋值 一次递增循环，到5时停止
			//上面是引用Circle260类的对象 c的方法findArea
			System.out.println(c.radius+"\t"+"\t"+c.findArea());
		}
	}
}
	