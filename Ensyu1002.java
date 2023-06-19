/**
 * 
 */
package kadai10;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Ensyu1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data[][] = new int[2][8];
		int sum1 = 0,sum2 = 0,num,age,num1 = 0,num2 = 0;
		//用户输入性别年龄
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println("男0，女1-->");
				num = sc.nextInt();
				System.out.println("年龄-->");
				age = sc.nextInt();
				data[num][age / 10]++;
			}
		}
		//对用户是输入的年龄性别进行总结
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				if (i == 0) {
					sum1 += data[i][j];
				}else {
					sum2 += data[i][j];
				}
				if (j == 0) {
					num1 += data[i][j];
				}else if (j == 3) {
					num2 += data[i][j];
				}
			}
		}
		System.out.println("0代=" + num1 + ",30代=" + num2 + ",男合计=" + sum1 + ",女合计=" + sum2);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
}
