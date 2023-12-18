/**
 * 
 */
package Kadai11;

import java.util.Scanner;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai1101 {
	public static void main(String[] args) {
		Syain [] syains = new Syain[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < syains.length; i++) {
			System.out.print("1 : Eigyo 2 : Hanbai -->");
			int no = sc.nextInt();
			
			System.out.print("Code-->");
			String code = sc.next();
			System.out.print("Name-->");
			String name = sc.next();
			
			if (no == 1) {
				syains[i] = new Eigyo(code, name);
			}else {
				syains[i] = new Hanbai(code, name);
			}
			System.out.println();
		}
		
		for (int i = 0; i < syains.length; i++) {
			if (syains[i] instanceof Eigyo) {
				Eigyo eigyo = (Eigyo)syains[i];
				System.out.println("Code : " + eigyo.getCode());
				System.out.println("Name : " + eigyo.getName());
				System.out.println("営業 : ");
				eigyo.work();
			}else {
				Hanbai hanbai = (Hanbai)syains[i];
				System.out.println("Code : " + hanbai.getCode());
				System.out.println("Name : " + hanbai.getName());
				System.out.println("販売 : ");
				hanbai.work();
			}
			System.out.println();
		}
	}
}
