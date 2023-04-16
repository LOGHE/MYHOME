/**
 * 
 */
package com.hspedu.enum_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Enumeration424 {
	public static void main(String[] args) {
		Season01 season = new Season01("春天", "温暖");
		Season01 season2 = new Season01("夏天", "炎热");
		Season01 season3 = new Season01("秋天", "凉爽");
		Season01 season4 = new Season01("冬天", "寒冷");
		Season01 other = new Season01("红天","~~~");
		//因为对于季节而已，他的对象(具体值)，是固定的四个，不会有更多
		// //按这个设计类的思路，不能体现季节是固定的四个对象
		// //因此，这样的设计不好===> 枚举类[枚: 一个一个 举： 例举 , 即把具体的对象一个一个例举出来的类
		// // 就称为枚举类]
		System.out.println("=======");
	}
}
class Season01{
	private String name;
	private String desc;//描述
	public Season01(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}
	
}
