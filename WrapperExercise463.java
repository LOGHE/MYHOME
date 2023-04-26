/**
 * 
 */
package com.hspedu.wrappertype_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class WrapperExercise463 {
	public static void main(String[] args) {
		//原码 这里主要是看范围 -128 ~ 127 就是直接返回
		//否则就直接 new Integer(i)
		/*public static Integer valueOf(int i) {
			if (i >= IntegerCache.low && i <= IntegerCache.high)
			return IntegerCache.cache[i + (-IntegerCache.low)];
			return new Integer(i);
			}*/
		
		
		Integer i = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i == i2);//f new的两个对象怎么可能相等
		
		Integer m = 1;
		Integer n = 1;
		int n1 = m;
		//所以，这里主要是看范围 -128 ~ 127 就是直接返回
		System.out.println(m == n);//t 相等因为是两个基本数据类型
		
		
		//1. 如果 i 在 IntegerCache.low(-128)~IntegerCache.high(127),就直接从数组返回
		//2. 如果不在 -128~127,就直接 new Integer(i)
		Integer x = 128;//底层 Integer.valueOf(1); -> 阅读源码
		Integer y = 128;
		System.out.println(x == y);//f
	}
}
