/**
 * 
 */
package com.hspedu.homework_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWorkname495 {
	public static void main(String[] args) {
		String str2 = "我sa dda da";
		reverse(str2);
	}
	//对输入字符串进行分割split(" ")得到String【】
	//对数组进行格式化format
	public static void reverse(String str) {
		if (str == null) {
			System.out.println("名字不能为空");
			return;
		}
		String[] names1 =str.split(" ");
		if (names1.length != 3) {
			System.out.println("输入字符串格式不对");
			return;
		}
		String format = String.format("%s,%s.%c", names1[2],names1[0],names1[1].toUpperCase().charAt(0));
		System.out.println(format);
	}
}
