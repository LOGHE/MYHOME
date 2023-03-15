package test7;
public class Method219 {
    public static void main(String[] args) {
      DD d1 =new DD();
      int n =1;
      int res=d1.test(n);
      if(n!=-1){//这里接收返回值
        System.out.println("当输入"+n +"对应斐波那契数为"+res);
        }
    }
}

class DD{
	/*
	请使用递归的方式求出斐波那契数 1,1,2,3,5,8,13...给你一个整数 n，求出它的值是多
	思路分析
	1. 当 n = 1 斐波那契数 是 1
	2. 当 n = 2 斐波那契数 是 1
	3. 当 n >= 3 斐波那契数 是前两个数的和
	4. 这里就是一个递归的思路
	*/
  public int test(int n){
    if(n>=1){
    if(n==1|| n ==2){
      return 1;//需要返回值
        }else{
      return test(n-1)+test(n-2);//返回值
      }
      }else{
      System.out.println("你输入的数字有误");
      return -1;//这里返回值不能丢，上面还得接收一下。
      }
    }
}
