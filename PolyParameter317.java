/**
 * 
 */
package com.hspedu.poly_.polyparameter_;

/**
 * @author 日暮れて道遠し
 *
 */
public class PolyParameter317 {
	public static void main(String[] args) {
//		Empoyee317[] empoyee317s = new Empoyee317[4];
//		empoyee317s[0] = Jingli("小张	",2500);
		Empoyee317 empoyee317 = new Empoyee317("king", 4000);
		Putong putong = new Putong("小张", 2500);
		Manager manager = new Manager("老王", 15000,30000 );
		PolyParameter317 polyParameter317 = new PolyParameter317();
		polyParameter317.showEmpAnnual(putong);
		polyParameter317.showEmpAnnual(manager);
		polyParameter317.testWork(manager);
		polyParameter317.testWork(putong);
		System.out.println("=======");
		polyParameter317.showEmpAnnual(empoyee317);
		polyParameter317.testWork(empoyee317);
	}
	
	//实现获取任何员工对象的年工资,并在 main 方法中调用该方法 [e.getAnnual()]
	public void showEmpAnnual(Empoyee317 e) {
		System.out.println(e.getAnnual());//多态绑定机制
	}
	//添加一个方法，testWork,如果是普通员工，则调用 work 方法，如果是经理，则调用 manage 方法
	public void testWork(Empoyee317 e) {//这里需要传入一个参数 是Empoyee317 e 的子类或者自己
		if (e instanceof Putong) {
			Putong putong = (Putong)e;
			putong.work();
//			((Putong) e).work();
		}else if(e instanceof Manager){
			Manager manager = (Manager)e;
			manager.manage();
		}else {
			System.out.println("和自己比较");
		}
	}
}
