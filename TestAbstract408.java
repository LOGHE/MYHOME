/**
 * 
 */
package com.hspedu.interface_;

/**
 * @author 日暮れて道遠し
 *
 */
public class TestAbstract408 {
	public static void main(String[] args) {
		LittleMonkey littleMonkey = new LittleMonkey("猴哥");
		littleMonkey.climbing();//继承 与生俱来会爬树
		littleMonkey.flying();//接口 相当于抽象类 通过连接给其赋予新的技能 像鸟一样飞翔
		littleMonkey.swimming();//接口 相当于抽象类 通过连接给其赋予新的技能 像鱼一样游泳
	}
}


//猴子子类
class LittleMonkey extends Monkey implements Fishable,Birdable{
	public LittleMonkey(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void flying() {
		// TODO 自动生成的方法存根
		System.out.println(getName()+"通过努力学习猴子会飞翔");
	}

	@Override
	public void swimming() {
		// TODO 自动生成的方法存根
		System.out.println(getName()+"通过努力学习猴子会游泳");
	}
}

//猴子父类
class Monkey{
	private String name;

	public Monkey(String name) {
		super();
		this.name = name;
	}
	public void climbing() {
		System.out.println(getName()+"猴子会爬树");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
//接口
interface Fishable{
	public void swimming();
}
interface Birdable{
	public void flying();
}