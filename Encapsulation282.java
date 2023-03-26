/**
 * 
 */
package com.hspedu.encap;

public class Encapsulation282 {
public static void main(String[] args) {
	penson p1 = new penson();
	//p1.name="jack";//公开的访问修饰符 可以赋予名字
//	p1.age=3000;这里不行因为是private 只能再同包同类下修改，这里不同类
	p1.setName("jack000000");
	p1.setAge(250);
	p1.setSalary(5000);
	String res = p1.info();
	System.out.println(res);
//	System.out.println(p1.setSalary(2000));不能通过set查看，只能通过下面的get查看
	System.out.println(p1.getSalary());
	System.out.println("采用构造器后======");
	penson p2 = new penson("小王",242,2900);
	System.out.println(p2.info());
}
	
}
/*
那么在 java 中如何实现这种类似的控制呢?
请大家看一个小程序(com.hspedu.encap: Encapsulation01.java), 
不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符 之间
*/
class penson{
	public String name;//名字公开
	private int age;//年纪隐私
	private double salary;//撒那儿瑞  工资隐私
	
	//采用构造器，传入setXxx方法
	/**
	 * @param name
	 * @param age
	 * @param salary
	 */
	/**
	 * 
	 */
	public penson() {
		// TODO 自动生成的构造函数存根
	}
	public penson(String name, int age, double salary) {
		setAge(age);
		setName(name);
		setSalary(salary);
	}

	
	//这两个方法setXxx和getXxx方法手写太慢了 
	//用快捷键 alt+/生成单个get set
	//alt+shift+s,r 生成一对
	
	//然后根据要求来完善我们的代码
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age 要设置的 age
	 */
	public void setAge(int age) {
		if (age>=1&&age<=120) {//合理范围
			this.age=age;
		}else {
			System.out.println("您输入的年纪有误");
			//给一个默认年龄
			this.age = 18;
		}
//		this.age = age;这里不能有return 不然输入年龄有误时 还是不会变成默认值
	}
	/**
	 * @return salary
	 */
	public double getSalary() {
		//可以增加读当前对象的权限判断
		return salary;
	}
	/**
	 * @param salary 要设置的 salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		//加入对数据的校验，相当于增加了雨雾逻辑
		if (name.length()>=2&&name.length()<=6) {
			this.name=name;
		}else {
			System.out.println("你输入的名字有误");
			this.name = "张三";
		}
//		this.name = name;//这里不能有返回 不然输入有误时 不会返回张三
	}
	
	//写一个方法，返回属性信息
	public String info() {
		return "信息为 name="+name+"  age="+age+"  salary="+salary;
		
	}
}