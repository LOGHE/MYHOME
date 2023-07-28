/**
 * 
 */
package kadai14;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Othello {
		private static  int [] board = {0,0,0,0,0,0,0,0,0,0};
		public static void main(String[] args) {
		play();
		syoubu();
}
public static void syoubu() {
	int black = 0;//数黑棋
	int white = 0;//白棋
	for (int i = 0; i < board.length; i++) {//遍历统计
		if (i == 1 ) {
			black ++;
		}else {
			white ++;
		}
	}
	//判断胜负
	if (black > white) {
		System.out.println("黑棋胜利");
	} if (black == white) {
		System.out.println("平局");
	}else {
		System.out.println("白棋胜利");
	}
}
	public static void showBoard() {
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
		System.out.print("●");
		break;
		case 2 :
		System.out.print("○");
		break;
		}
		}
		System.out.println();
}
	public static void play() {
		Scanner sc = new Scanner(System.in);
		int i = 0,num = 0;
		int num3 = 0;//黑棋间距
		int num4 = 0;//白棋间距
		int migi = 0;//右边
		int hidari = 0;//左边
		showBoard();
		for ( i = 0; i < board.length; i++) {
		System.out.println();
		
		//黑棋先下i为偶数
		if (i % 2 == 0) {
		System.out.println("●の手番ですーー＞");
		num = sc.nextInt();
			
		board[num] = 1;
		//找出最左和最右边的黑棋
		if (i != 0) {
			int index = 0;
			int tepy1 = 0;
			int tepy2 = 0;
				for (int j = num; j > 0; j--) {//最左边
					if (board[j - 1] == 1) {
						hidari = j -1;
						break;
					}
					tepy1 ++;
				}
				if (tepy1 == num) {
					hidari = num;
				}
				
				for (int j = num; j < 9; j++) {//最右边
					if (board[j +1] == 1) {
						migi = j +1;
						break;
					}
						tepy2 ++;
				}
				System.out.println("tepy2=" + tepy2);
				//中间间距相等的时候说明他遍历完了没找到让他等于num
				if (tepy2 == 9-num) {
					migi = num;
				}
		
		num3 = migi - hidari;//两黑棋间的距离
		System.out.println("间距=" + num3);
		for (int j = 1; j < num3; j++) {
			if (board[hidari + j] == 0 ) {//查找里面是否含有 0 有就返回-1 不改变里面的值 没有则改变
				index = -1;
				break;
			}
		}
		if (index != -1) {//上面区间不含0 那么改变被夹白棋的值
			for (int j = 1; j < num3; j++) {
				board[hidari + j] = 1;
			}
		}
		}
		showBoard();
		System.out.println("●左="+hidari +" 右="+ migi);
		System.out.println("○の手番ですーー＞");
		}	
		
		
		
		//白棋第二步i 为奇数
		if (i % 2 == 1 ) {
			num = sc.nextInt();
			board[num] = 2;
		if (i != 1) {
				//查找白棋的左右
			int index = 0;
			int tepy1 = 0;
			int tepy2 = 0;
				for (int j = num; j > 0; j--) {//最左边
					if (board[j - 1] == 2) {
						hidari = j -1;
						break;
					}
					tepy1 ++;
				}
				if (tepy1 == num) {
					hidari = num;
				}
				
				for (int j = num; j < 9; j++) {//最右边
					if (board[j +1] == 2) {
						migi = j +1;
						break;
					}
						tepy2 ++;
				}
				System.out.println("tepy2=" + tepy2);
				//中间间距相等的时候说明他遍历完了没找到让他等于num
				if (tepy2 == 9-num) {
					migi = num;
				}
		
		num4 = migi - hidari;//两白棋间的距离
		System.out.println("间距=" + num3);
		for (int j = 1; j < num4; j++) {
			if (board[hidari + j] == 0 ) {//查找里面是否含有 0 有就返回-1 不改变里面的值 没有则改变
				index = -1;
				break;
			}
		}
		if (index != -1) {
			for (int j = 1; j < num4; j++) {
				board[hidari + j] = 2;
			}
		}
			}
		showBoard();
		System.out.println("⭕"+ " "+ num);
		}
		}
	}
}

