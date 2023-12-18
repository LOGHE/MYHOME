/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Rectangle implements Flgure {
	private int side;
	private int side2;
	public Rectangle(int side, int side2) {
		this.side = side;
		this.side2 = side2;
	}
	@Override
	public double getAree() {
		// TODO 自动生成的方法存根
		return side * side2 ;
	}
	
}
