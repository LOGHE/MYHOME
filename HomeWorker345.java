
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWorker345 extends HomeEmployee345 {

	/**
	 * @param name
	 * @param dailywages
	 * @param day
	 * @param grade
	 */
	public HomeWorker345(String name, double dailywages, int day, double grade) {
		super(name, dailywages, day, grade);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void salary() {
		// TODO 自动生成的方法存根
		System.out.println("员工" + getName()+"的工资合计为=" + getDailywages()*getDay()*getGrade());
	}
	
}
