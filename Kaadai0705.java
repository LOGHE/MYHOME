import java.util.Scanner;

/**
 * 
 */

/**
 * @author 羅寿合(ラ ジュゴウ)
 *
 */
public class Kaadai0705 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Salary[] salary = new Salary[3];

		for (int i = 0; i < salary.length; i++) {
			System.out.print("Number-->");
			String number = sc.next();
			System.out.print("Name-->");
			String name = sc.next();
			System.out.print("Academic-->");
			int academic = sc.nextInt();
			System.out.print("Exyear-->");
			int exyear = sc.nextInt();
			System.out.print("overTime-->");
			int overTime = sc.nextInt();

			salary[i] = new Salary(number, name, academic, exyear, overTime);
		}

		for (int i = 0; i < salary.length; i++) {
			salary[i].printPaytSlip();
		}
	}
}
