/**
 * 
 */
package com.hspedu.extend;

/**
 * @author 日暮れて道遠し
 *
 */
public class NotePad extends Computer296 {
  String color;

/**
 * @param cPU
 * @param neicun
 * @param yinpan
 * @param color
 */
public NotePad(String cPU, int neicun, int yinpan, String color) {
	super(cPU, neicun, yinpan);
	this.color = color;
}

/**
 * @return color
 */
public String getColor() {
	return color;
}

/**
 * @param color 要设置的 color
 */
public void setColor(String color) {
	this.color = color;
}
  public void in() {
	System.out.println("颜色 ="+color);
}

}
