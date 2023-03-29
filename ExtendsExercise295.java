/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class ExtendsExercise295 {

	
	public static void main(String[] args) {
	C c = new C();
	}
	}

		class A {//A 类
		public A() {
		System.out.println("我是 A 类");
		}
		}
		class B extends A { //B 类,继承 A 类 //main 方法中： C c =new C(); 输出么内容? 3min
		public B() {
			super();
		System.out.println("我是 B 类的无参构造");
		}
		public B(String name) {
		System.out.println(name + "我是 B 类的有参构造");
		}
		}
		class C extends B { //C 类，继承 B 类
		public C() {
		this("hello");//和super只能有一个这里就没有隐藏的super 了
		System.out.println("我是 c 类的无参构造");
		}
		public C(String name) {
		super("hahah");
		System.out.println("我是 c 类的有参构造");
		}
		}
