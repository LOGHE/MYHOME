package test6;
public class YangHui181 {
    public static void main(String[] args) {
      //第一个数等于最后一个数arr[i][j] =1;
      //在第几行就有对应的几个数arr[i] =new int[i+1];
      //后一组第二个数以后等于前一组第一个数加第二个数以此类推。  arr [i][j] =  arr[i-1][j] +arr[i-1][j-1];
      int arr[][] = new int[15][];
      for(int i = 0;i < arr.length;i++){
        arr[i] =new int[i+1];
      for(int j = 0;j < arr[i].length;j++){
        //arr [i][j] = i+1;
        if(j ==0||j  == arr[i].length-1){
          arr[i][j] =1;
         }else{
        arr [i][j] =  arr[i-1][j] +arr[i-1][j-1];
         }
        //下面是自己做的另外一种方法
//        arr[i][0] =1;
//        arr[i][i] =1;
//        if(j > 0 && j <arr[i].length-1){
//           arr[i][j]=arr[i-1][j] +arr[i-1][j-1];
//        }
        }
        }
      for(int i =0;i< arr.length;i++){
        for(int j = 0; j<arr[i].length;j++){
          System.out.print(arr[i][j]+" ");
          }
        System.out.println();
        }
    }
}
