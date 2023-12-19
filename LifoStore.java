/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class LifoStore extends Store {

	@Override
	public Object get() {
		if (size() == 0) {
			return null;
		}
		return data[index];
	}
	
}
