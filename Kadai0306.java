/**
 * 
 */
package kadai03;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai0306 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Order order = new Order();

		System.out.print("CustomerNo-->");
		String no = sc.next();
		order.setCustomerNo(no);
		System.out.print("CustomerName-->");
		String name = sc.next();
		order.setCustomerName(name);
		System.out.println();

		System.out.print("Code(-1 : End）-->");
		int code = sc.nextInt();
		while (code != -1) {
			if (order.getNum(code) != -1) {
				System.out.println("Price : " + order.getPrice(code) + " Num : " + order.getNum(code));
				System.out.print("Num-->");
				int num = sc.nextInt();
				order.addNum(code, num);
			} else {
				System.out.println("Code Error");
			}

			System.out.println();
			System.out.print("Code(-1 : End）-->");
			code = sc.nextInt();
		}

		System.out.println();
		System.out.println(order.toString());
	}
}
