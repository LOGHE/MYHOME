package test;
public class WhileExercise128{
	//编写一个main方法
	public static void main(String[]agrs) {
		//先化繁为简
		//先打印出1-100的数
		//2先死后活
		int i = 1;
		int num =100;
		while(i<=num) {
			if(i%3==0) {
			System.out.println("能被3整除的数为"+i);
			
			}
			i++;
		}
		//先打印出40到200的值
				//再进行偶数打印偶数是能被2整除的数
				int j = 40;
				while(j<=200) {
					if(j % 2 == 0) {
					System.out.println("40-200之间的偶数为" + j);
					}
					j++;
		}
	}
}