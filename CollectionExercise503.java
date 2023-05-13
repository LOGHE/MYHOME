/**
 * 
 */
package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
@SuppressWarnings({"all"})
public class CollectionExercise503 {
	public static void main(String[] args) {
		List col1 = new ArrayList();
		col1.add(new Dog("小黑", 3));
		col1.add(new Dog("小花", 2));
		col1.add(new Dog("大黄", 5));
		Iterator iterator = col1.iterator();
		//使用迭代器遍历
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("使用增强型for循环");
		for (Object object : col1) {
			System.out.println(object);
		}
	}
}

class Dog{
	private String name1;
	private int age1;
	public Dog(String name1, int age1) {
		super();
		this.name1 = name1;
		this.age1 = age1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public int getAge1() {
		return age1;
	}
	public void setAge1(int age1) {
		this.age1 = age1;
	}
	//如果不重写tosString方法输出不了的  com.hspedu.collection_.Animal@58c1670b 
	@Override
	public String toString() {
		return "Animal [name1=" + name1 + ", age1=" + age1 + "]";
	}
	
}