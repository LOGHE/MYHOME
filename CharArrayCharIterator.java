/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class CharArrayCharIterator implements CharIterator {
	private char[][] data;
	private int index1;
	private int index2;
	
	public CharArrayCharIterator(char[][] data) {
		super();
		index1 = 0;
		index2 = -1;
		this.data = data;
	}
	@Override
	public boolean hasNext() {
		//二维数组的[index1][index2] index2达到最后一个时，让index1++ 置空index2为-1 因为31行有个++
		//data[index1].length - 1是当前的元素下标例如[1][10]此时已经是最后一个就要把index1++
		//条件里面的长度index1可以不考虑 考虑里面的下标就行，超出就index1++
		if (index2 == data[index1].length - 1) {
			index1++;
			index2 = -1;
			
			//当 index1被25行++到和长度一样时此时下标超出返回false
		if (index1 == data.length  ) {
				return false;
			}
		}
		index2++;
		return true;
		
	}
	@Override
	public char next() {
		
		//二次元配列の行の添え字がオーバーした時return 0
		 if (index1 == data.length && index2 == data[index1][index2]) {//data.lengthは dataのサイズ 
			 return 0;
			 }
		 return data[index1][index2];
	 }
}
