package test7;
public class Method208 {
	//编写一个 main 方法
	public static void main(String[] args) {
		//同类里面的方法调用，直接调用即可
		//不同类（跨类中的A类方法调用B类方法：需要通过对象名调用）在调用类里面创建被调用名的对象 
		A a = new A();
		a.print(4);//调用A类的print（）方法
		a.sayok();//调用A类的sayok()方法,同类方法调用演示
		a.m1();//调用A类的m1.此时的m1调用了不同类 B类的hi.此处演示不同类方法的调用
	}
}
class A{
	public void print(int n ) {
		System.out.println("print()方法被调用 n =" +n);
	}
	public void sayok() {
		print(10);
		System.out.println("继续执行sayok");
		
	}
	//不同类（跨类中的A类方法调用b类方法：需要通过对象名调用）
	public void m1() {
		//创建B对象
		B b = new B();
		b.hi();
	}
}
class B{
	public void hi() {
		System.out.println("B类中的hi（）被执行");
	}
}