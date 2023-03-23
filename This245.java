package test7;
public class This245 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Dog245 dog1 = new Dog245("形参", 3);
		System.out.println("dog1的hashkode=" + dog1.hashCode());//等于下面dog1的this的hashcode
		dog1.info();//调用方法
		Dog245 dog2 = new Dog245("大黄", 10);//这里会在堆新建一个空间
		System.out.println("dog2的hashkode=" + dog2.hashCode());//等于下面新开的对象dog2的this的hashcode
		dog2.info();
	}
}

class Dog245{
	String name;
	int age;
//	public  Dog245(String dName ,int dAge) {//构造器
//      name = dName;
//      age = dAge;
//	}
	public void info() {//成员方法,输出属性x的信息
		System.out.println(name +"\t" + age + "\t");
		 System.out.println("方法的this的hashkode=" + this.hashCode()+"\n");
	}
	
	//如果我们构造器的形参，能够直接写成属性名，就更好了
	//但是出现了一个问题，根据变量的作用域原则
	//构造器的 name 是局部变量，而不是属性
	//构造器的 age 是局部变量，而不是属性
	//***引出this关键字来解决
//	public  Dog245(String name ,int age) {//构造器 如果name和age不区分那么输出为null和0
//	      name = name;
//	      age = age;
//		}
	
	//用this来解决上面命名不好区分的问题
	public  Dog245(String name ,int age) {//构造器 
		//this.name就是当前对象的属性
		//this.age就是当前对象的属性
	      this.name = name;
	      this.age = age;
	      System.out.println("构造器的this的hashkode=" + this.hashCode());
		}
}