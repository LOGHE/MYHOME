/**
 * 
 */
package kadai09;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Ensyu904 {
	public static void main(String[] args) {
		int [] arr = new int[6];
		int [] arr2 = new int[6];
		int ban ,ten,sum = 0,index = 0;
		double avg = 0,diff = 100.0,ans = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
		System.out.println("番号");
		ban = sc.nextInt();
		arr[i] = ban;
		System.out.println("点数");
		ten = sc.nextInt();
		arr2[i] = ten;
		sum += arr2[i];
		}
		avg = (double)sum / 6;
		
		for (int i = 1; i < arr2.length; i++) {
		ans = avg - arr2[i];
		if (ans < 0) {
			ans *= -1;
		}
		if (diff > ans) {
			diff = ans;
			index = i;
			
		}
		}
		System.out.println("平均点:" + avg + "番号:" + arr[index] + "点数" + arr2[index]);
	}
}
