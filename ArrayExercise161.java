package test6;
public class ArrayExercise161{
	//编写一个main方法
	public static void main(String[]agrs) {
	//创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。使用 for 循环访问所有元素并打印出来。
//		提示：char 类型数据运算 'A'+1 -> 'B'	
		//思路分析，先化繁为简
		//创建26个的数组，默认为数字再相加，再强制转换，再循环打印
		char[] eiji = new char[26];
		for(int i = 0;i < eiji.length; i++) {
		   eiji [i] = (char)('A' +i) ;//强制把int转换为char
		  // System.out.print(eiji[i]);
		}
		for(int i = 0;i < eiji.length; i++) {
			  // eiji [i] = (char)('A' +i) ;
			  System.out.print(eiji[i]);
			}
	}
	}