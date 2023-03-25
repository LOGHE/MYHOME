//11．在测试方法中，调用 method 方法，代码如下，编译正确，试写出 method 方法的定义形式，
//调用语句为： System . out . println ( method ( method (10.0,20.0),100));
//解答：public double method(method(10.0,20.0),100)){.....}

package test7;
public class HomeWork2593 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Employee e1 = new Employee("jake", '男',70,"主席",2300);
		Employee e2 = new Employee("nisa", '女',25);
		Employee e3 = new Employee("歌手",50000);
		System.out.println("e1的情况如下....");
		System.out.println("姓名="+e1.name+" xingbie="+e1.gender+" age="+e1.age+" zhiwei=" 
		+ e1.job+" xingshui="+e1.sal);
		System.out.println("e2的情况如下....");
		System.out.println("姓名="+e2.name+" xingbie="+e2.gender+" age="+e2.age);
	System.out.println("e3的情况如下....");
	System.out.println("zhiwei"+e3.job+" xingshui="+e3.sal);
	}
}
//12．创建一个 Employee 类，属性有（名字，性别，年龄，职位，薪水）,
//提供3个构造方法，可以初始化（1)（名字，性别，年龄，职位，薪水）,
//(2)（名字，性别，年龄）(3)（职位，薪水），要求充分用构造器
class Employee{
	String name;
	String job;
	double sal;
	char gender ;
	int age;
	public  Employee(String job,double sal) {//e3
		this.job = job;
		this.sal=sal;
	}
	public  Employee(String name,char gender ,int age) {//e2
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public  Employee(String name,char gender ,int age,String job,double sal) {//e1
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
		this(name, gender, age);//使用前面的构造器e2
		this.job = job;//这里及以下不能写和上面一样this(job,gender)
		this.sal=sal;
	}
}