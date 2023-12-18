/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Cirde implements Flgure {
	private int radius; 
	
	public Cirde(int radius) {
		this.radius = radius;
	}

	@Override
	public double getAree() {
		// TODO 自动生成的方法存根
		return radius * radius * 3.14;
	}
	
}
