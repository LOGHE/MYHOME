/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWork346 {
	public static void main(String[] args) {
//5．设计父类一员工类。子类：工人类（ Worker )，农民类（ Peasant )，
//教师类（ Teacher )，科学家类( Scientist )，服务生类（ Waiter )。
//	(1）其中工人，农民，服务生只有基本工资 sal (2）教师除基本工资外，还有课酬（元／天） classDay , classSal 
//	(3）科学家除基本工资外，还有年终奖 bonus 
//	(4)编写一个测试类，将各种类型的员工的全年工资打印出来
		HomeWorker346 worker = new HomeWorker346(8000);
		worker.setSalMonth(15);//灵活修改带薪月份
		HomePeasant346 peasant = new HomePeasant346(1500);
		peasant.setSalMonth(13);
		HomeWaiter346 waiter = new HomeWaiter346(5000);
		HomeTeacher346 teacher = new HomeTeacher346(3000);
		teacher.setDays(1000);//修改一年总课数
		teacher.setRemuneration(20);//修改课时费
		HomeScientist346 scientist = new HomeScientist346(50000);
		scientist.setBonus(500000);
		worker.annualsalary();
		waiter.annualsalary();
		peasant.annualsalary();
		teacher.annualsalary();
		scientist.annualsalary();
		
		//创建5个对象
//		HomeEmployee346 e1 = new HomeWorker346(8000);
//		HomeEmployee346 e2 = new HomeWaiter346(5000);
//		HomeEmployee346 e3 = new HomePeasant346(1500);
//		HomeEmployee346 e4 = new HomeTeacher346(3000, 50, 150);
//		HomeEmployee346 e5 = new HomeScientist346(50000, 100000);
//		e1.annualsalary();
//		e2.annualsalary();
//		e3.annualsalary();
//		e4.annualsalary();
//		e5.annualsalary();
//	
	}
}
