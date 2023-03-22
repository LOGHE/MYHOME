package test7;
public class Constructor241 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Person241 p1 = new Person241("king",24);
		Person241 p2 = new Person241("tom");
		System.out.println("p1信息如下"+p1.name + p1.age);
		System.out.println("p2信息如下"+p2.name) ;
		Dog d1 = new Dog();//看下面dog的第一个方法是编译通过不了的，但是显式的定义一下,
		//即: Dog(){} 写 (这点很重要) 这样即便第一个不注销也能编译通过
	}
}

class Dog{
	//如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	//使用 javap 指令 反编译看看
	/*
	默认构造器
	Dog() {
	}
	*/
	
	//一旦定义了自己的构造器,默认的构造器就覆盖了，就不能再使用默认的无参构造器，
	//除非显式的定义一下,即: Dog(){} 写 (这点很重要)
	public  Dog(String dname) {//这样是不能通过的因为没有参数
		//。。。
		
	}
	Dog() { //显式的定义一下 无参构造器 这样可以通过
		
	}
}

//构造器重载 可以有很多个相同方法名的构造器但是要求形参列表不同
class Person241{
	String name;
	int age;
	//第一个构造器
	public  Person241(String pName,int pAge) {
		name = pName;
		age = pAge;
	}
	//第二个构造器
		public  Person241(String pName) {
			name = pName;
		}
	
}