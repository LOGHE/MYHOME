/**
 * 
 */
package Kadai12;


/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Nibunhou {
	public static void main(String[] args) {
		int [] no = {5,8,9,12,17,18,19,22,25,27};
		int price [] = {100,500,980,120,50,1200,1500,1820,2100,480};
		int N = no.length,l = 0, r = N -1, m = (r + 1) / 2;
		int number = 18;
		while (l <= r && number != no[m]) {
			if (number < no[m]) {
				r = m -1;
			}else {
				l = m + 1;
			}
			m = (l + r) / 2;
		}
		if (l <= r) {
			System.out.println(price[m]);
		}else {
			System.out.println("nasi");
		}
	}
}

