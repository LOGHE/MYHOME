package test7;
public class OverLoadWxercise231 {
    public static void main(String[] args) {
//    	java 中允许同一个类中，多个同名方法的存在，但要求 形参列表不一致
      Methods m1=new Methods();
        System.out.println(m1.m(3));
      System.out.println(m1.m(2,4));
      System.out.println(m1.m("多灾大难华夏大地"));
    }
}

class Methods{
  public int m(int n1){
    int sum =0;
    sum=n1*n1;
    return sum;
    }
  public int m(int n1,int n2){
    int sum =0;
    sum =n1*n2;
    
    return sum;
    }
  public String m(String name){
    return name;
    
    }
  }