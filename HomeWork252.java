package test7;
public class HomeWork252 {
	//编写一个 main 方法
	public static void main(String[] args) {
		A02 a02 = new A02();
		
		String arr[] = {"jake","aisi","nisa"};
		int index = a02.find(arr, "23");
		if(index != -1) {
			System.out.println("找到相同名字在第"+index);
		}else if (index == -1) {
			 System.out.println("没找到");
		}
		    //int index = a02.find(arr, null);
		    //if(index != -1) {
//		if(a02.)
//		System.out.println("找到相同名字在第"+a02.find(arr,"包子"));
//		    }else {
//		    	System.out.println("你输入的值不能为{}或者null");
//		    }
	}
}
//编写类A02，定义方法 find ，实现查找某字符串是否在字符串数组中，并返回索引，如果找不到，返回﹣
class A02{
	 public int find(String[] arr, String target) {
	        /**
	         * 在字符串数组中查找目标字符串，并返回索引值
	         *
	         * @param arr    字符串数组
	         * @param target 目标字符串
	         * @return 目标字符串的索引值，如果找不到则返回 -1
	         */
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i].equals(target)) {
	                return i+1;
	            }
	        }
	       
	        return -1;
	    }
	
}
