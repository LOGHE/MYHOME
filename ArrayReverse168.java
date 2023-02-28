package test6;
public class ArrayReverse168{
	//编写一个main方法
	public static void main(String[]agrs) {
		//方式 2：使用逆序赋值方式
		//思路分析 先创建一个arr数组
		//然后再创建一个新的数组用来保存逆序赋值后的数组
		//增加一个变量int j = 0; 用来使逆序完成
		int [] arr = {11,22,33,44,55,66};
		int [] arr2 = new int [arr.length];
		for (int j = 0,i = arr.length-1;  i >= 0; i--,j++) {//这里为什么是arr.lrngth - 1；因为-1的话就是 6-1，5-1，4-1，后面是i--
			arr2[j] = arr[i];
		}
		for (int j = 0; j < arr.length;j++) {
			System.out.println(arr2[j]);//这里已经完成了arr的值反转赋给arr2
		}
		arr = arr2;//把已经改变的arr2又返还给arr 这样就完成了。arr的整体反转
		for (int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}