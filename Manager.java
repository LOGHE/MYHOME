/**
 * 
 */
package com.hspedu.poly_.polyparameter_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Manager extends Empoyee317 {
		private double bonus;
	/**
	 * @param name
	 * @param salary
	 */
	
	/**
	 * @param name
	 * @param salary
	 * @param bonus
	 */
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	//重写父类年工资
	@Override
	public double getAnnual() {
	// TODO 自动生成的方法存根
	return super.getAnnual() +bonus;
	}
	
	/**
	 * @return bonus
	 */
	public double getBonus() {
		return bonus;
	}
	/**
	 * @param bonus 要设置的 bonus
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//特有方法 管理
	public void manage() {
		System.out.println("经理"+getName()+ "把员工当牲口每天工作12小时");
	}
	
}
