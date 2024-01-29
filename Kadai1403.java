/**
 * 
 */
package Kadai14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai1403 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		GoodsList goodsList = new GoodsList();
		
		CustomerList customerList = new CustomerList();
		
		List<String> list = new ArrayList<>();
		
		List<String> screen = new ArrayList<>();
		
		boolean bool = true;
		while (bool) {
			int total = 0;
			String goodsName ="";
			System.out.print("顧客コードを入力してください(CU01~CU05) END : E-->");
			String customerNo = scanner.next();
			if (customerNo.equals("E")) {
				break;
			}
			if (customerList.get(customerNo) != null) {
				boolean bool2 = true;
				while (bool2) {
					System.out.print("商品コードを入力してください END : E-->");
					String goodsNo = scanner.next();
					if (goodsNo.equals("E")) {
						break;
					}
					
					System.out.print("購入数量を入力してください-->");
					int num = scanner.nextInt();
					if (goodsList.get(goodsNo) != null) {
						int goodstotal = 0;
						goodstotal = num * goodsList.get(goodsNo).getPrice();
						total += goodstotal;
						goodsName += goodsNo + " : " + goodsList.get(goodsNo).getGoodsName() + "=" + goodstotal + "\n";
					}
				screen.add(customerNo + "," + goodsNo + ","  + num);
				}
				list.add(customerNo + " : " + customerList.get(customerNo).getCustomerName() +"\n" + goodsName + "total : " + total);
			}
		}
		
		System.out.println();
		System.out.println("------------購入一覧-----------");
		System.out.println("顧客コード,商品コード,購入数量");
		for (String str : screen) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("------------購入明細-----------");
		for (String str : list) {
			System.out.println(str);
			System.out.println();
		}
	}
}
