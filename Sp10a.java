/**
 * 
 */
package kadai10;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Sp10a {
	public static void main(String[] args) {
		int m = 4,n = 3;
		int t [][] = {{5,4,3},{5,4,3},{5,4,3},{5,4,3}};
		int L [] = new int [m];
		int V [] = new int [n];
		for (int i = 0; i < n; i++) {
			V[i] = 0;
		}
		for (int i = 0; i < 4; i++) {
			L[i] = 0;
			for (int j = 0; j < 3; j++) {
				V[j] += t[i][j];
				//L[i] += t[i][j];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("V========");
		for (int k = 0; k < V.length; k++) {
			System.out.println(V[k]);
		}
		System.out.println("L========");
		for (int k = 0; k < L.length; k++) {
			System.out.println(L[k]);
		}
	}
}
