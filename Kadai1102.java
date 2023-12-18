/**
 * 
 */
package Kadai11;

import java.util.Scanner;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai1102 {
	public static void main(String[] args) {
		Flgure [] flgures = new Flgure[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < flgures.length; i++) {
			System.out.print("1 : Circle   2 : Rectangle 3 : TRiangle -->");
			int no = sc.nextInt();
			
			if (no == 1) {
				System.out.print("Radius-->");
				int radius = sc.nextInt();
				flgures[i] = new Cirde(radius);
			}else if (no == 2) {
				System.out.print("Side1-->");
				int side1 = sc.nextInt();
				System.out.print("Side2-->");
				int side2 = sc.nextInt();
				flgures[i] = new Rectangle(side1, side2);
			}else {
				System.out.print("Bottom-->");
				int bottom = sc.nextInt();
				System.out.print("Height-->");
				int height = sc.nextInt();
				flgures[i] = new Triangle(bottom, height);
			}
			System.out.println();
		}
		
		for (int i = 0; i < flgures.length; i++) {
			if (flgures[i] instanceof Cirde) {
				Cirde cirde = (Cirde)flgures[i];
				System.out.println("Area : " + cirde.getAree());
				
			}else if (flgures[i] instanceof Rectangle) {
				Rectangle rectangle = (Rectangle)flgures[i];
				System.out.println("Area : "  + rectangle.getAree());
			}else {
				Triangle triangle = (Triangle)flgures[i];
				System.out.println("Area : "  + triangle.getAree());
			}
		}
	}
}
