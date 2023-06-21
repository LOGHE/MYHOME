/**
 * 
 */
package kadai10;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Sp10b2 {
	public static void main(String[] args) {
		int n = 5;
		int from[][] = new int[n][n];
		int to [][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 2) {
					to[i][j] = 1;
				}
				if (j == 4) {
					to[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < to.length; i++) {
			for (int j = 0; j < to[i].length; j++) {
				System.out.print(to[i][j] + " ");
			}
			System.out.println();
		}
	}
}
