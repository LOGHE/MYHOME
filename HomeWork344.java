/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWork344 {
	public static void main(String[] args) {
//		3．编写老师类Homework03.java
//		(1）要求有属性"姓名 name ","年龄 age ","职称 post ","基本工资 salary "
//				(2)编写业务方法， introduce ()，实现输出一个教师的信息。
//		(3)编写教师类的三个子类：教授类（ Professor )、副教授类、讲师类。
//		工资级别分别为：教授为1.3、副教授为1.2、讲师类1.1。在三个子类里面都重写父类的 introduce (）方法。
		//思路分析 创建老师父类 3个子类 都有自己的独特属性 级别 然后重写 introduce方法
		//因为是重写方法用不到向下转型
		HomeTeacher344 t1 = new HomeFuProfessor344("老王", 40, "副教授", 5000,1.2);
		HomeTeacher344 t2 = new HomeProfessor344("log", 45, "教授", 8000,1.3);
		HomeTeacher344 t3 = new HomeJiangshi344("pu", 25, "讲师", 3000,1.1);
		System.out.println( t1.introduce());
		System.out.println( t2.introduce());
		System.out.println( t3.introduce());
	}
}
