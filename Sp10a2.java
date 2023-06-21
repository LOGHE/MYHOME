/**
 * 
 */
package kadai10;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Sp10a2 {
	public static void main(String[] args) {
		int ban [][] = new int [5][5];
		int hou [][] = {{1,1,1,0,0,-1,-1,-1},{0,1,-1,1,-1,0,1,-1}};
		int cnt,i = 0,j = 0,g = 2,r = 2,h;
		ban [g][r] = 1;
		for ( cnt = 0; cnt < 8; cnt++) {
			i =g + hou[0][cnt];
			j =r + hou[1][cnt]; 
			while (i >= 0 && i < 5 && j >= 0 && j < 5) {
                ban[i][j] = 1;
                i += hou[0][cnt];
                j += hou[1][cnt];
            }
		}
		for (int k = 0; k <5; k++) {
			for (int k2 = 0; k2 < 5; k2++) {
				System.out.print(ban[k][k2] + " ");
			}
			System.out.println();
		}
	}
}
