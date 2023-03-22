package test7;
public class Constructor240 {
	//编写一个 main 方法
	public static void main(String[] args) {
		//当我们new一个对象时就直接通过构造器指定名字和年龄 如下：
		Person240 p1 =new Person240("smith", 80);
		System.out.println("p1的信息如下：");
		System.out.println("p1的姓名=" + p1.name);
		System.out.println("p1的年龄=" + p1.age);
	}
}

//在创建人类的对象时就直接指定这个对象的年龄和姓名
class Person240{
	String name;
	int age;
	//构造器
	//1)构造器的修饰符可以默认， 也可以是 public protected private
	//2) 构造器没有返回值
	//3) 方法名 和类名字必须一样
	//4) 参数列表 和 成员方法一样的规则 Person240
	//(String pname,int pAge)是构造器的形参列表，规则和成员方法一样
	//5) 构造器的调用, 由系统完成
	public Person240(String pname,int pAge) {//构造器没有返回值
		System.out.println("构造器被调用");
		name = pname;
		age = pAge;
	}
	
}