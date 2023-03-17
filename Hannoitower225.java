package test7;
public class Hannoitower225 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Tower tower = new Tower();
		tower.move(3,'A','B','C');
		
		
	}
}

class Tower{
	//思路
	//1 num表示圆盘 cahr表示三根塔a b c 
	public void move(int num,char a,char b,char c) {
		//如果只有一个盘 num=1
		if(num == 1) {
			System.out.println(a +"=>"+c);
		}else {
			//如果有多个盘可以看作两个整体，最下面的和上面的所有盘
			//先移动上面所有的盘到b借助c
			move(num-1, a, c,b);
			//把最下面的盘移动到c
			System.out.println(a+"->"+ c);
			//把b塔的所有盘移动到c借助a
			move(num-1, b, a, c);
			
			
		}
		
		
	}
}