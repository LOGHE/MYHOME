/**
 * 
 */
package com.hspedu.static_;

/**
 * @author 日暮れて道遠し
 *
 */
//总结  static 变量是对象共享的傉官static变量在哪里。
//共识1 static 变量是同一个类所有的对象共享
//2 static类变量 在类加载的时候就生成了
//3  类变量是随着类的加载而创建的所有即使没有创建对象实列也可以访问
//例如 System.out.println(child.count);
public class Stactic375 {
		public static void main(String[] args) {
		//定义一个变量 count, 统计有多少小孩加入了游戏
		//int count = 0;
		Child child1 = new Child("白骨精");
		child1.join();
		//count++;
		child1.count++;
		Child child2 = new Child("狐狸精");
		child2.join();
		//count++;
		child2.count++;
		Child child3 = new Child("老鼠精");
		child3.join();
		//count++;
		child3.count++;
		//类变量，可以通过类名来访问
		System.out.println("共有" + Child.count + " 小孩加入了游戏...");
		System.out.println("child1.count=" + child1.count);//3
		System.out.println("child2.count=" + child2.count);//3
		System.out.println("child3.count=" + child3.count);//3
	}
}

class Child { //类
		private String name;
		//定义一个变量 count ,是一个类变量(静态变量) static 静态
		//该变量最大的特点就是会被 Child 类的所有的对象实例共享
		public static int count = 0;
		public Child(String name) {
		this.name = name;
		}
		public void join() {
		System.out.println(name + " 加入了游戏..");
	}
}
