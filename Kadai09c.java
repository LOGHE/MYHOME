/**
 * 
 */
package syukudaiexercise;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai09c {
	public static void main(String[] args) {
		int data [] = {10,20,30,40,50,60,70,80};
		int temp = 0;
		for (int i = 0; i < data.length / 2; i++) {
			temp = data[data.length-i-1] ;
			data[data.length-i-1] = data[i];
			data[i] =temp;
		}
		System.out.println("逆順に入れ替え後");
		for (int i = 0; i < data.length; i++) {
			System.out.println("data["+i+"]="+data[i]);
		}
	}
}
