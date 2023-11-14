import java.util.Scanner;

/**
 * 
 */

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai0605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("CSV String-->");
		String CSVString = sc.next();
		
		Seiseki seseki = new Seiseki(CSVString);
		
		System.out.println("Number : " + seseki.getNo());
		System.out.println("Name : " + seseki.getName());
		System.out.println("Score : " + seseki.getScore());
		System.out.println("Grade : " + seseki.getGrade());
	}
}
