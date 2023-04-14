/**
 * 
 */
package com.hspedu.interface_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Interface402 {
	public static void main(String[] args) {
		//创建计算机
		Computer computer = new Computer();
		//创建手机和相机
		Phone phone = new Phone();
		Camera camera = new Camera();
		computer.working(camera);//把相机接入电脑
		computer.working(phone);//把手机接入电脑
		
		//接口的多态数组
		Usb[] usbs = new Usb[2];//这里并没有被实例化 因为没有赋值 里面都是空的和下面Computer的方法传参一样
		usbs[1] = new Phone();//这里才是被实例化
		usbs[0] = new Camera();
		for (int i = 0; i < usbs.length; i++) {
			usbs[i].start();//这里是动态绑定机制调用子类重写的父类（接口）方法 或者是父类（接口）方法
			//？？？如何实现调用子类特有方法 答：向下转型
			if (usbs[i] instanceof Phone) {
				((Phone) usbs[i]).call();//向下转型完成调用 实现接口类的特有方法
			}
		}
		
		//接口的多态体现
		//接口类型的变量 usb 可以指向 实现了Usb接口类的对象实例
		Usb usb = new Phone();//这里实际上创建出来的实例是执行的子类，所有不是创建的Usb只是指向Usb罢了
		usb = new Camera();
		
		//继承体现的多态
		//父类类型的变量 a 可以指向 继承了AAA的子类的都西昂实例
		AAA a = new BBB();
		a = new CCC();
	}
}

//usb接口
interface Usb{
	public void start();
	public void stop();
}

//相机类链接接口
class Camera implements Usb{

	@Override
	public void start() {
		// TODO 自动生成的方法存根
		System.out.println("我是相机我开始工作");
	}

	@Override
	public void stop() {
		// TODO 自动生成的方法存根
		System.out.println("我是相机我停止工作");
	}
}

//手机类连接接口
class Phone implements Usb{
	//特有方法call
	public void call() {
		System.out.println("手机可以打电话");
	}
	@Override
	public void start() {
		// TODO 自动生成的方法存根
		System.out.println("我是手机我开始工作");
	}

	@Override
	public void stop() {
		// TODO 自动生成的方法存根
		System.out.println("我是手机我停止工作");
	}
}

class Computer{
	//编写一个计算机方法，计算机工作
	//(Usb usb)形参是接口类型
	//2 看到 接收实现了Usb  接口的类的对象实例
	public void working(Usb usb) {
		//通过接口方法来调用
		usb.start();
		usb.stop();
	}
}

class AAA{}//父类
class BBB extends AAA{}
class CCC extends AAA{}