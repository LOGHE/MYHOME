/**
 * 
 */
package kadai10;

import java.util.Scanner;



/**
 * @author 23jn0245 罗寿合(ラ　ジュゴウ)
 *
 */
public class Banmen {
	 private int [] board = {0,0,0,0,0,0,0,0,0,0};
	 public void showBoard() {
		for ( int i = 0; i < board.length; i++) {
		System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < board.length; i++) {
		switch (board[i]) {
		case 0 :
		System.out.print(".  ");
		break;
		case 1 :
		System.out.print("●　");
		break;
		case 2 :
		System.out.print("○　");
		break;
		}
		}
		System.out.println();
}
	
	public  void play() {
		Scanner sc = new Scanner(System.in);
		int i = 0,num = 0;
		showBoard();
		for ( i = 0; i < board.length; i++) {
		System.out.println();
		
		//黑棋先下 i为偶数
		if (i % 2 == 0) {
		System.out.println("●の手番ですーー＞");
		num = sc.nextInt();
		board[num] = 1;
		//找出最左和最右边的黑棋
		if (i != 0) {
		play1(i, num);
		}
		showBoard();
		System.out.println("○の手番ですーー＞");
		}	
		
		//白棋第二步 i为奇数
		if (i % 2 == 1 ) {
			num = sc.nextInt();
			board[num] = 2;
			if (i != 1) {
				play1(i, num);
			}
		showBoard();
		}
		}
		syoubu();
}
	
	public void play1(int i,int num) {
		//找出最左和最右边的棋 下标
		int num2= 0;//棋间距
		int migi = 0;//右边
		int hidari = 0;//左边
		int index = 0;//找不到时的下标
		int tepy1 = 0;//记录找了几次
		int tepy2 = 0;//同上
		for (int j = num; j > 0; j--) {//最左边
			if (board[j - 1] == (i % 2) + 1) {
				hidari = j -1;
				break;
			}
			tepy1 ++;
		}
		if (tepy1 == num) {//中间间距相等的时候说明他遍历完了没找到让他等于num
			hidari = num;
		}
		
		for (int j = num; j < 9; j++) {//最右边
			if (board[j +1] == (i % 2) + 1) {
				migi = j +1;
				break;
			}
				tepy2 ++;
		}
		if (tepy2 == 9-num) {//中间间距相等的时候说明他遍历完了没找到让他等于num
			migi = num;
		}
				
		num2 = migi - hidari;//两棋的 间距
		for (int j = 1; j < num2; j++) {
			if (board[hidari + j] == 0 ) {//查找里面是否含有 0 有就返回-1 不改变里面的值 没有则改变
				index = -1;
				break;
			}
		}
		if (index != -1) {//上面区间不含0 那么改变被夹白棋的值
			for (int j = 1; j < num2; j++) {
				board[hidari + j] = (i % 2) + 1;
			}
		}
}
	
	public  void syoubu() {
		int black = 0;//黑棋总数
		int white = 0;//白棋总数
		for (int i = 0; i < board.length; i++) {//遍历统计
			if (i == 1 ) {
				black ++;
			}else {
				white ++;
			}
		}
		//判断胜负
		if (black > white) {
			System.out.println("黒の勝利です！");
		} if (black == white) {
			System.out.println("引き分け");
		}else {
			System.out.println("白の勝利です！");
		}
	}

}