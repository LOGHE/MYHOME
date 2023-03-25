package test7;
public class HomeWork254 {
	//编写一个 main 方法
	public static void main(String[] args) {
		int arr[]= {1,2,5,4,3};
		A03 a1 = new A03();
		int[] arr2 = a1.name(arr);//这里把数组arr传入形参
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
//编写类A03，实现数组的复制功能 copyArr ，输入旧数组，返回一个新数组，元素和旧数组一样
class A03{
	public int[] name(int[] oldArr) {//返回值可以是数组 形参也可以是一个数组没有值的 
		//等待传入的。传入后开始执行
		int []arr2= new int[oldArr.length];
		for (int i = 0; i < oldArr.length; i++) {
			arr2[i] = oldArr[i];
		}
		arr2[0] = 0; //检验是否完成数组拷贝
		return arr2; 
//		for (int i = 0; i < arr2.length; i++) {因为上面有返回值所以这里注销了。不需要返回值的时候这里可以留
//			System.out.println(arr2[i]);
	}
}