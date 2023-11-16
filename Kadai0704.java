import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai0704 {
	public static void main(String[] args) {
		Seiseki01[] seisekis01 = new Seiseki01[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < seisekis01.length; i++) {
			System.out.print("Number-->");
			String number = sc.next();
			System.out.print("Name-->");
			String name = sc.next();
			System.out.print("Score-->");
			int score = sc.nextInt();
			
			seisekis01[i] = new Seiseki01(number, name, score);
		}
		
		for (int i = 0; i < seisekis01.length; i++) {
			for(int j = 0; j < seisekis01.length - i -1; j++) {
				if (seisekis01[j].getScore() > seisekis01[j + 1].getScore()) {
					Seiseki01 seiseki001 = seisekis01[j];
					seisekis01[j] = seisekis01[j + 1];
					seisekis01[j+1] = seiseki001;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < seisekis01.length; i++) {
			System.out.println(seisekis01[i].getNumber() + " " + seisekis01[i].getName() + "\t" + seisekis01[i].getScore());
		}
	}
}
