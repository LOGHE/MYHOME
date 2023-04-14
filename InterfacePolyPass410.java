/**
 * 
 */
package com.hspedu.interface_;

/**
 * @author 日暮れて道遠し
 * 演示多态传递现象
 *
 */
public class InterfacePolyPass410 {
	public static void main(String[] args) {
		//接口类型的变量可以指向实现了该接口的对象实例
		IG ig = new Teacher();
		IH ih = new Teacher();
	}
}

interface IH{}
interface IG extends IH{}
class Teacher implements IG{
	
}