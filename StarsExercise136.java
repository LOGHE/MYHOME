package test1;
//个人尝试 正宗答案看韩老师的Stars.java。尝试失败，手动打印的第5行不会按照循环规律来对格式
public class StarsExercise136{
	//编写一个main方法
	public static void main(String[]agrs) {
		/*思路分析
		化繁为简
		1. 先打印一个矩形
		*****
		*****
		*****
		*****
		*****
		i表示层数 5层
		
		2. 打 印半个金字塔
		* //第 1 层 有 1 个*
		** //第 2 层 有 2 个*
		*** //第 3 层 有 3 个*
		**** //第 4 层 有 4 个*
		***** //第 5 层 有 5 个
		
		3打印一个完整金字塔
		    * //第 1 层 有 1 个* 2 * 1 -1 有 4=(总层数-1)个空格
		   *** //第 2 层 有 3 个* 2 * 2 -1 有 3=(总层数-2)个空格
		  ***** //第 3 层 有 5 个* 2 * 3 -1 有 2=(总层数-3)个空格
		 ******* //第 4 层 有 7 个* 2 * 4 -1 有 1=(总层数-4)个空格
		*********5层有层数5*2-1个* 那还要打印空格 为0 =总层数-5
		重点：输出*之前输出空格
		
		4. 打印空心的金字塔 [最难的]
			    * //第 1 层 有 1 个* 当前行的第一个位置是*,最后一个位置也是*
			   * * //第 2 层 有 2 个* 当前行的第一个位置是*,最后一个位置也是*
			  *   * //第 3 层 有 2 个* 当前行的第一个位置是*,最后一个位置也是*
			 *     * //第 4 层 有 2 个* 当前行的第一个位置是*,最后一个位置也是*
			********* //第 5 层 有 2 个* 当前行的第一个位置是*,最后一个位置也是*
			控制输出*的数量 
		
		自己的思路
		（1）先打印四层空心金字塔然后第五层直接输出9颗*
		5先死后活带入颗代替的字母
		
		
		*/
		for (int i = 1;i<=4;i++) {//i表示层数
			//输出*之前输出空格 k表示层数
			for(int k = 1;k <= 4 - i;k++) {
				System.out.print(" ");//表示每打印完一层换行 ln表示打印完换行这里不需要换行，换行在最下面
			}
//			再来一个循环控制打印的*个数
			for(int j = 1;j <= 2 * i-1;j++) {
				if(j == 1||j == i * 2 - 1) {
					//j = 1 表示第一层就只打印1颗* 
					//j == i*2-1 因为有变量i 所以表示2 3 4 5层 
					//i=5是按照每个以第五层标准来执行，也就是在第五层做手脚让第五层打印9颗*  
//个人尝试省略第五层手动打印 //当i=5时 因为用了短路与 所以j == i * 2 -1 的第五层不输出，应当优先i == 5这个条件
			System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			System.out.print(" ");
		}
		
	}
	}