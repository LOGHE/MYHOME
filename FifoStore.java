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
		Object obj;
		if (size() >= 1) {
			index --;
			obj = data[0];
			for (int i = 0 ; i < size() ; i++) {
				data[i] = data[i + 1];
		}
		}else {
			obj = null;
			index = 0;//说明index= -1 了要让他等于0防止下标出错
		}
		return obj;
		
	}
	
}
