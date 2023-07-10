/**
 * 
 */
package Kadai13;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai13c {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Shohin s1 = new Shohin();
        Shohin s2 = new Shohin();
        Shohin s3 = new Shohin();
        
        Shohin s0 = new Shohin();
        for (int i = 0; i < 3; i++) {
        	if (i == 0) {
				s0 = s1;
			}
        	if (i == 1) {
				s0 = s2;
			}
        	if (i == 2) {
				s0 = s3;
			}
        	System.out.println("Name-->");
            s0.goodsName = sc.next();
            System.out.println("Price-->");
            s0.unitPrice = sc.nextInt();
            System.out.println("Special(0:0% 1:5% 2:30%)-->");
            s0.discountCode = sc.nextInt();
            s0.getSalePrice();
		}
        
        System.out.println();
        s1.printShohin();
        System.out.println();
        s2.printShohin();
        System.out.println();
        s3.printShohin();
    }
}

class Shohin {
    String goodsName;
    int unitPrice;
    int discountCode;
    public int getSalePrice() {
        switch (discountCode) {
        case 0 :
            return unitPrice;
        case 1 :
            return (int)(unitPrice * 0.95);
        case 2 :
            return (int)(unitPrice * 0.7);
        default:
        return discountCode = -1;
        }
    }
    public void printShohin() {
        System.out.println("Name : " + goodsName);
        System.out.println("Price : \\" + unitPrice);
        switch (discountCode) {
        case 0 :
            System.out.println("special : 値引きなし" );
            break;
        case 1 :
            System.out.println("special : 5%値引き");
            break;
        case 2 :
            System.out.println("special : 30%値引き");
            break;
        case -1 :
            System.out.println("入力エラー");
            break;
        }
        System.out.println("SalePrice : " + getSalePrice());
        
    }


    
}
