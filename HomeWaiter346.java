/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWaiter346 extends HomeEmployee346 {

	/**
	 * @param salary
	 * @param year
	 */
	public HomeWaiter346(double salary ) {
		super(salary);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void annualsalary() {
		// TODO 自动生成的方法存根
		System.out.println("服务员的年工资="+(getSalary()*getSalMonth()));
	}
}
