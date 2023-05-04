/**
 * 
 */
package com.hspedu.class_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class LocalDate_491 {
	public static void main(String[] args) {
		//第三代
		//使用now（）返回当前日期的对象
		LocalDateTime ldt = LocalDateTime.now();//获取年月日时分秒
		//如果拆开的话
		LocalDate now = LocalDate.now();//年月日
		LocalTime now2 = LocalTime.now();//时分秒
		System.out.println(now);
		System.out.println(now2);
		System.out.println("============");
		System.out.println(ldt);
		System.out.println("年=" + ldt.getYear());
		System.out.println("月" + ldt.getMonth());
		System.out.println("月=" + ldt.getMonthValue());
		System.out.println("日=" + ldt.getDayOfMonth());
		System.out.println("时" + ldt.getHour());
		System.out.println("分" + ldt.getMinute());
		System.out.println("秒" + ldt.getSecond());
		
		//使用DateTimeFormatter来获取时间日期格式
		DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
		String format = d1.format(ldt);
		System.out.println(format);
		
		//提供puls 和 minus方法可以对当前时间进行加减
		//看看20天后是上面时候
		LocalDateTime plusDays = ldt.plusDays(20);
		System.out.println("20天后" + plusDays);
		
		//20 天前是什么时候
		LocalDateTime minusDays = ldt.minusDays(20);
		System.out.println("20天前" + minusDays);
	}
}
