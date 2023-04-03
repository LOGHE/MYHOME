/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeFuProfessor344 extends HomeTeacher344 {
	

	/**
	 * @param name
	 * @param age
	 * @param past
	 * @param salary
	 */
	private double d2;
	
	public HomeFuProfessor344(String name, int age, String past, double salary, double d2) {
		super(name, age, past, salary);
		this.d2 = d2;
	}

	@Override
	public String introduce() {
		// TODO 自动生成的方法存根
		return super.introduce()+",工资级别"+d2;
	}
}
