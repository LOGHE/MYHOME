/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class CharIteratorFactory {
	public static CharIterator getCharIterator(String data) {
		return new StringCharIterator(data);
	}
	public static CharIterator getCharIterator(char[][] data) {
		return new CharArrayCharIterator(data);
	}
}
