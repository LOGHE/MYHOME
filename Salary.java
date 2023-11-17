/**
 * 
 */

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Salary {
	private String number;
	private String name;
	private int academic;
	private int exYear;
	private int overTime;
	private static int [] baseSalaryTable = {231000,212000,187000,165000};
	private static int baseoverTimePay = 1200;
	public Salary(String number, String name, int academic, int exYear, int overTime) {
		super();
		this.number = number;
		this.name = name;
		this.academic = academic;
		this.exYear = exYear;
		this.overTime = overTime;
	}
	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public int getAcademic() {
		return academic;
	}
	public int getExYear() {
		return exYear;
	}
	public int getOverTime() {
		return overTime;
	}
	
	
	
	public int getBaseSalary() {
		int num = 0;
		
		switch (academic) {
		case 0 :
			num = (int)(baseSalaryTable[0] + (int) Math.round(baseSalaryTable[0]  * 0.02 * exYear));
			break;
		case 1 :
			num = (int)(baseSalaryTable[1] + (int) Math.round(baseSalaryTable[1]  * 0.02 * exYear));
			break;
		case 2 :
			num = (int)(baseSalaryTable[2] + (int) Math.round(baseSalaryTable[2]  * 0.02 * exYear));
			break;
		case 3 :
			num = (int)(baseSalaryTable[3] + (int) Math.round(baseSalaryTable[3]  * 0.02 * exYear));
			break;
		
			default : 
		}
		return num;
	}
	public  int  getOverTimePay() {
		return (int) (overTime * baseoverTimePay);
	}
	
	public  void printPaytSlip() {
		System.out.println("Number : " + number);
		System.out.println("name : " + name);
		System.out.println("baseSalary : " + getBaseSalary());
		System.out.println("OverTimePay : " + getOverTimePay());
		System.out.println("OverTime : " + overTime + "H," + "BaseOverTimePay : ￥" + baseoverTimePay + ")");
		System.out.println("Total : " + (getBaseSalary() + getOverTimePay()));
	}
	
	public static int getBaseSalaryTable(int academic) {
		switch (academic) {
		case 0 :
			return Salary.baseSalaryTable[0];
		case 1 :
			return Salary.baseSalaryTable[1];
		case 2 :
			return Salary.baseSalaryTable[2];
		case 3 :
			return Salary.baseSalaryTable[3];
		default :
			return -1;
		}
	}
	
	public static void setBaseSalaryTable(int[] baseSalaryTable) {
		for (int i = 0; i < baseSalaryTable.length; i++) {
			Salary.baseSalaryTable[i] = baseSalaryTable[i];
		} 
	}
	public static void setBaseOvertimePay(int overTimePay) {
		Salary.baseoverTimePay = overTimePay;
	}
	public static int  getBaseOverTimePay() {
		return baseoverTimePay;
	}
	
}	
