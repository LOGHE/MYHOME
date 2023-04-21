/**
 * 
 */
package com.hspedu.homework436_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork439VehiclesFactory {
	//创建交通工具类工厂类，有两个方法分别获得交通工具Horse和Boat
	//将方法做成static不用创建对象
	public static Horse getHorse () {
		return new Horse();
	}
	public static Boat getBoat() {
		return new Boat();
	}
}
