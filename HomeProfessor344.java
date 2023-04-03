/**
 * 
 */
package test8;

import com.hspedu.poly_.polyarr_.Teacher315;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeProfessor344 extends HomeTeacher344{
	//定义工资级别
	private double d ;


	public HomeProfessor344(String name, int age, String past, double salary, double d) {
		super(name, age, past, salary);
		this.d = d;
	}


	@Override
	//重写父类introduce方法
	public String introduce() {
		// TODO 自动生成的方法存根
		return super.introduce()+",工资级别"+d;
	}
}
