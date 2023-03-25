package test7;
import java.util.Scanner;
public class HomeWrok261 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Tom t1 = new Tom();
		//用来记录最后输赢的次数
		int isWinCount = 0;
		int[][]arr1 = new int [3][3];
		int j = 0;
		
		//创建一个一维数组用来接收输赢情况
		String[]arr2 = new String[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			//获取玩家出的拳
			System.out.println("请输入你要出的拳");
			int num = scanner.nextInt();
			t1.steTomGuessNum(num);
			int tomGuess = t1.getTomGuessNum();
			arr1[i][j+1] = tomGuess;
			
			//获取电脑出的拳
			int comGuess = t1.computernum();
			arr1[i][j+2] = comGuess;
			
			//将玩家猜的拳与电脑左比较
			String isWin = t1.vsComputer();
			arr2[i]=isWin;
			arr1[i][j] = t1.count;
			
			//对每一句的情况就行输出
			System.out.println("========");
			System.out.println("局数\t玩家出的拳\t电脑出的拳\t输赢情况");
			System.out.println(t1.count + "\t" +tomGuess+"\t\t"+comGuess +"\t\t");
			System.out.println("========");
			System.out.println("\n\n");
			isWinCount = t1.winCount(isWin);
		}
		//对游戏最终结果进行输出
		System.out.println("局数\t玩家出的拳\t电脑出的拳\t\t输赢情况");
		for (int a = 0; a < arr1.length; a++) {
			for (int b = 0; b < arr1[a].length; b++) {
				System.out.println(arr1[a][b]+"\t\t\t");
			}
			System.out.print(arr2[a]);
			System.out.println();
		}
		System.out.println("你赢了"+isWinCount + "次");
	}
}


//14．扩展题，学员自己做．
//有个人 Tom 设计他的成员变量．成员方法,可以电脑猜拳,电脑每次都会随机生成0,1,2
//0表示石头1表示剪刀2表示布并要可以显示 Tom 的输赢次数（清单） 0>1>2>0
class Tom{
	int tomGuessNum;//玩家出拳类型0.1.2
	int comGuessNum;//电脑出拳类型0.1.2
	int winGuessNum;//玩家赢的次数
	int count = 1;//比赛的次数 一共三次
//	public  Tom(int t1) {
//		this.t1 = t1;
//	}
	
	public int computernum() {
//		？Random r = new Random();
//		comGuessNum = r.nextInt(3); 
		int min = 0;
		int max = 2;
		int comGuessNum = (int) (Math.random() * (max - min + 1) + min);
		return comGuessNum;
		}
	public void steTomGuessNum(int tomGuessNum) {
		if(tomGuessNum >2 ||tomGuessNum<0) {
			throw new IllegalArgumentException("数字输入有误");
		}
		this.tomGuessNum = tomGuessNum;
	}
	
	
	public int getTomGuessNum() {
		return tomGuessNum;
	}
	
	
	//比赛猜拳的结果
	public String vsComputer() {
		//比较
		if(tomGuessNum == 0&&comGuessNum == 1) {
			return "你赢了";
		}else if(tomGuessNum == 1&&comGuessNum == 2) {
			return "你赢了";
		}else if(tomGuessNum == 2&&comGuessNum == 0) {
			return "你赢了";
		}else if(tomGuessNum == comGuessNum) {
			return "平手";
		}else {
			return "你输了";
		}
	}
	public int winCount(String s) {
		count++;//控制玩的次数
		if(s.equals("你赢了")){//统计赢的次数
			winGuessNum++;
		}
		return winGuessNum;
	}
	}