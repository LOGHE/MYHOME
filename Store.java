/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ ジュゴウ)
 *
 */
public abstract class Store {
	protected Object[] data = new Object[6];
	protected int index = 0;

	public void put(Object value) {
		if (size() == data.length) {
			System.out.println("Overflow!");
			System.out.println("Store Size : " + size());
			return;
		}else {
		data[index] = value;
		index ++;
		}
		System.out.println("Store Size : " + size());
	}

	public int size() {
		return index;
	}

	public abstract Object get();
}
