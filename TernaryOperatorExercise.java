public class TernaryOperatorExercise{
	//编写一个main方法
	public static void main (String[]args){
//		案列实现三个数的最大值
		int n1 = 200;
		int n2 = 55;
		int n3 = 323;
		//思路
		//先把你
		 
//		  进行比较 得到n1 n2 其中一个值大的保存到max1
//		然后再求出和n3中的最大值 保存到max2 最后最大值就在max2里面至于是上面n1 n2 n3中的哪一个却决于你的赋值
		int max1 = n1>n2 ? n1: n2;//顺序不能乱 
		int max2 = max1 > n3 ? max1:n3;//顺序不能乱如n3 ： max1
		System.out.println("最大数=" + max2);
		
//		用一句话实现,不过很复杂 看起来如下
		int max = (n1>n2 ? n1: n2) > n3 ? (n1>n2 ? n1: n2) : n3;
		System.out.println(max);
	}
	
	}