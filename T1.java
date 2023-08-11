/**
 * 
 */
package kadai14;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class T1 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] from = new int [5][5];
		int [][] to = new int [5][5];
		for (int i = 0; i < from.length; i++) {
			for (int j = 0; j < from.length; j++) {
				if (i == 0 || j == 2) {
					from[i][j] = 1;
					from[i][j] = 1;
				}
				
			}
		}
		for (int i = 0; i < from.length; i++) {
			for (int j = 0; j < from.length; j++) {
				System.out.print(from[i][j] + " ");
			}
			System.out.println();
		}
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				to[j][5 - 1 - i] = from[i][j];
				j ++;
			}
			i ++;
		}
		
		System.out.println("交换后的值");
		for (int j = 0; j < to.length; j++) {
			for (int j2 = 0; j2 < to.length; j2++) {
				System.out.print(to[j][j2] + " ");
			}
			System.out.println();
		}
	}

}
