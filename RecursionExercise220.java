package test7;
public class RecursionExercise220 {
    public static void main(String[] args) {
        M m1=new M();
        int n = 1;
        int res = m1.hou(n);
        if(res!=-1) {//看不懂看上一集219
        System.out.println("第"+n+"天有"+res+"个桃");
        }
    }
}

class M{
  public int hou(int n){
    /*猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
    以后每天猴子都吃其中的一半，然后再多吃一个。
    当到第 10 天时，想再吃时（即还没吃），发现只有 1 个桃子了。
    问题：最初共多少个桃子？*/
    //思路：天数为n 桃子和天数的关系 
    //第1天1534。
    //第7天x/2-1 =10  x=22   22 = 10*2+2
    //第8天总数为 x/2-1=4 x=10
    //第9天总数为 x/2-1=1 x=4
    //第10天剩 1个
	  //规律就是n等于前一天的总和乘以2+2 n= （n+1）*2+2 n是第几天
    //x*2+2
    //
 
   
    if(n==10){//这里 是突破点不能少 有了这个做铺垫下面运算才能开始 ***这里相当于是告诉计算机第十天有一颗桃
      return 1;
      }else  if(1<=n&&n<=9) {//hou(2)是整体的桃总数，2表示里面的天数
    	  return hou(n+1)*2+2;//规律要求的那天的桃子数等于后一天的桃子数*2+1  n+1表示后一天
    	  //韩老师的为return (hou(n+1)+1)*2  结果为 这个(hou(n+1)+1)表示后一天的桃子总数：hou(n+1) 再多+1 再*2
      }else {
    	  System.out.println("请输入1-10");
    	  return -1;
      }
	
    }
  }