/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeJiangshi344 extends HomeTeacher344 {
	
	public HomeJiangshi344(String name, int age, String past, double salary, double d3) {
		super(name, age, past, salary);
		this.d3 = d3;
	}
	private double d3 ;
	@Override
	public String introduce() {
		// TODO 自动生成的方法存根
		return super.introduce()+ ",工资级别"+d3;
	}
}
