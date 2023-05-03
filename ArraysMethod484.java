/**
 * 
 */
package com.hspedu.arrays_;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
@SuppressWarnings({"all"})//放这里可以无视整个类的警告，同理看下面
public class ArraysMethod484 {
	public static void main(String[] args) {
		Integer[] arr = {1,5,47,2,45};
		//3 binarySearch通过二分法搜索进行查找 要求必须排序为正序
		//要求必须排序 如果是无序的则不能使用binarySearch
		// 如果数组中不存在该元素，就返回 return -(low是 “应该”在的位置 + 1); // key not found
		//列如 48 不在 数组如果在的话应该在下标为5的地方 那么就返回 -(5+1) 
		//同理 46 找不到应该返回 -(4+1)
		Arrays.sort(arr,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				return i1 - i2;
			}
		});
		System.out.println(Arrays.toString(arr));
		int index = Arrays.binarySearch(arr, 46);//1在下标为0的位置
		System.out.println(index);
		
		//4 数组元素的复制
		//从arr数组中拷贝arr.length个元素到newArr1数组中 arr.length-1(-2)可以对数组长度进行删减
		//同理+1的情况就是添加一个null元素
		// 如果拷贝长度 < 0 就抛出异常 NegativeArraySizeException
		Integer[] newArr1 = Arrays.copyOf(arr, arr.length);
		System.out.println("拷贝后的数组");
		System.out.println(Arrays.toString(newArr1));
		
		//5 数组元素的填充
		//使用 99 去填充 num 数组，可以理解成是替换原理
		Integer[] arr2 = new Integer[] {9,5,45};
		Arrays.fill(arr2, 99);
		System.out.println("填充后的数组");
		System.out.println(Arrays.toString(arr2));
		
		//6 //equals 比较两个数组元素内容是否完全一致
		//1. 如果 arr 和 arr2 数组的元素一样，则方法 true;
		//2. 如果不是完全一样，就返回 false
		Integer[] arr1 = {1, 2, 5, 45,47};
		boolean equals = Arrays.equals(arr, arr1);
		System.out.println("equals=" + equals);
		
		//7 //asList 将一组值，转换成 list
		//老韩解读
		//1. asList 方法，会将 (2,3,4,5,6,1)数据转成一个 List 集合
		//2. 返回的 asList 编译类型 List(接口)
		//3. asList 运行类型 java.util.Arrays#ArrayList, 是 Arrays 类的
		// 静态内部类 private static class ArrayList<E> extends AbstractList<E>
		// implements RandomAccess, java.io.Serializable
		List asList = Arrays.asList(2,3,4,5,6,1);
		System.out.println("asList=" + asList);
		System.out.println("asList 的运行类型" + asList.getClass());
	}
}
