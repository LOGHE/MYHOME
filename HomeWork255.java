package test7;
public class HomeWork255 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		System.out.println("圆的周长="+c1.C()+"圆的面积="+c1.S());
		
		
	}
}
//定义一个圆类 Circle ,定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
//创建类 里面有banjin 有构造器用来接收banjin
//最后因为要返回周长和面积 需要创建两个求值的方法
class Circle{
	double banjin ;
	public  Circle(double banjin) {
		this.banjin=banjin;
	}
	public double C() {
		
		return 2*Math.PI*banjin;
//		S = pai*banjin;
//		System.out.println("圆的周长="+C+"圆的面积="+S);
	}
public double S() {
		return Math.PI*banjin*banjin;
}
}