/**
 * 
 */
package syukudaiexercise;

import java.util.Scanner;

import javax.xml.crypto.Data;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai09d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int []data = new int[8];
		System.out.println("年齢-->");
		cnt = sc.nextInt();
		while (cnt >= 0) {
			data[cnt / 10]++;
			System.out.println("年齢-->");
			cnt = sc.nextInt();
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println((i * 10) + "才-:" + data[i]);
		}
	}
}
