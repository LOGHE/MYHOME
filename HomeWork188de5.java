package test6;
public class HomeWork188de5 {
    public static void main(String[] args) {
//    	char[] arr1 = {'a','z','b','c'};
//    	char[]arr2=arr1;
//    	arr2[2] = '韩';
//    	for (int k = 0; k < arr2.length; k++) {
//			System.out.println(arr1[k]+","+arr2[k]);
//		}
    	
    	
    	//下面是冒泡排序法
    	int []arr = {2,45,25,36,23,15};
    	int temp = 0;
    	for (int i = 0; i < arr.length-1; i++) {
    	for (int j = 0; j < arr.length-1-i; j++) {
    		if(arr[j]>arr[j+1]) {
			temp = arr[j];
			arr[j] =arr[j+1];
			arr[j+1] = temp;
      	  }
    	}
    	}
    	for (int j = arr.length-1; j >=0; j--) {//arr.length-1不能忘啊我求求你了
			System.out.println(arr[j]);
		}
    }
}