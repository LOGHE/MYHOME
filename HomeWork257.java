package test7;
public class HomeWork257 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Dog123 dog = new Dog123("小白", "白色", 3);
		dog.show();
		
	}
}
//7、设计一个 Dog 类，有名字、颜色和年龄属性，定义输出方法 show (）
//显示其信息。并创建对象，进行测试、【提示 this ．属性，自己做】
class Dog123{
	String name;
	String color;
	int age;
	public Dog123(String name,	String color,int age) {//构造器
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show() {//输出方法
		System.out.println("小狗的名字为"+name);
		System.out.println("小狗的颜色为"+color);
		System.out.println("小狗的年龄为"+age);
	}
	
}