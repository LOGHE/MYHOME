package test6;
public class HomeWork186test {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int index = -1;
        int k = 23;
        for (int i = 0; i < arr.length; i++) {
			if(k <=arr[i]) {
				index = i;
				break;
			}
			}
        if(index == -1){//防止为边界时找不到下标
        	index = arr.length;
		}
        int[] newarr = new int[arr.length+1];
        /* int[] arr = {10, 12, 45, 90};
         * 下面的j对应上面的10 12 45 90
         */
        for (int i = 0,j = 0; i < newarr.length; i++) {
			if(i != index) {
				newarr[i] = arr[j];
				j++;//这里不能少，少了输出就是10，10，23，10，10.不会自增。j代表下标。
			}else  {
			newarr[i] = k;
			}
		}
        arr = newarr;
        for (int i = 0; i < newarr.length; i++) {
			System.out.println(arr[i]);
		}
      //  System.out.println(index);
    }
}