package test7;
public class CopyMethodExercise213 {
	//编写一个 main 方法
	public static void main(String[] args) {
		 HHH p = new HHH();
		 p.name = "jake";
		 p.age = 20;
		 //创建一个tools对象
		 Mytools tools = new Mytools();
		HHH p2= tools.copyPers(p);
		//到此 p和p2是两个独立的对象
		p2.age=30;
		System.out.println(p2.age + p2.name);//p2的克隆独立个体
		System.out.println(p.age+p.name);//p
	}
}
class HHH{
	String name;
	int age;
}
class Mytools{
//	编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。克隆对象， 注
	//意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
	//编写方法思路
	//1 方法的返回类型  HHH
	//2方法的名字  copyPerson
	//3方法的形参 (HHH p)
	//4方法体 创建一个新对象，并复制属性，返回即可
	public HHH copyPers(HHH p) {
		HHH p2 = new HHH();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
	
}