/*変数を使うプログラム
 */
public class MyVar5{
	//メイン
  public static void main(String[]agrs){
//	  文字例型の変数と代入
	  String name = "山田太郎";
	  //浮動小数点型の実数と代入
	  int sansu = 70;
	  int kokugo = 75;
	  int goukei;
	  double heikin;
	  //合計の計算
	  goukei = sansu;
	  goukei = goukei + kokugo;
	  //平均値の計算
	  heikin = goukei / 2.0;
	  System.out.println(name + heikin);
  }
  
}