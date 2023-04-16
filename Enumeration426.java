/**
 * 
 */
package com.hspedu.enum_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Enumeration426 {
	public static void main(String[] args) {
		System.out.println(Season02.SPRING);
		System.out.println(Season02.SUMMER);
		System.out.println(Season02.AUTUMN);
		System.out.println(Season02.WINTER);
		//使用Season02枚举类，来演示各种方法
		Season02 autumn = Season02.AUTUMN;
		//输出枚举对象的名字
		System.out.println(autumn.name());
		//ordinal()输出的是该枚举对象的次序/编号。从0开始编的
		//AUTUMN枚举对象是第三个 因此输出2
		System.out.println(autumn.ordinal());
		//含有定义的所有枚举对象
		Season02[] values = Season02.values();
		System.out.println("===遍历取出枚举对象(增强 for)====");
		for (Season02 season: values) {//增强 for 循环
		System.out.println(season);
		}
		//valueOf：将字符串转换成枚举对象，要求字符串必须
		//为已有的常量名，否则报异常
		//执行流程
		//1. 根据你输入的 "AUTUMN" 到 Season2 的枚举对象去查找
		//2. 如果找到了，就返回，如果没有找到，就报错
		Season02 autumn1 = Season02.valueOf("AUTUMN");
		System.out.println("autumn1=" + autumn1);
		System.out.println(autumn == autumn1);
		//compareTo：比较两个枚举常量，比较的就是编号
		//1. 就是把 Season2.AUTUMN 枚举对象的编号 和 Season2.SUMMER 枚举对象的编号比较
		//2. 看看结果
		/*public final int compareTo(E o) {
		return self.ordinal - other.ordinal;}
		Season2.AUTUMN 的编号[2] - Season2.SUMMER 的编号[3]
		*/
System.out.println(Season02.AUTUMN.compareTo(Season02.SUMMER));
	}
}

//演示使用enum 关键字来实现枚举
enum Season02{
	
	//这里就定义了四个固定对象
//	public static final Season SPRING = new Season("春天", "温暖");//第3步
//	public static final Season SUMMER = new Season("夏天", "炎热");//第3步
//	public static final Season AUTUMN = new Season("秋天", "凉爽");//第3步
//	public static final Season WINTER = new Season("冬天", "寒冷");//第3步
	
	//如果使用了 enum 来实现枚举类
	//1. 使用关键字 enum 替代 class
	//2. public static final Season SPRING = new Season("春天", "温暖") 直接使用
	// SPRING("春天", "温暖") 解读 常量名(实参列表)
	//3. 如果有多个常量(对象)， 使用 ,号间隔即可
	//4. 如果使用 enum 来实现枚举，要求将定义常量对象，写在前面
	//5. 如果我们使用的是无参构造器，创建常量对象，则可以省略 ()
	SPRING("春天", "温暖"),SUMMER("夏天", "炎热"),AUTUMN("秋天", "凉爽"),WINTER("冬天", "寒冷");
	private String name;
	private String desc;//描述
	
	
	private Season02(String name, String desc) {//第1步
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
