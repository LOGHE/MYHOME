package test6;
public class HomeWork187 {
    public static void main(String[] args) {
      int arr[]=new int[10];//定义未知数组
      int temp =0,sum=0,pingjun=0,index=-1,max=0,maxindex= 0;
      for(int i=0;i<arr.length;i++){//打印随机100内10个数
        arr[i] = (int)(Math.random()*100)+1;
        System.out.println("原来的数"+arr[i]);
      }
        for (int i = arr.length-1; i >=0; i--) {//10个值倒过来
        	if(max < arr[i]) {//求最大值和对应下标
        		max = arr[i];
        		maxindex = i;
        	}
        sum += arr[i];//求和
        pingjun = sum/arr.length;//求平均值
       if(arr[i] == 8){//
    	   System.out.println("随机数里面有8，对应下标为" +i);
    	   index = i;//一个编程思想/技巧, 一个经典的方法,这样不满足条件也会继续执行，不会退出。不然第一个不满足条件就退出了
       }
       System.out.println("倒过来后的十个值"+arr[i]);
        }
      if(index == -1){
    	  System.out.println("随机数里面没有生成8");
      }
      System.out.println("最大值为"+max+"对应下标为"+ maxindex);
      System.out.println("平均值="+pingjun);
    }
}
