/**
 * 
 */
package com.hspedu.class_;

import java.time.Instant;
import java.util.Date;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Instant492 {
	public static void main(String[] args) {
		//1.通过 静态方法 now() 获取表示当前时间戳的对象
		Instant now = Instant.now();
		System.out.println(now);
		//2. 通过 from 可以把 Instant 转成 Date
		Date date = Date.from(now);
		System.out.println(date);
		//3. 通过 date 的 toInstant() 可以把 date 转成 Instant 对象
		Instant instant = date.toInstant();
		System.out.println(instant);
	}
}
