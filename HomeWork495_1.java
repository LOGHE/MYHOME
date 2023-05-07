/**
 * 
 */
package com.hspedu.homework_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork495_1 {
	public static void main(String[] args) {
		String str2 = "446-5adaf54DAFA我阿达";
		name(str2);
	}
	//思路分析 字符串转为char数组遍历数组
	//利用ASCLL码求出大小写和数字 负数不用管
	public static void name(String str1) {
		if (str1 == null) {
			System.out.println("请输入字符串");
			return;
		}
		char [] c1 = str1.toCharArray();
		int E1 = 0;//da
		int e1 = 0;//xiao
		int m1 = 0;//shu
		int hoka = 0;
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] >= 'A' && c1[i] <= 'Z') {
				E1++;
			}else if (c1[i] >= 'a' && c1[i] <= 'z') {
				e1++;
			}else if (c1[i] <= '9' && c1[i]  >= '0') {
				m1++;
			}else {
				hoka++;
			}
				
		}
		System.out.println("大写字母为" +E1 + "小写字母" + e1 + "数字为" + m1 + "其他为"+ hoka);
	}
}
