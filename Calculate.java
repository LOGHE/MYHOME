/**
 * 
 */
package paiza;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		double PI = 3.14;
		double m = 0;
		double z = 0;
		double[] arr = new double[2];
		r = sc.nextInt();
		m = PI*r*r;
		z = 2*PI*r;
		arr[0] = m;
		arr[1] = z;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
