/**
 * 
 */
package com.hspedu.poly_.polyarr_;

/**
 * @author 日暮れて道遠し
 *
 */
public class PloyArray315 {
	public static void main(String[] args) {
		//应用实例:现有一个继承结构如下：要求创建 1 个 Person 对象、
		// 2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组中，并调用每个对象 sa方法
		Person315[] person315s = new Person315[5];
		person315s[0] = new Person315("上野", 25);
		person315s[1] = new Student315("中村", 26,100);
		person315s[2] = new Student315("大田", 27,30.1);
		person315s[3] = new Teacher315("下山", 26,20000);
		person315s[4] = new Teacher315("上山", 27,25000);
		
		//遍历多态数组，调用say
		for (int i = 0; i < person315s.length; i++) {
			//提示 person315s[i]编译类型是Person 运行类型是根据实际情况由jvm机来判断
			System.out.println( person315s[i].say());//动态绑定机制
			
			//调用子类的特有方法
			if (person315s[i] instanceof Student315) {//判断person315s【i】的运行类型是不是Studengt
				Student315 student315 = (Student315)person315s[i];//向下转型
				student315.student();//调用子类特有方法
				//上面语句也可以用 ((Student315)persons[i]).student();
			}else if (person315s[i] instanceof Teacher315) {
				Teacher315 teacher315 = (Teacher315)person315s[i];
				teacher315.teacher();
			}else if (person315s[i] instanceof Person315) {
				
			}else{
				System.out.println("你的类型有误请自行检擦");
			}
		}
		
	}
}
