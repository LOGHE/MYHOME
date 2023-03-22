package test7;
public class ConstructorExercise243 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Person243 p1 = new Person243();
		System.out.println("p1信息如下:年龄="+p1.age+p1.name);//因为是无参构造器name输出为默认值null
		Person243 p2 = new Person243("包子",70);
		System.out.println("p2信息如下:年龄="+p2.age+"姓名="+p2.name);
	}
}
class Person243{
	int age ;
	String name;
	//第一个构造器
	public  Person243() {//这里是无参构造器（）里面没有参数 
		age = 18;
	}
	//第二个构造器
	public Person243(String pName,int pAge) {
		age =pAge;
		name = pName;
	}
}