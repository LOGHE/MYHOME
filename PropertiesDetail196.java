package test7;
public class PropertiesDetail196 {
	//编写一个 main 方法
	public static void main(String[] args) {
	//创建 Person 对象
	//p1 是对象名(对象引用)
	//new Person() 创建的对象空间(数据) 才是真正的对象
	Person p1 = new Person();
	//对象的属性默认值，遵守数组规则:
	//int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，
	//boolean false，String null
	System.out.println("\n 当前这个人的信息");
	/*1) 先声明再创建
	Cat cat ; //声明对象 cat
	cat = new Cat(); //创建
	2) 直接创建
	Cat cat = new Cat();
	7.1.12 如何访问属性
	 基本语法
	对象名.属性名;
	案例演示赋值和输出
	cat.name ;
	cat.age;
	cat.color*/
	System.out.println("age=" + p1.age + " name=" + p1.name + 
			" sal=" + p1.sal + " isPass=" + p1.isPass) ;
	}
	}
	class Person {
	//四个属性
	int age;
	String name;
	double sal;
	boolean isPass;
	}
