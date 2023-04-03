/**
 * 
 */
package com.hspedu.homework_346___;
	public class HomeWork348 extends Test{//子类
		public static void main(String[] args) {
			new HomeWork348().test();//匿名对象
			//new HomeWork348() 先访问父类无参构造器 输出里面的内容 test 再输出自己构造器的 Demo
			//然后 再调用自己的方法test() 输出 rose和 jack
			new HomeWork348("john").test();
			//先给自己有参构造器传入 john ,执行自己的有参构造器，
			//自己有参构造器把john 传给父类有参构造器 改变父类的属性name。构造器没有输出的值
			//然后 再调用自己的方法test(); 输出已经改变的父类属性name的 john 和本属性不变的jack
		}
		String name = "jack";
		public HomeWork348() {
			super();
			System.out.println("Demo");
		}
		public HomeWork348(String s) {
			super(s);
		}
		public void test() {
			System.out.println(super.name);
			System.out.println(this.name);
		}
	}

 
class Test{//父类
	String name ="rose";
	 Test() {
		System.out.println("test");
	}
	 Test(String name) {
		super();
		this.name = name;
	}
}
