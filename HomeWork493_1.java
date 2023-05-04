/**
 * 
 */
package com.hspedu.homework_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork493_1 {
	public static String s1 = "abcdef";
	public static void main(String[] args) {
		arr1();
		arr2();
		//老韩的
		try {
			 s1 = reverse(s1, 1, 4);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("交换后");
		System.out.println(s1);
	}
	//1使用字符数组翻转字符串
	public static void arr1() {
		char [] arr = s1.toCharArray();
		char h ;//保存循环次数
		int y = arr.length-2 ;//这是末尾的下标为什么是-2 因为是下标 -1是最后一位数 -2才是倒数第二位数
		//下面i为初始下标
		System.out.println(s1.charAt(s1.length()  -1));
		for (int i = 0; i < y; i++) {//i++开头开始增加下标 当开头下标大于末尾时交换结束
			h = arr[i+1];
			arr[i+1] = arr[y];
			arr[y] = h;
			y--;//末尾开始减少下标
		}
		String s2 = new String(arr);
		System.out.println(s2);
	}
	
	//使用 StringBuilder 的 reverse() 方法
	public static void arr2() {
		StringBuilder stringBuilder = new StringBuilder(s1);
		System.out.println(stringBuilder);
		String string = stringBuilder.reverse().toString();
		//stringBuilder.reverse()返回的是StringBuilder对象 加上toString()后变成String字符串可以用String接收
		//同时直接输出stringBuilder.reverse也是可以的
		System.out.println(string);
		System.out.println("直接输出stringBuilder.reverse如下" );
		System.out.println(stringBuilder.reverse());
	}
	public static String reverse(String s1,int start,int end) {
		//写出正确情况 然后取反 这样就是反着来就报错
		if (!(s1 != null && start >= 0 && start < end && end < s1.length())) {
			 throw new RuntimeException("输入有误");
		}
		char [] arr = s1.toCharArray();
		char h ;//保存循环次数
		//int y = arr.length-1 ;//这是末尾的下标为什么是-2 因为是下标 -1是最后一位数 -2才是倒数第二位数
		//下面i为初始下标
		for (int i = start,y = end ; i < y; i++,y--) {//i++开头开始增加下标 当开头下标大于末尾时交换结束
			h = arr[i];
			arr[i] = arr[y];
			arr[y] = h;
			//y--;//末尾开始减少下标
		}
		String s2 = new String(arr);
		return s2;
	}
	
}
