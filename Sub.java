/**
 * 
 */
package com.hspedu.extend;

/**
 * @author 日暮れて道遠し
 *
 */
public class Sub extends Base{
		/**
		 * 
		 */
//	子类最多只能继承一个父类(指直接继承)，即 java 中是单继承机制。
//	思考：如何让 A 类继承 B 类和 C 类？ 【A 继承 B， B 继承 C】(自己认爹不成，让爹去认，这样爹的爹就和自己有关系了)

	//构造器里面调用构造器
	public  Sub(String name,int age) {//super 表示调用父类的构造器
		super("king",28);//表示调用父类的无参构造器，也可以不屑super 默认调用无参构造器
		System.out.println("子类的Sub(String name,int age)构造器被调用");
	}
		public Sub() {//构造器
			super("徐福", 23);
			// TODO 自动生成的构造函数存根
			System.out.println("子类的第一个无参构造器sub()...被调用");
		}
		public Sub(String name) {
			//当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，
//如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则编译不会通过
			super("tom",22);
			System.out.println("子类的第二个有参构造器Sub()被调用");
		}
		public void sayOk() {
			//非私有的属性和方法可以再子类直接访问
			//但是私有的n4不能直接访问，但是可以间接访问，通过公开的方法类等等访问hi访问n4
			System.out.println("n1="+n1+" n2="+n2+" n3="+n3);//n4不行
			test100();
			test200();
			test300();
			System.out.println(getN4());
			calltest400();
		}
}
