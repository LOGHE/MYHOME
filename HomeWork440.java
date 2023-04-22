/**
 * 
 */
package com.hspedu.homework436_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork440 {
	public static void main(String[] args) {
		new Car(24).new Air().flow();
		Car car = new Car(49);
		car.geAir().flow();
		Car car2 = new Car(-2);
		car2.geAir().flow();
		Car car3 = new Car(23);
		car3.geAir().flow();
		
	}

}

class Car{//外部类
	//温度属性
	private int temperature;
	class Air{//成员内部类
		public void flow() {//内部方法
			//加入if条件继续温度判断
			if (temperature >= 40) {
				System.out.println("温度超过40开启冷风");
			}else if (temperature <= 0) {
				System.out.println("温度低于0°开启热风");
			}else
				System.out.println("温度正常关闭空调");
		}
	}
	public Car(int temperature) {
		super();
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public Air  geAir() {
		return new Air();
	}
	
}