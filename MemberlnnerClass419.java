 /**
 * 
 */
package com.hspedu.innerclass_;

import com.hspedu.innerclass_.Outer08.Inner08;

/**
 * @author 日暮れて道遠し
 *
 */
public class MemberlnnerClass419 {
	public static void main(String[] args) {
		Outer08 outer08 = new Outer08();
		outer08.t1();
		System.out.println("第一种方法=========");
		//外部其他类，使用成员内部类的三种方式
		//老韩解读
		// 第一种方式
		// outer08.new Inner08(); 相当于把 new Inner08()当做是 outer08 成员
		// 这就是一个语法，不要特别的纠结.
		Outer08.Inner08 inner08 = outer08.new Inner08();
		inner08.say();
		System.out.println("第二种麻烦=========");
		//第二种方式
		// 第二方式 在外部类中，编写一个方法，可以返回 Inner08 对象
		Outer08.Inner08 inner082 = outer08.inner08Insetance();
		outer08.inner08Insetance().say();//这个调用起来麻烦 每次都得这么长
		//解析上面是将outer08.inner08Insetance();这个方法返回的成员内部类保存到 inner082类里面
		//这样调用起来就方便了不是吗
		System.out.println("第二种方便=========");
		inner082.say();
		System.out.println("第三种方便=========");
		new Outer08().new Inner08().say();
	}
}

class Outer08{//外部类
	private int n1 =10;
	public String name ="罗";
	//成员内部类是定义在外部类的成员位置 可以添加任何修饰符 因为他本身就是成员
	class Inner08{
		private int n1 = 20;
		//如果成员内部类的成员和外部类的成员重名，会遵守就近原则. 
		//可以通过 外部类名.this.属性 来访问外部类的成员
		private double sal = 9.9;
		public void say() {//成员内部类
			System.out.println("n1= " + Outer08.this. n1 + "  name=" + name);
			//可以通过 外部类名.this.属性 来访问外部类的成员
		}
	}
	public void t1() {
		//使用成员内部类
		//创建成员内部类的对象，然后使用相关的方法
		Inner08 inner08 = new Inner08();
		inner08.say();
		System.out.println("sal="+inner08.sal); 
	}
	public Inner08 inner08Insetance() {
		return 	new Inner08();
	}
}