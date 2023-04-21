/**
 * 
 */
package com.hspedu.homework436_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
class Person439{
	 private String name;
	 private Vehicles439 vehicles439;
	 //再创建人对象时事先给他分配一个交通工具
	public Person439(String name, Vehicles439 vehicles439) {
		super();
		this.name = name;
		this. vehicles439 = vehicles439;
	}
	//编程思想 把具体要求封装成方法
	public void passRiver() {
		//先得到船
		//判断一下 当前的Vehicles439是否为空
		//if (!(vehicles439 instanceof Boat)) {
		//vehicles439 instanceof Boat 是判断当前vehicles439是不是Boat
		//vehicles439 == null  vehicles439 instanceof Boat =>false
		//vehicles439 == 马对象  vehicles439 instanceof Boat =>false
		//vehicles439 == 船对象  vehicles439 instanceof Boat =>true
		if (!(vehicles439 instanceof Boat)) {
			vehicles439 = HomeWork439VehiclesFactory.getBoat();
		}
		
		vehicles439.work();
	}
	public void common() {
		//得到一般工具
		//判断一下 当前的Vehicles439是否为空
		if (!(vehicles439 instanceof Horse)) {
			//这里使用多态
			vehicles439 =HomeWork439VehiclesFactory.getHorse();
		}
		vehicles439.work();
	}
}
