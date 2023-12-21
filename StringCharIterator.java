/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class StringCharIterator implements CharIterator {
	private String data;
	private int index;
	public StringCharIterator(String data) {
		super();
		this. index = -1;
		this.data = data;
	}
	@Override
	public boolean hasNext() {
		if (index == data.length()) {
			return false;
		}
		index ++;
		return true;
	}
	@Override
	public char next() {
		char [] data1 = data.toCharArray();
		if (index == data.length()) {
			return 0;
		}
		return data1[index];
	
	}
	
}
