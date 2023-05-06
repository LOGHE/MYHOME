/**
 * 
 */
package com.hspedu.homework_;

import java.time.Year;
import java.util.Arrays;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork495 {
	public static void main(String[] args) {
		String str1 = "Wilian Jefferson Clinton";
	try {
		name(str1);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
	public static void name(String name) {
		int  j = name.indexOf(" ");
		int z = name.lastIndexOf(" ");
		if (!(name != null )) {
			throw new RuntimeException("输入有误");
		}
		//判断是否为英文字母或者空格
		if (!((isAllLetters(name)  ||  name8(name)))) {
			throw new RuntimeException("请输入正确的英文名字或格式");
		}
		
		char[] c1 = name.toCharArray();
				//写出正确情况 然后取反 这样就是反着来就报错
				//System.out.println("j=" +j + "z=" + z);//求出空格出现的第一次和最后一次的下标
				//用数组拷贝的方式求出交换
				//最后全部拷贝完 放在一个新的字符串中输出
				char [] c2 = Arrays.copyOf(c1,j);//Luo
				char [] c3 = new char[c1.length - z-1];//He
				char[] c4 = new char [z - j-1];//Shou
				System.out.println("c4=" + c4.length);
				System.out.println(c3.length+"c3");
				//计算要拷贝的长度 终-始
				int length = c1.length - z-1;
				int c4length = c4.length;
				System.out.println(length);
				System.arraycopy(c1, z+1, c3, 0, length);
				System.arraycopy(c1, j+1, c4, 0, c4length);
				String name1 =new String(c2);
				String name2 =new String(c3);
				String name3 = new String(c4);
				System.out.println(c2);
				System.out.println(c3);
				System.out.println(c4);
				String name4 = name3.substring(0,1);
				name = name2+ "," + name1 + "." + name4;
				System.out.println(name);
	}
	public static boolean isAllLetters(String name) {
		boolean isAlpha = name.matches("[a-zA-Z]+");
		return isAlpha;
		}
	public static boolean name8(String st1) {
		int x =  st1.indexOf(" ");
		int y =  st1.lastIndexOf(" ");
		if (x > 0 && x < y) {
			return true;
		}
		return false;
	}
}
