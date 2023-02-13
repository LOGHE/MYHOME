package test1;
import java.util.Scanner;
public class MulForExercise134{
	//编写一个main方法
	public static void main (String[]args){
			//(1）统计 3 个班成绩情况，每个班有 5 名同学，
			//求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
		//先化繁为简
		//先统计一个班的情况，五个学生。使用for
		//因为涉及到接收采用Scanner对象    
		//再在外层镶嵌一个for循环加入2.3班 i=1;i<=3；i++
		
		
		//2) 统计三个班及格人数，每个班有 5 名同学。及格分数为60分。有多少人及格
		//进行筛选看及格分数60
		Scanner  myScanner  = new Scanner(System.in);
		double totalScore = 0;//累计所有学生的成绩
		int passNum = 0;//合格人数
		int classnum = 3;//3个班
		int sudnum = 5;//每个班5个人
		for(int i = 1; i <=classnum;i++) {//i为班级
		double sum = 0;//sum放循环里面统计每个班的总成绩
		for(int j= 1;j<=sudnum;j++ ) {//
			System.out.println("请输入第" + i + "个班的第" + j + "个学生的成绩");
			double score = myScanner.nextDouble();
			System.out.println("成绩为" + score);
			sum += score;//一个班的总成绩，也是输入一个就累增
			totalScore +=sum;//总成绩，循环一次就自增一次
			if(score>=60&&score<=100) {
				passNum ++;//满足合格条件就加1，表示合格人数
			}
		}
		System.out.println(i +"班的总成绩为" + sum  +"平均分为" + (sum/sudnum));
		System.out.println("及格人数为" + passNum);
		System.out.println("全部总分数为" + totalScore + "总学生的平均分" +  (totalScore/classnum*sudnum));
		
	}
	}
	}