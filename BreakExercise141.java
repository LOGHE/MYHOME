package test1;
public class BreakExercise141{
	//编写一个main方法
	public static void main(String[]agrs) {
		//1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break
		//先化繁为简
		//先求出1-100的数字自增排列
		//再将其相加
		//再在嵌套里面加入条件（当相加的值大于20停止输出。并输出此时的数字
		//2先死后活 n代替i
		int sum = 0;//求和
		int n =0;//代替i的
		for(int i = 1; i <= 100; i++) {
			sum += i;
			
			if(sum > 20) {//筛选条件满足条件终止并输出此时正处于哪个值i
				//System.out.println(i);
				n = i;//先死后活
				break;//后面不能加条件因为已经终止了
				
			}
			
		}
		System.out.println("当第一次和大于20时当前数字为" + n);
		
		
	}
}
