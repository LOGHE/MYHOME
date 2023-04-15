/**
 * 
 */
package com.hspedu.innerclass_;

/**
 * @author 日暮れて道遠し
 *
 */
public class InnerClassExercise418 {
	public static void main(String[] args) {
//		IL il = new IL() {
//			public void show() {
//				// TODO 自动生成的方法存根
//				System.out.println("这是一副名画");
//			}
//		};
//		il.show();
		Picture picture = new Picture();
		picture.show();
		System.out.println("=============");
		f1(new Picture());
		System.out.println("================");
		f1(new IL() {//当实参传递，简洁高效
			public void show() {
				System.out.println("这是一副名画");
			}
		  }  );//注意这个 ）括号 相当于把整个匿名内部类（其本身也是一个对象）给传进去了这个f1方法里面，
		//然后因为调用了f1方法，那么就输出show（）方法
	}
	
	public static void f1(IL il) {
		il.show();
	}
}
 interface IL{
	void show();
}

class Picture implements IL{

	@Override
	public void show() {
		// TODO 自动生成的方法存根
		System.out.println("这是一副实现接口的  名画");
	}
	
}
