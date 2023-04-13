/**
 * 
 */
package com.hspedu.abstract_;

/**
 * @author 日暮れて道遠し
 *
 */
public class TestTemplate401 {
	public static void main(String[] args) {
		new AA().TestTempTime();
	}
}

abstract class Template{
	public abstract void job();//抽象方法 等着子类根据直接的需求改变
	public void TestTempTime() {//父类 抽出子类相同的部分 
		//得到开始时的时间
		long start = System.currentTimeMillis();
		job();//抽象方法等着子类根据直接的需求改变 这里是不同的部分 变量
		long end =  System.currentTimeMillis();
		System.out.println("执行时间="+ (end - start));
	}
}
class AA extends Template{

	//计算任务
	//1+....+100000
	@Override
	public void job() {
		// TODO 自动生成的方法存根
		long num = 0;
		for (int i = 0; i < 1000000; i++) {
			num +=i;
		}
	}
	
	
//	public void job() {
//		//得到开始时的时间
//		long start = System.currentTimeMillis();
//		long num = 0;
//		for (int i = 0; i < 800000; i++) {
//			num +=i;
//		}
//		long end =  System.currentTimeMillis();
//		System.out.println("执行时间="+ (end - start));
//	}
	
}
