package test6;
public class TwoDimensionalArray180{
	//编写一个main方法
	public static void main(String[]agrs) {
		//化繁为简，先死后活
		//思路分析
		//先定义一个保存和的int sum = 0；遍历二位数组
		//遍历过程中让他相加 sum += arr[i][j];
		int[][] arr = {{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.print(sum);
	}
}