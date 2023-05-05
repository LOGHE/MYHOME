/**
 * 
 */
package com.hspedu.homework_;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork494 {
public static void main(String[] args) {
	String id = "我15擦";
	String passwado = "144964";
	String email = "sada@sad.dad";
	try {
		id(id,passwado,email);
		System.out.println("你的id为:" + id);
		System.out.println("你的密码为" + passwado);
		System.out.println("你的邮箱为" + email);
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		System.out.println(e.getMessage());
		return;
	}
}
public static void id(String id,String passwado,String email) {
	if (!(id != null && passwado != null)) {
		throw new RuntimeException("输入不能为空");
	}
		//第一关
		if (!(id.length() >= 2 && id.length() <= 4)) {//写出正确情况取反
			throw new RuntimeException("请输入正确的id");
		}
		//写出正确情况取反
		if (!((passwado(passwado) && passwado.length() == 6))) {
			throw new RuntimeException("请输入正确的数字密码");
		}
		//第三关
		int i = email.indexOf('@');
		int j = email.indexOf('.');
		if (!(i > 0 && i < j)) {//这里定义了@和.那么输入时就必须有不然报错执行下面语句
			throw new RuntimeException("请输入正确邮箱");
		}
//		System.out.println("你的id为:" + id);
//		System.out.println("你的密码为" + passwado);
//		System.out.println("你的邮箱为" + email);
}
public static boolean passwado(String s1) {
	char [] c1 =  s1.toCharArray();
	for (int i = 0; i < c1.length; i++) {
		if (c1[i] > '9' || c1[i]  < '0') {//用&&的话很容易触发 即便满足条件也要被拦截
			return false;//因为取了两层反
		}
	}
	return true;
}
}
