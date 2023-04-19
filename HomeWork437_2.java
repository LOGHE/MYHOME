/**
 * 
 */
package com.hspedu.homework436_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
//1．计算器接口具有 work 方法，功能是运算，有一个手机类 Cellphone ，定义方法 testWork 
//测试计算功能，调用计算接口的 work 方法，
//2．要求调用 CellPhone 对象的 testWork 方法，使用上匿名内部类
public class HomeWork437_2 {
	public static void main(String[] args) {
		Cellphone cellphone = new Cellphone();
		cellphone.testWork(new IF() {
			
			@Override
			public double work(double d1, double d2) {
				// TODO 自动生成的方法存根
				return d1 + d2;
			}
		}, 12, 8);
	}
	
}

interface IF{
	public double work(double d1, double d2);
}
class Cellphone {
	//当我们调用testwork方法时，直接传入一个实现了IF接口的匿名内部类即可
	//该匿名内部类可以灵活的实现work，挖不出不同的计算任务 
	public void testWork(IF if1, double d1,double d2) {
		double result = if1.work(d1, d2);
		System.out.println("计算后的结果= " + result);
	}
}