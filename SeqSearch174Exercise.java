package test6;
import java.util.Scanner;
public class SeqSearch174Exercise{
	//编写一个main方法
	public static void main(String[]agrs) {
//		请对一个有序数组进行二分查找 {1,8, 10, 89, 1000, 1234} ，输入一个数看看该数组是否存在此数，
//		并且求出下标，如果没有就提示"没有这个数"
		int [] arr = {1,8,10,89,1000,1234};
		Scanner myScanner = new Scanner(System.in);
		int index = -1;
		System.out.println("请输入查找数字");
		int shuzi = myScanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(shuzi == arr[i]) {
				System.out.println("恭喜你找到了" + shuzi+ "\n" + "下标为"+i );
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("没有找到" + shuzi);
		}
	}
}
