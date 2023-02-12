package test1;
import java.util.Scanner;
public class DoWhileExersice132{
	//编写一个main方法
	public static void main(String[]agrs) {
		//采用canner方法
		//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
		//无限循环问还钱吗
		//先写Scannermy...= new San.....的宣言，再定义char，再写循环，
//		循环里面先输出问题，再把myScanner赋值给answer这样做的目的是接收别人的回答
		//最后再输出关于别人的回答的对于语句“他的回答是”+answer
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';//这里是空格
		do {
			System.out.println("罗哥使出五连鞭");
			System.out.println("罗哥问还钱吗？y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		}while(answer != 'y');
		System.out.println("老赖还钱了");
		
		
		/*Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
		System.out.println("老韩使出五连鞭~");
		System.out.println("老韩问：还钱吗？y/n");
		answer = myScanner.next().charAt(0);
		System.out.println("他的回答是" + answer);
		}while(answer != 'y');//判断条件很关键
		System.out.println("李三还钱了");*/
	}
	}