import java.util.Scanner;

/**
 * 
 */

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai0706 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Card No-->");
		String cardNo = sc.next();
		System.out.print("Name-->");
		String name = sc.next();
		System.out.print("Tel-->");
		String tel = sc.next();
		System.out.print("Buy Count-->");
		int count = sc.nextInt();
		
		Buy [] buys = new Buy[count];
		Card card = new Card(cardNo, name, tel, buys);
		
		System.out.println();
		for (int i = 0; i < buys.length; i++) {
			System.out.print("Buy Date-->");
			String buyDate = sc.next();
			System.out.print("Shohin No-->");
			String shojinNo = sc.next();
			System.out.print("Price-->");
			int price = sc.nextInt();
			System.out.print("Num-->");
			int num = sc.nextInt();
			buys[i] = new Buy(i, buyDate, shojinNo, price, num);
			System.out.println();
		}
		card.printCardDate();
	}
}
