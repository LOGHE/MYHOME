/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeEmployee345 {
//	(3)员工属性：姓名，单日工资，工作天数
//	(4）员工方法（打印工资）
	private String name;
	private double dailywages;
	private int day;
	private double grade;
	private int n1 = 99;
	
	public HomeEmployee345(String name, double dailywages, int day, double grade) {
		super();
		this.name = name;
		this.dailywages = dailywages;
		this.day = day;
		this.grade = grade;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getDailywages() {
		return dailywages;
	}


	public void setDailywages(double dailywages) {
		this.dailywages = dailywages;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	//计算工资的方法
	public void salary() {
		System.out.println("员工" + getName()+"的工资合计为" + dailywages*day*grade);
	}
}
