/**
 * 
 */
package test8;

import java.util.Arrays;

/**
 * @author 日暮れて道遠し
 *
 */
	public class Import277 {
		public static void main(String[] args) {
			//使用系统提供Arrays完成数组排序
			int[]arr = {10,20,11,41,10};
			//对其进行排序
			//传统方法是自己排序【冒泡】
			//系统是提供了相关的类，可以方便完成 Arrays
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
}
		
}
