package test6;
import java.util.Scanner;
public class ArrayAddTwo170{
	//编写一个main方法
	public static void main(String[]agrs) {
		//要求：实现动态的给数组添加元素效果，实现对数组扩容。
		//原始数组使用静态分配 int[] arr = {1,2,3}
		//2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
//		3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
		//思路分析
		//先定义一组新数组 长度比arr大一个
		//然后遍历arr。遍历过程中把只有三个下标的arr全部复制给新的arr2的前三个下标，arr2的最后一个下标手动赋值给他，
		//最后把已经完成扩容的arr2又赋值给arr 这时原先的arr就会销毁。此时的arr等价于arr2
		//遍历输出arr。得到扩容后新的arr
		
		//创建Scanner对象接收用户输入
		//使用do-while把原先的内容扩起来，来无限循环
		Scanner myScanner = new Scanner(System.in);
		int [] arr = {1,2,3};
		do{
			System.out.println("请添加内容");
				int [] arr2 = new int[arr.length+1];//新定义的数组比原先多一个长度
				for (int i = 0; i < arr.length; i++) {//先遍历arr
				arr2 [i] = arr[i];//把arr的所有长度赋值给arr的前三个下标
				}
				int num = myScanner.nextInt();
				arr2[arr2.length-1] = num;//前面已经赋值完了，这里还有最后一个下标没有赋值。给他赋值4
				arr = arr2;//把已经完成扩容赋值的arr2再赋值给arr。
				//此时原先的arr会销毁重新得到新的arr 此时新的arr等价于arr2
				for (int i = 0; i < arr2.length; i++) {
					System.out.println(arr[i]);//输出内容就是完成扩容的arr 1，2，3，4.
				}
				System.out.println("是否继续？y/n");
				char key = myScanner.next().charAt(0);
				if(key == 'n') {
					break;
				}
		}while(true);
		System.out.println("您已退出程序");
		System.out.println(arr[4]);
	}
}