/**
 * 
 */
package syukudaiexercise;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai09a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[6];
		int n;
		for (int i = 0; i < 5; i++) {
			System.out.println("サイコロ" + (i+1) + "回目");
			n = sc.nextInt();
			arr[n-1]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "が" + arr[i] + "回出ました。");
		}
	}

}
