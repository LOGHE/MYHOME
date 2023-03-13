package test7;
public class Mathod204 {
	//编写一个 main 方法
	//二维数组的类引用
	public static void main(String[] args) {
		int map [][] = {{0,0,9},{1,1,2},{2,3,32,2}};
		AB a = new AB();
		a.so(map);
	}
}

class AB{
	public void so(int [][]map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
		}
	}
}