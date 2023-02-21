package test1;
public class BreakLabelExercise{
	//编写一个main方法
	public static void main(String[]agrs) {
		int j = 0;
		label1:while( j <=3) {
			label2:for(int i = 0; i <= 2; i++) {
				System.out.println(i);
				if(i == 1) {
					break label2;
				}
			}
			System.out.println(j);
			j++;
			if(j == 2) {
     				break label1;
			}
		//System.out.println(j);
		}
	}
	}
	//}