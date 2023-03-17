package test7;
public class Migong223 {
	//编写一个 main 方法
	public static void main(String[] args) {
		//先用二维数组打印出迷宫图
		//再用递归改变行动轨迹
		//1 打印迷宫 ,1表示障碍物 0 表示可以走
		int [][]map = new int[8][7];
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//再打印左右的墙
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//再打印中间的墙，因为没有规律所以直接定义
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//添加障碍物 造成回溯现象 出现3
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		P p1=new P();
		p1.findWay(map, 1, 1);
		System.out.println("老鼠是如何走迷宫的");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//思路分析
//接下来就是用递归了 先创建一个类 P
//1用boolean类型找到就返回true 找不到就返回false
//2 二维数组map 迷宫
//3 i j 表示老鼠移动的位置。用户自己先输入初始值
//4 开始规定数组的每个数的含义
// 0表示可以走的路 1表示障碍物 2表示可以走的路既后面标记走过的路 3表示走过走不通的路
//规定出口 map[6][5]=2;就是出口
//重点 再规定找路顺序先左，下，右，上
class P{
	public boolean findWay(int[][]map,int i ,int j) {
		if(map[6][5]== 2) {
			return true;
		}
//			if(map[i][j] == 0) {
//				map [i][j]=2;
//				if(findWay(map, i, j-1)){
//					return true;
//				}else if(findWay(map, i+1, j)) {
//					return true;
//				}else if(findWay(map, i, j+1)) {
//					return true;
//				}else if(findWay(map, i-1, j)) {
//					return true;
//				}else {//任何if else if elseif 语句最后都需要else来结尾
//				map[i][j]=3;//用来解释回溯现象
//				return false;
//				}
//			}else {
//				return false;
		
		
		//重点 再规定找路顺序先下右上左
		if(map[i][j]==0) {//当前这个数为0 说明可以走
			//我们假定可以走通
			map[i][j]=2;//2表示当前位置 输出后表示可以走且走过的位置
			//使用找路策略来确定该位置是否真的可以走通
			if (findWay(map, i, j-1)) {//表示先走下
				return true;
			}else if(findWay(map, i+1, j)) {//不行就走右
				return true;
			}else if(findWay(map, i, j+1)) {//不行就走上
				return true;
			}else if(findWay(map, i-1, j)) {//不行就走左
				return true;
			}else {//都不是就只有等于3的可能了
				map[i][j]=3;
				return false;
			}
		}else {//都不是那么说明走不通返回false
			return false;
		}	
	}
}