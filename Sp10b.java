/**
 * 
 */
package kadai10;

import java.time.chrono.JapaneseChronology;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Sp10b {
	public static void main(String[] args) {
		int n = 5,temp = 0;
		int from[][] = new int[n][n];
		int to [][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					from[i][j] = 1;
				}
				if (j == 2) {
					from[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < from.length; i++) {
			for (int j = 0; j < from[i].length; j++) {
				System.out.print(from[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < from.length; i++) {
			for (int j = 0; j < from[i].length; j++) {
				if (i == 0 ) {
					temp =  from[i][j];
					from[i][j] =from[from.length / 2][j] ;
					from[from.length / 2][j] = temp;
				}
			}
			temp =  from[i][from.length-1];
			from[i][from.length-1] = from[i][2];
			from[i][2] = temp ;
		}
		 to = from;
		 System.out.println("===========");
		for (int i = 0; i < to.length; i++) {
			for (int j = 0; j < to[i].length; j++) {
				System.out.print(to[i][j] + " ");
			}
			System.out.println();
		}
	}
}
