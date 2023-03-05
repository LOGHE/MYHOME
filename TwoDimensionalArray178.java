package test6;
public class TwoDimensionalArray178{
	//编写一个main方法
	public static void main(String[]agrs) {
		/*看一个需求：动态创建下面二维数组，并输出
		i = 0: 1
		i = 1: 2 2
		i = 2: 3 3 3 一个有三个一维数组, 每个一维数组的元素是不一样的
		*/
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {//遍历 arr 每个一维数组
			//给每个一维数组开空间 new
			//如果没有给一维数组 new ,那么 arr[i]就是null
			arr[i] = new int [i+1];
			
			for (int j = 0; j < arr[i].length; j++) {//遍历一维数组，并给一维数组的每个元素赋值
				arr[i][j] = i +1; 
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//遍历完一个数组里面的单位空格
			}
			System.out.println();//遍历完一个数组换行
		}
		
	}
}