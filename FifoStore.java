/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class FifoStore extends Store {

	@Override
	public Object get() {
		if (size() == 0) {
			return null;
		}
		for (int i = index ; i < data.length ; i++) {
			 if (super.data[i] != null) {
				 super.index = i  ;
				 return data[i];
			 }
		}
		return null;
		
	}
	
}
