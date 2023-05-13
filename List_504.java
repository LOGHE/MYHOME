/**
 * 
 */
package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
@SuppressWarnings({"all"})
public class List_504 {
	public static void main(String[] args) {
		//1. List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复 [案例]
		List list4 = new ArrayList();
		list4.add("jack");
		list4.add("tom");
		list4.add("mary");
		list4.add("hsp");
		list4.add("tom");
		System.out.println("list=" + list4);
		//2. List 集合中的每个元素都有其对应的顺序索引，即支持索引
		// 索引是从 0 开始的
		System.out.println(list4.get(3));//hsp
		
		
		System.out.println("分割线==========");
		List list = new ArrayList();
		list.add("张三丰");
		list.add("贾宝玉");
		// void add(int index, Object ele):在 index 位置插入 ele 元素
		//在 index = 1 的位置插入一个对象
		list.add(1, "啊Q");
		System.out.println("list=" + list);
		// boolean addAll(int index, Collection eles):从 index 位置开始将 eles 中的所有元素添加进来
		List list2 = new ArrayList();
		list2.add("jack");
		list2.add("tom");
		list.addAll(1, list2);
		System.out.println("list=" + list);
		// Object get(int index):获取指定 index 位置的元素
		//说过
		// int indexOf(Object obj):返回 obj 在集合中首次出现的位置
		System.out.println(list.indexOf("tom"));//2
		// int lastIndexOf(Object obj):返回 obj 在当前集合中末次出现的位置
		list.add("啊Q");
		System.out.println("list=" + list);
		System.out.println(list.lastIndexOf("啊Q"));
		// Object remove(int index):移除指定 index 位置的元素，并返回此元素
		list.remove(0);
		System.out.println("list" + list);
		// Object set(int index, Object ele):设置指定 index 位置的元素为 ele , 相当于是替换. list.set(1, "玛丽");
		System.out.println("list=" + list);
		// List subList(int fromIndex, int toIndex):返回从 fromIndex 到 toIndex 位置的子集合
		// 注意返回的子集合 fromIndex <= subList < toInde
		List returnlist = list.subList(0, 2);
		System.out.println("returnlist=" + returnlist);
	}
}
