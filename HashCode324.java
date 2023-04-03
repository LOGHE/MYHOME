/**
 * 
 */
package com.hspedu.Object_;

/**
 * @author 日暮れて道遠し
 *
 */
public class HashCode324 {
	public static void main(String[] args) {
//		1) 提高具有哈希结构的容器的效率！
//		2) 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
//		3) 两个引用，如果指向的是不同对象，则哈希值是不一样的
//		4) 哈希值主要根据地址号来的！， 不能完全将哈希值等价于地
//		5) 案例演示[HashCode_.java]: obj.hashCode() [测试：A obj1 = new A(); A obj2 = new A(); A obj3 = obj1
		A234 aa = new A234();
		A234 aa2 = aa;
		A234 aa1 = new A234();
		System.out.println("aa hash="+aa.hashCode());
		System.out.println("aa2 hash="+aa2.hashCode());
		System.out.println("aa1 hash="+aa1.hashCode());
	}
}
class A234{
	
}