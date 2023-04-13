/**
 * 
 */
package com.hspedu.codeblock_;

/**
 * @author 日暮れて道遠し
 *
 */

//饿汉式 单例模式
public class SingleTon391 {
	public static void main(String[] args) {
		//通过方法可以获取对象
		GirlFriend instance = GirlFriend.getInstance();
		System.out.println(instance);
		GirlFriend g1 = instance;
		System.out.println(g1);//小红
//		new GirlFriend();new 不了新对象因为受保护
	}
}

//只有一个类GirlFriend
//只有有一个伴侣
class GirlFriend{
	private String name;
	private static GirlFriend gf = new GirlFriend("小红");
	//只能创建一个对象
	//1 将构造器私有化
	//2 在其内部直接创建
	//3 提供一个公共的statuc方法返回对象gf
	public static GirlFriend getInstance() {
		return gf;
	}
	private  GirlFriend(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return " name=" + name ;
	}
	
	
}