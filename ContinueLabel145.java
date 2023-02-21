package test1;
public class ContinueLabel145{
	//编写一个main方法
	public static void main(String[]agrs) {
		label1:for (int i = 0; i <= 3; i++) {
			label2:for(int j = 0;j <= 2; j++) {
				//System.out.println(i);
				if(j== 1) {
				//System.out.println(j);
				continue label1;//输出是0000 因为j等于1的时候 将停止label1的执行这时候label1就不循环了就没有了
				}
				System.out.println(j);//这里要执行continue的终止
			}
			//System.out.println(i);//这里执行的是外层，不执行里面的循环输出0123
		}
	}
}