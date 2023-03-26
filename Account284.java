/**
 * 
 */
package com.hspedu.encap;

/**
 * @author 日暮れて道遠し
 *
 */


/**
* 创建程序,在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性。
* Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
* 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
* 通过 setXxx 的方法给 Account 的属性赋值。
* 在 AccountTest 中测试
**/

 public class Account284{
	//创建属性 姓名 余额 密码
     private String name;
	private double balance;
	private String pasuwaado ;
	/**
	 * @param name
	 * @param balance
	 * @param pasuwaado
	 */
	//生成2个构造器
	/**
	 * 
	 */
	public Account284() {
		// TODO 自动生成的构造函数存根
	}
	public Account284(String name, double balance, String pasuwaado) {
		//把set方法的形参传给构造器
		
		setName(name);//this
		setPasuwaado(pasuwaado);//this
		setbalance(balance);//this
	}
	/**
	 * @param balance2
	 */
	private void setZandaka(double balance2) {
		// TODO 自动生成的方法存根
		
	}
	/**
	 * @return name
	 */
	//生成set和get方法
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		//限定名字长度
		if (name.length()>=2&&name.length()<=4) {
		this.name = name;
		}else {
			System.out.println("你输入的名字有误，系统自动改为无名氏");
			this.name="无名氏";
		}
	}
	/**
	 * @return zandaka
	 */
	public double getbalance() {
		return balance;
	}
	/**
	 * @param balance 要设置的 zandaka
	 */
	public void setbalance(double balance) {
		//设定余额权限必须大于20
		if (balance>20) {
		this.balance = balance;
		}else {
			System.out.println("您的余额不足20,系统默认为0");
		}
	}
	/**
	 * @return pasuwaado
	 */
	public String getPasuwaado() {
		return pasuwaado;
	}
	/**
	 * @param pasuwaado 要设置的 pasuwaado
	 */
	public void setPasuwaado(String pasuwaado) {
		//限定密码为六位数
		if (pasuwaado.length()>=6) {
		this.pasuwaado = pasuwaado;
		}else{
		System.out.println("请输入六位数的密码,系统默认为100000");	
			this.pasuwaado = "100000";
		}
	}
	public String info() {
		return "name="+name+" 余额="+ balance + " 密码为"+pasuwaado;
	}
	
}