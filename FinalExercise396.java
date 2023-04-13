/**
 * 
 */
package com.hspedu.final_;

/**
 * @author 日暮れて道遠し
 *
 */
public class FinalExercise396 {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.fin();
	}
}

class Circle{
	private  double radeius ;
	private  final double PI ;//= 3.14;(1)
	public Circle(double radeius) {
		super();
		this.radeius = radeius;
		PI = 3.14;//(2)
	}
//	{
//		PI = 3.14;(3)
//		
//	}
	public void fin() {
		System.out.println("圆面积等于" + (PI*radeius*radeius));
	}
}