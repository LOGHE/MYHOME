package test7;
public class HomeWork251 {
	//编写一个 main 方法
	public static void main(String[] args) {
		double[]arr = null;
		A01 a01 = new A01();
		double res = a01.max(arr);
		if(res!=-1) {
		System.out.println("arr的最大值="+a01.max(arr));
		}else {
			System.out.println("你输入的有误");
		}
		
	}
}
//1．编写类A01，定义方法 max ，实现求某个 double 数组的最大值，并返回
class A01{
	public double max (double nums[]) {
		if(nums!= null&&nums.length >0) {//这里是防止为null
		double max1 = nums[0];
		int indmax = 0;//假设第一个为最大值 然后下面循环
		//如果第二个比第一个大就让第二个值赋给第一个最大值,最后输出最大值
		for (int i = 0; i < nums.length; i++) {
			if(max1 <nums[i] ) {
			 max1 = nums [i];
			 indmax += 1;
			}
		}
		return max1;
		}else {
			
			return -1;
		}
	}
}