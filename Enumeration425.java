/**
 * 
 */
package com.hspedu.enum_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Enumeration425 {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.AUTUMN);
		System.out.println(Season.WINTER);
//		new Season(null, null);
	}
}

//演示自定义枚举实现
class Season{
	private String name;
	private String desc;//描述
	//1 将构造器私有化，目的防止直接new 对象
	//2 去掉set相关的方法，只保留get 防止修改。只能读
	//3 在Season内部 直接创建固定对象
	//优化加入final 修饰符
	
	//这里就定义了四个固定对象
	public static final Season SPRING = new Season("春天", "温暖");//第3步
	public static final Season SUMMER = new Season("夏天", "炎热");//第3步
	public static final Season AUTUMN = new Season("秋天", "凉爽");//第3步
	public static final Season WINTER = new Season("冬天", "寒冷");//第3步
	private Season(String name, String desc) {//第1步
		super();
		this.name = name;
		this.desc = desc;
	}
	public String getName() {//第2步
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}
	
}