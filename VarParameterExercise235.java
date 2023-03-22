package test7;
public class VarParameterExercise235 {
  //分析 1. 方法名 showScore 2. 形参(String ,double... ) 
  //3. 返回 String
    public static void main(String[] args) {
      HK h1 = new HK();
     System.out.println(h1.K("小万",60.0,65.0));
      System.out.println(h1.K("小张",45.0,40.0,25.0));
     System.out.println( h1.K("小王",77.0,73.0,60.0));
  
    }
}

class HK{
  /*
有三个方法，分别实现返回姓名和两门课成绩(总分)，
返回姓名和三门课成绩(总分)，返回姓名和五门课成绩（总分）。
封装成一个可变参数的方法
*/
  public String K(String name,double...nums){//可变参数只能放在最后，前面可以是其他的
    double sum =0;//保存和
    for(int i =0;i<nums.length;i++){//遍历可变参数的数组
      sum +=nums[i];//求和
      }
    return name +"有"+nums.length +"科，成绩总分为"+sum;
    }
}