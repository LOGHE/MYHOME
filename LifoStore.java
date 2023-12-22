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
		Object obj;
		if (size() != 0) {
			obj = data[size() - 1];//いつでもlastのデータを取れます
			index --;
		}else {
			obj = null;
		}
		return obj;
	}
	
}
