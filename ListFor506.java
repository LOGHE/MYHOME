/**
 * 
 */
package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
@SuppressWarnings({"all"})
public class ListFor506 {
	public static void main(String[] args) {
		//list的三种遍历方式
		
		List list = new ArrayList();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		//方法1 iterator 迭代器遍历
		System.out.println("方法1 iterator 迭代器遍历");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.print(object);
		}
		System.out.println();
		//方法2使用增强型for循环
		System.out.println("方法2使用增强型for循环");
		for(Object object : list) {
			System.out.print(object);
		}
		System.out.println();
		//方法3 使用普通for循环
		System.out.println("方法3 使用普通for循环");
		for (int i = 0; i <list.size() ; i++) {
			System.out.print(list.get(i));
		}
	}
}
