package com.hspedu.string_;


/**
 * @author 23JN0245 ら じゅごう
 *
 */
public class StringBuffer476 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		//増加
		s.append(",");
		s.append("ドラえもん");
		s.append("とのび太").append(100).append(true).append(10.5);
		System.out.println(s);
		//削除
		//indexの１４から17まで(17含めてない)
		s.delete(15,18 );
		System.out.println(s);
		//替え
		s.replace(15, 18, "静香");
		s.delete(17, 18);
		System.out.println(s.toString());
		//indexを索引 初めて現れた位置
		int indexOf = s.indexOf("静");
		System.out.println("index = "+indexOf);
		//挿入
		s.insert(17, "ジャイアン");
		System.out.println(s);
		//長さ
		System.out.println("長さ＝ " + s.length());
		System.out.println(s);
	}
}
