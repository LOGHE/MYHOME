/**
 * 
 */
package com.hspedu.innerclass_;

/**
 * @author 日暮れて道遠し
 *
 */
/*
1.有一个铃声接口 Bell，里面有个 ring 方法。(右图)
2.有一个手机类 Cellphone，具有闹钟功能 alarmClock，参数是 Bell 类型(右图)
3.测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印：懒猪起床了
4.再传入另一个匿名内部类(对象)，打印：小伙伴上课了
*/
public class InnerClassExercise418_1 {
	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone();
		cellPhone.alarmclock(new Bell() {
			public void ring() {
				// TODO 自动生成的方法存根
				System.out.println("懒猪起床了");
			}
		});
		System.out.println("===================");
		cellPhone.alarmclock(new Bell() {
			
			@Override
			public void ring() {
				// TODO 自动生成的方法存根
				System.out.println("小伙伴上课了");
			}
		});
		System.out.println("===================");
		cellPhone.alarmclock(new Bell() {
			
			@Override
			public void ring() {
				// TODO 自动生成的方法存根
				System.out.println("社畜上班了");
			}
		});
//		test(new Bell() {
//			
//			@Override
//			public void ring() {
//				// TODO 自动生成的方法存根
//				System.out.println("小伙伴上课了");
//			}
//		});
	}
//	public static void test(Bell bell) {
//		bell.ring();
//	}
}

interface Bell{//接口
	void ring();//抽象方法
}
class CellPhone{//类
	public void alarmclock(Bell bell) {//形参是Bell接口类型
		System.out.println(bell.getClass());
		bell.ring();
	}
}
