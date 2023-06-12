/**
 * 
 */
package syukudaiexercise;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai09e {
	public static void main(String[] args) {
		int [] data = {62,71,87,67,100,85,69,76,72,71};
		int [] rank = new int [data.length];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < rank.length-1; j++) {
				if (data[i] < data[j+1]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i] + "(順位:" + rank[i] + "位)");
		}
	}
}
