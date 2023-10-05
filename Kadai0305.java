/**
 * 
 */
package kadai03;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai0305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Seiseki seiseki = new Seiseki();
		
		System.out.print("No-->");
		String no = sc.next();
		seiseki.setNo(no);
		System.out.print("Name-->");
		String name = sc.next();
		seiseki.setName(name);
		System.out.print("Kamoku-->");
		String kamoku = sc.next();
		seiseki.setKamoku(kamoku);
		System.out.print("count-->");
		int count = sc.nextInt();
		int tokuten [] = new int [count];
		for (int i = 0; i < count; i++) {
			System.out.print("Test" +  (i + 1) + "-->");
			int test = sc.nextInt();
			tokuten[i] = test;
		}
		seiseki.setTokuten(tokuten);
		System.out.println();
		System.out.println(seiseki.toString());
		System.out.println();
		
		System.out.print("Count(1~" + count + ")-->");
		count = sc.nextInt(); 
		System.out.println("Tset" + count + "-->");
		int ten = sc.nextInt();
		seiseki.setTokutenN(count-1, ten);
		System.out.println();
		System.out.println(seiseki.toString());
		
	}
}
