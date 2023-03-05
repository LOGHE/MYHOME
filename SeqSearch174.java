package test6;
import java.util.Scanner;
public class SeqSearch174{
	//编写一个main方法
	public static void main(String[]agrs) {
//		有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：从键盘中任意输入一个名称，
//		判断数列中是否包含此名称【顺序查找】 要求: 如果找到了，就提示找到，并给出下标值
       String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
       Scanner myScanner = new Scanner(System.in);
       System.out.println("请输入名字");
       String findName = myScanner.next();
       int index = -1;//一个编程思想/技巧, 一个经典的方法int index = -1
       for (int i = 0; i < names.length; i++) {
		if(findName.equals(names[i])) {//比较 字符串比较 equals, 如果要找到名字就是当前元
			System.out.println("恭喜你找到了"+findName+ "/n" +"对应下标为" + i);
			index = i;//找到了就把i赋值给index输出
			break;
		}
		}
       if(index == -1){//找不到就输出-1；没有找到
    	   System.out.println("没有找到" + findName);
	}
	}
}
