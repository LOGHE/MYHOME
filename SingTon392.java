/**
 * 
 */
package com.hspedu.codeblock_;

/**
 * @author 日暮れて道遠し
 *
 */
public class SingTon392 {
	public static void main(String[] args) {
		System.out.println(Cat392.n1);//这里只是类加载 不会输出构造器
		System.out.println(Cat392.getInstance());//这里加载了方法 里面创建了对象 会加载构造器
	}
}

//希望在程序运行过程中 只能传教拿cat对象
//使用单例模式 
class Cat392{
	private String name;
	public static int n1 = 999;
	private static Cat392 cat;//只定义一个空实例 比饿汉式节省空间 只有调用方法时才创建实例
	//1构造器私有化
	//2定义一个static静态属性对象
	//3 提供一个公共的static方法 可以提供一个Cat对象
	private Cat392(String name) {
		super();
		this.name = name;
		System.out.println("Cat构造器被调用");
	}
	public static Cat392 getInstance() {
		if (cat == null) {
			cat = new Cat392("小可爱");
		}
		return cat;
	}
	@Override
	public String toString() {
		return "Cat392 [name=" + name + "]";
	}
	
}