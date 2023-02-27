package test6;
public class ArrayReverse167{
	//编写一个main方法
	public static void main(String[]agrs) {
		/*要求：把数组的元素内容反转
		arr {11,22,33,44,55,66} {66, 55,44,33,22,11}
		//思考 2min
		方式 1：通过找规律反转
		方式 2：使用逆序赋值方式 【思路分析, 学员自己完成】
		*/
		//思路分析
		//把第0个下标arr[0]和最后一个下标arr[5]转换
		//把第1个下标arr[1]和最后一个下标arr[4]转换
		//把第2个下标arr[2]和最后一个下标arr[3]转换
		//上面是交换三次 arr.length/2 = 3.那就循环三次
		//如何实现arr[543]  => arr[arr.length-1-i]
		//建立循环循环里面交换，arr[i] = arr[arr.length-1-i]
		//
		
		int arr [] = {11,22,33,44,55,66};
		int t = arr.length;//长度 6
		int j = t/2;//长度的一半记录置换的次数
		int h = 0;//用来保存下面置换的下标456
	for (int i = 0; i < j; i++) {//三次循环完成置换
		h = arr[t-1-i];//h保存下标arr[4,5,6]的值
		 arr[t-1-i] = arr[i];//把arr的下标[i(1,2,3)]赋值置换给arr的下标[4,5,6].此时左边=arr[i(1,2,3)]
		arr[i] = h;//把 h下标值返还给 arr[i(1,2,3)]，此时arr[i] = arr[4,5,6] 的值
		//因为是两个空间 所有值不像基本变量那样都是一个空间改变。这里数组都是有独立空间的 详细看164集
		
	}
	for (int i = 0; i < t ; i++) {//完成置换之后就可以打印下标0-5了
		System.out.println(arr[i]);
	}
	}
}