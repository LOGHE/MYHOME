/**
 * 
 */
package com.hspedu.exception_;

import java.net.MulticastSocket;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class TryExercise450 {
	public static void main(String[] args) {
		System.out.println(method());
	}
	public static int  method() {
		int i = 1;
		//代码异常处理机制没有错误的地方不会执行catch，会执行自己下面i++执行
		try {
			i++;//2
			System.out.println("i++ = " + i);
			String[] name = new String[3];
			if (name[1].equals("tom")) {//空指针
				System.out.println(name[1]);
			}else {
				name[3] = "hspedu";
			}
			return 1;
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return 2;
		} catch (NullPointerException e) {//捕获
			// TODO: handle exception
			//return ++i;//3 执行但是不输出 因为优先级没有finally高
			return ++i; //return 要返回3 
		}finally {
			//return ++i;//4 我和上面//return ++i;比起来优先return
			++i;
			System.out.println("i= " + i);//我没有return所以上面return ++i;要返回但是我先输出
		}
	}
}

