package test6;
public class HomeWork186 {
    public static void main(String[] args) {
      //一个数组{10，12，45，90}添加23之后还是升序
    	//先扩容
    	//再赋值，
    	//再比较排序
      int arr []={10,12,45,90};
      int k = 23;
      int tmpe = 0;
      int arr2[] = new int[arr.length+1]; 
      for(int j=0;j < arr.length ;j++){//扩容赋值
    	arr2 [arr2.length-1] =k;
        arr2 [j] =arr[j];
        }
      arr = arr2;//完成转换
      //接下来循环比较转换值并排序
      for (int i = 0; i < arr.length-1; i++) {//外层有四轮循环比较所以是arr.length-1
      for (int j = 0; j < arr.length-i-1; j++) {//这里为什么是arr.length-i-1,因为第一轮为4次二轮3次以此类推
    	  if(arr[j] > arr[j+1]) {
          	tmpe = arr[j];
          	arr[j] = arr[j+1];
          	arr[j+1] = tmpe;
          }
	}
      }
      for(int j =0;j<arr.length;j++){
        System.out.println(arr[j]);
        }
      System.out.print("数组arr长度=" + arr.length);
    }
}