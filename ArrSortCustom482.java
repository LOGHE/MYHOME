/**
 * 
 */
package com.hspedu.arrays_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class ArrSortCustom482 {
	public static void main(String[] args) {
		int arr[] = {1,1,90,23,88};
//		arr1(arr);
		int n1 = 10;
//		Object i5 = n1;
//		int n2 = (int) i5;
		arr2(arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int i1 = (Integer) o1;//拆箱 向下转型因为 Object是父类 
				int i2 = (Integer) o2;
				return i2 - i1;
			}
		} );
		System.out.println(Arrays.toString(arr));
	}
	
	public static void arr1(int arr[]) {//这里需要传参才能使用
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j+1] > arr[j]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}
	
	public static void arr2(int arr[],Comparator c) {
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (c.compare(arr[j+1], arr[j]) > 0) {//大于零进行交换 小于零则不改变数值
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
