/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeTeacher344 {
	private String name;
	private int age;
	private String past;
	private double salary;
	public HomeTeacher344(String name, int age, String past, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.past = past;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPast() {
		return past;
	}
	public void setPast(String past) {
		this.past = past;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String  introduce() {
		return "name=" + name + ",age=" + age + ",post=" + past + ",salary=" + salary;
	}
	
}
