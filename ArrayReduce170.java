package test6;
import java.util.Scanner;
public class ArrayReduce170{
	//编写一个main方法
	public static void main(String[]agrs) {
		//有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。
		//当只剩下最后一个元素，提示，不能再缩减
		
		//思路分析
		//创建Scanner对象接收用户输入
		//先遍历原先数组，再打印原先数组
		//开始进行do - while大循环
		//大循环里面先定义一个新的int [] arr2 =int arr [arr.length-1]
		//然后再把arr[i]的每个值赋给arr2[i]的每个值，不过此时的arr2长度已经减少，赋值也减少。
		//因为在do-while循环里面可以一直循环，一直减少赋值。
		//加了Scanner是可以接收用户输入外加给与条件，输入y继续执行输入n那么break
		//
		Scanner myScanner = new Scanner(System.in);
		int [] arr = {1,2,3,4,5};
		System.out.println("打印原始数组");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	 		do{
	 			int [] arr2 = new int[arr.length-1];
	 			for (int i = 0;i < arr.length-1; i++) {
	 				arr2[i] = arr[i];
	 			}	
	 			arr = arr2;
	 			System.out.println("缩减后的数组");
	 			for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i] + " ");
				}
	 			System.out.println("是否继续进行缩减y/n");
	 			char key = myScanner.next().charAt(0);
	 			if(key == 'n') {
	 				break;
	 				}else if(arr.length == 1) {
	 					System.out.println("不能再删减了");
	 					break;
		 }
		}while(true);
	 		System.out.println("你已退出程序");
	 }
   }
