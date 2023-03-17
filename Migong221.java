package test7;
public class Migong221 {
	//编写一个 main 方法
	public static void main(String[] args) {
		//老鼠出迷宫
		//思路
		//1先创建迷宫，用二维数组表示 int[][]map = new int[8][7];
		//2先规定map数组的元素值:0表示可以走 1表示障碍物
		int[][]map = new int[8][7];
		//3将最上面一行和最下面一行全部设置为1；
		for (int i = 0; i < 7; i++) {
			map [0][i]=1;
			map[7][i]=1;
		}
		//4将最左和最右的一列设为1
		for (int i = 0; i < 8; i++) {
			map[i][0]=1;
			map[i][6]=1;
		}
		//直接定义 map[3][1]=1;map[3][2]=1;这两个障碍物
				map[3][1]=1;
				map[3][2]=1;
			
		//输出当前地图
		System.out.println("当前地图情况");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		//使用findway来给老鼠找路
		H h1 = new H();
		h1.findWay(map, 1, 1);
		System.out.println("找路情况如下");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}





class H{
	//使用递归思想来解决
	//解读
	//1 findWay方法就是专门找出迷宫的路径
	//2 如果找到就返回true 找不到就返回false
	//3 map就是二维数组集表示迷宫
	//4 i,j就是老鼠的位置，初始化的位置为（1，1）
	//5 因为我们是递归找路，所以我先规定map数组的各个值的含义
	// 0 表示可以走 1 表示障碍物 2 表示可以走 3表示走过但是走不通是思路
	//6 当map[6][5]=2; 就说明找到通路，就可以结束了。否则就继续找
	//7 先确定老鼠找路策略 下-> 右-> 上-> 左->
	public boolean findWay (int[][]map ,int i, int j) {
		if(map[6][5]==2) {//说明已经找到
			return true;
		}
		if(map[i][j]==0) {//当前这个数为0 说明可以走
			//我们假定可以走通
			map[i][j]=2;//2表示当前位置 输出后表示可以走且走过的位置
			//使用找路策略来确定该位置是否真的可以走通
			if (findWay(map, i+1, j)) {//表示先走下
				return true;
			}else if(findWay(map, i, j+1)) {//不行就走右
				return true;
			}else if(findWay(map, i-1, j)) {//不行就走上
				return true;
			}else if(findWay(map, i, j-1)) {//不行就走左
				return true;
			}else {//都不是表示走过走不通等于3返回 //用来解释回溯现象
				map[i][j]=3;
				return false;
			}
		}else {//都不是那么说明走不通返回false
			return false;
		}
		
	}
}
