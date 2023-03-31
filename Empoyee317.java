/**
 * 
 */
package com.hspedu.poly_.polyparameter_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Empoyee317 {
	private String name;
	private double salary;
	
	/**
	 * @return name
	 */
	public Empoyee317(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return salary
	 */
	public double getSalary() {
		return salary;
		/**
		 * @param name
		 * @param salary
		 */
	}

	/**
	 * @param salary 要设置的 salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnnual() {
		return salary*12;
	}
}
