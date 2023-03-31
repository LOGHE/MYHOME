/**
 * 
 */
package com.hspedu.poly_.polyparameter_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Putong extends Empoyee317 {

	/**
	 * @param name
	 * @param salary
	 */
	public Putong(String name, double salary) {
		super(name, salary);
		// TODO 自动生成的构造函数存根
	}
		//重写父类年工资
		@Override
		public double getAnnual() {//因为普通员工没有其他的收入 直接调用父类的方法
			// TODO 自动生成的方法存根
			//super.getAnnual();
			return  super.getAnnual();
		}
		//员工特有方法
		public void work() {
			System.out.println("普通员工 "+super.getName() +"每天工作12小时");
		}
}
