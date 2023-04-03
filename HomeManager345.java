/**
 * 
 */
package test8;
import com.hspedu.poly_.polyparameter_.Empoyee317;
import com.hspedu.super_.Super297;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeManager345 extends HomeEmployee345 {

	private int bonus;
	
	
	public HomeManager345(String name, double dailywages, int day, double grade, int bonus) {
		super(name, dailywages, day, grade);
		this.bonus = bonus;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}


	//重写经理的工资
	@Override
	public void salary() {
		// TODO 自动生成的方法存根
		System.out.println("经理"+getName()+"工资是=" +( bonus + getDailywages()*getDay()*getGrade()));
	}
}
