/**
 * 
 */
package com.hspedu.wrappertype_;

import java.io.ObjectOutput;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class WrapperType459 {
	public static void main(String[] args) {
		//演示int 和integer的装箱和拆箱
		//jdk5以前是手动装箱和拆箱
		//装箱int 到integer
		int n1 = 100;
		Integer integer = new Integer(n1);//自动装箱少了这里new
		Integer integer2 = Integer.valueOf(n1);
		
		//拆箱integer到int
		int i  = integer.intValue()	;//需要调用方法
		
		//jkd5以后自动装箱和拆箱
		int n2 = 200;
		Integer integer3 = n2;//底层使用Integer.valueOf(n2);
		//自动拆箱
		int n3 = integer3;//底层仍然使用intValue(n3);
		
		
		Double double1 = 100.d;//100d也可以 自动装箱Double.valueOf(100.d)
		Float float1 = 1.5f;//ok自动装箱Float.valueOf(100.d)
		Object object = true ? new Integer(1) : new Double(2.0);
		System.out.println(object);//1.0 因为三元运算符精度要保持一致
		
		Object object2;
		if (true) {
			object2 = new Integer(1);
		}
			else {
				object2 = new Double(2.);
			}
		System.out.println(object2);//if文 不满足条件else不执行
	}
}
