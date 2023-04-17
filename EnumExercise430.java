/**
 * 
 */
package com.hspedu.enum_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class EnumExercise430 {
	public static void main(String[] args) {
		Week[] values = Week.values();
		System.out.println("===所有星期的信息如下==");
		for (Week week : values) {
			System.out.println(week.getKoudo());
		}
	}
}

enum Week{
	
	MONDAY("星期一","登校"),TUESDAY("星期二","网课"),WEDNESDAY("星期三","网课"),THURSDAY("星期四","登校"),
	FRIDAY("星期五","登校"),SATURDAY("星期六","兼职"),SUNDAY("星期日","兼职");
	private String koudo;
	private String basyo;
	private Week(String koudo, String basyo) {
		this.koudo = koudo;
		this.basyo = basyo;
	}
	public String getKoudo() {
		return koudo;
	}
	public void setKoudo(String koudo) {
		this.koudo = koudo;
	}
	public String getBasyo() {
		return basyo;
	}
	public void setBasyo(String basyo) {
		this.basyo = basyo;
	}
	@Override
	public String toString() {
		return    koudo + " : "+ basyo ;
	}
	
}