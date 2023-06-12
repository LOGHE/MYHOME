/**
 * 
 */
package syukudaiexercise;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai09b {

	public static void main(String[] args) {
		int n = 0,h = 0;
		int [] test = {50,70,88,100,30,65,36,77,85,99};
		int arr [] = new int[10];
		int arr2 [] = new int[10];
		for (int i = 0; i < test.length; i++) {
			if (test[i] >= 60 && test[i] <= 100) {
				arr[n] = test[i];
				n++;
			}
			if (test[i] >= 0 && test[i] < 60) {
				arr2[h] = test[i];
				h++;
			}
		}
		System.out.println("ok件数は" + n + "件です。");
		for (int i = 0; i < n; i++) {
			System.out.println("ok[" + i + "]=" + arr[i]);
		}
		System.out.println("ng件数は" + h + "件です。");
		for (int i = 0; i < h; i++) {
			System.out.println("ng[" + i + "]=" + arr2[i]);
		}
	}
}
