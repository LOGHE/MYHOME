/**
 * 
 */
package com.hspedu.homework436_;
import java.util.Scanner;
/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork441  {
	public static void main(String[] args) {
		//演示枚举值得switch
		Color green = Color.YELLOW;//GREEN可以改变 改变为什么匹配到什么
		green.show();
		System.out.println("=========");
//		Color red = Color.RED;//RED可以改变 改变为什么匹配到什么
//		red.show();
		//比较一下
		//switch（）中 放入枚举对象
		//在每个case后 直接写上在枚举内中 定义得枚举对象即可
		switch (green) {
		case YELLOW: {
			System.out.println("匹配到黄色");
			break;
		}
		case BLACK: {
			System.out.println("匹配到黑色");
			break;
		}
		case RED: {
			System.out.println("匹配到红色");
			break;
		}
		case GREEN: {
			System.out.println("匹配到绿色");
			break;
		}
		case BLUE: {
			System.out.println("匹配到白色");
			break;
		}
		default:
			System.out.println("没有匹配到");
		}
		//创建枚举数组
		//然后调用
//		Scanner scanner = new Scanner(System.in);
//		Color[] value = Color.values();
//		System.out.println("请输入颜色 RED BLUE BLACK YELLOW GREEN");
//		String color;//定义输入颜色
//		color = scanner.nextLine();//接收用户输入
//		switch (color) {
//		case "RED": {
//			value[0].show();
//			break;
//		}
//		case "BLUE":{
//			value[1].show();
//			break;
//		}
//		case "BLACK":{
//			value[2].show();
//			break;
//		}
//		case "YELLOW":{
//			value[3].show();
//			break;
//		}
//		case "GREEN":{
//			value[4].show();
//			break;
//		}
//		default:{
//			System.out.println("请输入正确颜色");
//			break;
//				}
//			}
		}
	}
//接口
interface IH{
	public void show();//输出颜色
}
//枚举 5个对象
enum Color implements IH{
	//列举全部对象
	RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
	private int redValue;
	private int greenValue;
	private int blueValue;
	//构造器
	private Color(int redValue, int greenValue, int blueValue) {
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	public int getRedValue() {
		return redValue;
	}
	public void setRedValue(int redValue) {
		this.redValue = redValue;
	}
	public int getGreenValue() {
		return greenValue;
	}
	public void setGreenValue(int greenValue) {
		this.greenValue = greenValue;
	}
	public int getBlueValue() {
		return blueValue;
	}
	public void setBlueValue(int blueValue) {
		this.blueValue = blueValue;
	}
	//显示颜色属性
	@Override
	public void show() {
		// TODO 自动生成的方法存根
		System.out.println("redValue="  + getRedValue() + 
				"	greenValue="+ getBlueValue() + "	blueValue=" + getGreenValue());
	}
}