/**
 * 
 */
package com.hspedu.homework436_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
@SuppressWarnings({"all"})
public class HomeWork436 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Frock436.getCurrentNum();
		System.out.println(Frock436.getCurrentNum());
		Frock436 f1 = new Frock436();
		System.out.println(f1.getSeriaNumber());
		Frock436 f2 = new Frock436();
		System.out.println(f2.getSeriaNumber());
		Frock436 f3 = new Frock436();
		System.out.println(f3.getSeriaNumber());
	}

}

/*1．在 Frock 类中声明私有的静态属性 currentNum [ int 类型］，初始值为100000，作为衣服出厂的序列号起始值。
2．声明公有的静态方法 getNextNum ，作为生成上衣唯一序列号的方法。每调用一次，将 currentNum 增加100，并作为返回值。
3．在 TestFrock 类的 main 方法中，分两次调用 getNextNum 方法，获取序列号并打印输出。
4.在 Frock 类中声明 serialNumber （序列号）属性，并提供对应的 get 方法；
5.在 Frock 类的构造器中，通过调用 getNextNum 方法为 Frock 对象获取唯一序列号，赋给 serialNumber 属性。
6．在 TestFrock 类的 main 方法中，分别创建三个 Frock 对象，并打印三个对象的序列号，验
证是否为按100递增。*/

 class Frock436 {
	private static int currentNum = 100000;//序列号
	private static int seriaNumber = 0;//保存序列号
	public static int getCurrentNum() {
		 currentNum += 100;//静态属性可以共享，不同对象每调用一次涨100
		 return currentNum;
	}
	public static int getSeriaNumber() {
		return seriaNumber;
	}
	public static void setSeriaNumber(int seriaNumber) {
		Frock436.seriaNumber = seriaNumber;
	}
	public Frock436() {
		// TODO 自动生成的构造函数存根
		seriaNumber = getCurrentNum();
		//通过构造器输出返回序列号
	}
}