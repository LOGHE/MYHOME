package test6;
public class BubbleSort173{
	//编写一个main方法
	public static void main(String[]agrs) {
		//我们将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列。
		//思路分析
		//一共进行4轮比较 可以看作外循环四次
		//第一轮比较 4次。2轮3次。3轮2次。四轮1次。 4-3-2-1
		
		
		/*数组 [24,69,80,57,13]
				第 1 轮排序: 目标把最大数放在最后 
				第 1 次比较[24,69,80,57,13]
				第 2 次比较[24,69,80,57,13]
				第 3 次比较[24,69,57,80,13]
				第 4 次比较[24,69,57,13,80]*/
		int [] arr = {24,69,80,57,13};
		int temp = 0;
		System.out.println("第一次循环");
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		// 第 2 轮排序: 目标把第二大数放在倒数第二位置
		// 第 1 次比较[24,69,57,13,80]
		// 第 2 次比较[24,57,69,13,80]
		// 第 3 次比较[24,57,13,69,80]
		System.out.println("第二次循环");
		for (int j = 0; j < arr.length-2; j++) {
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		// 第 3 轮排序: 目标把第 3 大数放在倒数第 3 位置
		// 第 1 次比较[24,57,13,69,80]
		// 第 2 次比较[24,13,57,69,80】
		System.out.println("第三次循环");
		for (int j = 0; j < arr.length-3; j++) {
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		// 第 4 轮排序: 目标把第 4 大数放在倒数第 4 位置
		// 第 1 次比较[13,24,57,69,80]
		System.out.println("第四次循环");
		for (int j = 0; j < arr.length-4; j++) {
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}