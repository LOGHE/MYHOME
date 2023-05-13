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
public class ListExercise505 {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("路飞1");
		list.add("鸣人2");
		list.add("小3");
		list.add("路飞4");
		list.add("路飞5");
		list.add("路飞6");
		list.add("路飞7");
		list.add("路飞8");
		list.add("路飞9");
		list.add("路飞10");
		//下标2的前面插入
		list.add(1, "勇敢牛牛");
		System.out.println(list);
		
		//获取元素是下标
		System.out.println("5=" + list.get(4));
		//删除第6个元素
		list.remove(5);
		//修改元素
		list.set(6, "张三");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		}
	}
}

