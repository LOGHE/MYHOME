/**
 * 
 */
package com.hspedu.abstract_;

/**
 * @author 日暮れて道遠し
 *
 */
public class AbstractExercise400 {
	public static void main(String[] args) {
		new Manager("老王", "0800", 100000, 50000).work();
		new CommonEmployee("小赵", "0123", 20000).work();
//		manager.work();
//		commonEmployee.work();
	}
}

abstract class Employee{
	private String name;
	private String id;//编号
	private double salary;//工资
	//抽象方法
	abstract public void work();
	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

class Manager extends Employee{
	private double bonus;//特有属性奖金
	public Manager(String name, String id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	@Override
	public void work() {//重写父类抽象类的方法 具体化
		// TODO 自动生成的方法存根
		System.out.println("经理"+getName()+"编号"+getId()+"年工资是"+(getSalary()+getBonus()));
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}

class CommonEmployee extends Employee{

	/**
	 * @param name
	 * @param id
	 * @param salary
	 */
	public CommonEmployee(String name, String id, double salary) {
		super(name, id, salary);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void work() {//重写父类抽象类的方法 具体化
		// TODO 自动生成的方法存根
		System.out.println("普通员工"+getName()+"编号"+getId()+"年工资是"+getSalary());
	}
	
}