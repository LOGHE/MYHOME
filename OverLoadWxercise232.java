package test7;
public class OverLoadWxercise232 {
    public static void main(String[] args) {
      MM m1 = new MM();
        System.out.println("第一组最大值="+m1.max(34,25));
      System.out.println("第二组最大值="+m1.max(28.5,21.3));
      System.out.println("第三组最大值="+m1.max(25.7,44.8,33.4));
    }
}

class MM{
  public int max(int n1,int n2){
    if(n1>n2){
      return n1;
      }else{
      return n2;
      }
    }
  public double max(double n1,double n2){
    if(n1>n2){
      return n1;
      }else{
      return n2;
      }
    }
  public double max(double n1,double n2,double n3){
    /*if(n1>n2&&n1>n3){
        return n1;
        }else if(n2>n3){
      return n2;
      }else {
      return n3;
      }*/
    //用三元运算符解决 
    double max = n1 > n2 ? n1:n2;//如果满足n1>n2  n1复制给max 否则赋值给n2
    return max>n3 ? max:n3;//如果满足max>n3 返回max否则返回n3 如此一来就满足了最大值比较输出
    }
}