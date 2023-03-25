package test7;
public class TestPerson251 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Person251 p1 = new Person251("张三", 23);
		Person251 p2 = new Person251("张三", 23);
		System.out.println(p1.CompareTo(p2));
		
		
	}
}

/*
定义 Person 类，里面有 name、age 属性，并提供 compareTo 比较方法，
用于判断是否和另一个人相等，提供测试类 TestPerson 用于测试, 
名字和年龄完全一样，就返回 true, 否则返回 fals*/

class Person251{
	String name;
	int age;
	public  Person251(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public boolean CompareTo(Person251 P) {//P表示暂时为空值 上面用来传入p2
//		if(this.name.equals(P.name)&&this.age == age) {
//			return true;
//		}else {
//			return false;
//		}
		return this.name.equals(P.name)&&this.age == age;
		//因为语法，都为一样就输出真，不一样输出false
	}
	
}