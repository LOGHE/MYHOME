package test6;
public class ArrayCopy165{
	//编写一个main方法
	public static void main(String[]agrs) {
		//将 int[] arr1 = {10,20,30}; 拷贝到 arr2 数组, 要求数据空间是独立的
		int [] arr1 = {10,20,30};
		//int arr2[]= arr1;
		int [] arr2 = new int[arr1.length];//开辟新的数据空间
		//arr2 = arr1;
		//arr2[1] = 50;不能在这里赋值，代码也是按顺序来的不能乱来
		for(int i = 0;i < arr2.length; i++) {//遍历arr1 把每个元素拷贝到arr2
			arr2[i] = arr1[i];
			//System.out.print(arr2[i]);
		}
		arr2[1] = 50;//当aar1复制给arr2之后 就可以改变arr2的其中一个值，而arr1不受影响
		for(int i = 0;i < arr1.length; i++) {//遍历arr1 把每个元素拷贝到arr2
			
			System.out.print(arr1[i]);
			
		}
for(int i = 0;i < arr2.length; i++) {//遍历arr1 把每个元素拷贝到arr2
			
			System.out.print(arr2[i]);
			
		}
		//System.out.print(arr2[i]);
	}
}