package test6;
public class BubbleSort173test{
	//编写一个main方法
	public static void main(String[]agrs) {
		//我们将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列。
		//思路分析
		//一共进行4轮比较 可以看作外循环四次
		//第一轮比较 4次。2轮3次。3轮2次。四轮1次。 4-3-2-1
		int [] arr = {24,69,80,57,13};
		int temp = 0;//用来保存原先的值用于交换
		for(int i = 0;i < arr.length-1; i++) {//外循环4轮
		for (int j = 0; j < arr.length-i-1; j++) {//内循环的次数为第一轮4次 二轮3 三轮2 四轮1.j<arr.length-i-1来实现
			if(arr[j] > arr[j+1]) {//假设第一个大就和第二个进行对换。
				temp = arr[j];
				arr[j] = arr[j +1];
				arr[j+1] = temp;
			}
		}
		System.out.println("第" + (i+1) + "轮排序为：");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		}
	}
}