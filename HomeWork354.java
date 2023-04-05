/**
 * 
 */
package com.hspedu.homework_346___;


/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWork354 {
	private static final String Student354 = null;

	public static void main(String[] args) {
		//(7）定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
		//(8）定义方法，形参为 Person 类型，功能：调用学生的 study 或教师的
		//思路分析 定义多态数组 用冒泡排序法按年纪从大到小排序
		Person354[] person354 = new Person354[4];
		person354[0] = new Student354("北原春希", 25, '男', "00023102");
		person354[1] = new Student354("小木曾雪菜", 23, '女', "00023102");
		person354[2] = new Teacher354("冬马和纱", 24, '女',4);
		person354[3] = new Teacher354("nisa", 28, '女',8);
		HomeWork354 homeWork354 =new HomeWork354();
		homeWork354.bubbleSort(person354);
		//输出个人信息表格
		for (int i = 0; i < person354.length; i++) {
			person354[i].say();
			System.out.println("============");
		}
		//输出基本属性的排序后的数组 用toString方法
		for (int i = 0; i < person354.length; i++) {
			System.out.println(person354[i]);
		}
		System.out.println("遍历多态数组======");
		for (int i = 0; i < person354.length; i++) {//遍历多态数组
		homeWork354.test(person354[i]);	
		}
	}
	
	//形参为person354 调用学生和老师的特殊方法，向下转型调用特殊方法
	public void test(Person354 p) {
		if (p instanceof Student354) {//p的运行类型如果是Student
			((Student354) p).student();
		}else if (p instanceof Teacher354) {
			((Teacher354) p).teacher();
		}else {
			System.out.println("do nothing......");
		}
	}
	
	//使用冒泡排序法按年龄高到低排序
//		for (int i = 0; i < p1.length-1; i++) {//进行2轮比较
//			for (int j = 0; j < p1.length-i-1; j++) {
//				//比较int的age，然后改变对象数组的排序
//				//第一轮比较2次  【0】和【1】比 【1】和【2】比 确认把最小的放在最后。。。
//				//第二轮比较1次 【0】和【1】 把最大的放在第一 这样第二大的就在中间了
//				if (p1[j].getAge() < p1[j+1].getAge()) {//默认第一个是最小的 然后交换就完事了
//					tmpe = p1[j];
//					p1[j] = p1[j+1];
//					p1[j+1] = tmpe;
	//可以将其包装到一个方法里面 记住一定要写在main外面
	public void bubbleSort(Person354[] person354) {
		Person354 tmpe = null;
		for (int i = 0; i < person354.length-1; i++) {//外层循环 i-1次
			for (int j = 0; j < person354.length-i-1; j++) {//内层比较一次比外层-1
				if (person354[j].getAge() < person354[j+1].getAge()) {//默认第一个是最小的 然后交换就完事了
					tmpe = person354[j];
					person354[j] = person354[j+1];
					person354[j+1] = tmpe;
				}
			}
		}
	}	
}
