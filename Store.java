/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ ジュゴウ)
 *
 */
public abstract class Store {
	protected Object[] data = new Object[5];
	protected int index;

	public void put(Object value) {
		if (size() == data.length) {
			System.out.println("Overflow!");
			System.out.println("Store Size-->" + size());
			return;
		}
		for (int i = index; i < data.length; i++) {
			if (data[i] == null) {// nullのインスタンスを探します
				data[i] = value;
				index = i;//今のPutした添え字
				break;
			}
			// i がlast　＆＆nullでなければ、indexを０にします。
			if (i == data.length - 1 && data[i] != null) {
				index = 0;////今のPutした添え字
				continue;//今の循環を止めます。０から繰り返します。
			}
		}
		System.out.println("Store Size-->" + size());
	}

	public int size() {
		int num = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == null) {
				num++;
			}
		}
		return data.length - num;
	}

	public abstract Object get();
}
