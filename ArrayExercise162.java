package test6;
public class ArrayExercise162{
	//编写一个main方法
	public static void main(String[]agrs) {
//		请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
		//思路分析
		//先化繁为简
		//先保存数组，
		//再进行比较。默认第一个为最大值，然后在循环里和其他值进行比较
		
		int maxIndex = 0;//保存下标
		int[] arr = {4,-1,9,10,23};
		int max = arr[0];//保存最大值，先默认第一个为最大值
		
		for (int j = 1; j < arr.length; j++) {
			if(arr[0]< arr[j]) {//进行比较，如果后项比第一个大那么就把后项的值赋予第一个
				maxIndex = j;//循环一次下标+1
				max = arr[j];//假设成功 就赋值
				//System.out.print("下标=" j +"最大值="+i[0]);
			}
		}
            	System.out.print("下标=" + maxIndex +"\n"+""
            			+ "最大值="+max);
	}
	}