/**
 * 
 */
package Kadai13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai1304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberList ML = new MemberList();
		
		System.out.print("A: Add D : Delete P : Print E: End-->");
		try {
			String select = sc.next();
			while (!select.equals("E")) {
				if (select.equals("A")) {
					try {
						System.out.print("No-->");
						int no = sc.nextInt();
						System.out.print("Name-->");
						String name = sc.next();
						ML.add(new Member(no, name));
						System.out.println();
					} catch (MemberException  e) {
						System.out.println(e.getMessage().toString());
						System.out.println();
					}catch (InputMismatchException e) {
						sc.next();
						System.out.println("入力エラー");
						System.out.println();
					}
					
				}
				
				if (select.equals("D")) {
					try {
						System.out.print("No-->");
						int no = sc.nextInt();
						System.out.print("Name-->");
						String name = sc.next();
						ML.delete(new Member(no, name));
						System.out.println();
					} catch (MemberException e) {
						sc.next();
						System.out.println(e.getMessage().toString());
						System.out.print("A: Add D : Delete P : Print E: End-->");
						select = sc.next();
					}catch (InputMismatchException e) {
						System.out.println("入力エラー");
						System.out.println();
					}
				}
				
				if (select.equals("P")) {
					ML.print();
					System.out.println();
				}
				
				System.out.print("A: Add D : Delete P : Print E: End-->");
				select = sc.next();
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("入力エラー");
			System.out.println();
		}
	}
}
