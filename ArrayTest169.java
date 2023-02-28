package test6;
public class ArrayTest169{
	//编写一个main方法
	public static void main(String[]agrs) {
		int[] arr = {1,2,3};
		int[] arr2 = {1,2,3,4};
		arr =arr2;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);//1 2 3 4
		}
		System.out.print(arr[0]);
	}
}