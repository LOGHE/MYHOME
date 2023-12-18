/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Triangle implements Flgure {
	private int bottom;
	private int height;
	public Triangle(int bottom, int height) {
		super();
		this.bottom = bottom;
		this.height = height;
	}
	@Override
	public double getAree() {
		// TODO 自动生成的方法存根
		return bottom * height / 2;
	}
	
}
