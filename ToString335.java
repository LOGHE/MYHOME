/**
 * 
 */
package com.hspedu.Object_;

/**
 * @author 日暮れて道遠し
 *
 */
	/*
	 * 基本介绍 默认返回：全类名+@+哈希值的十六进制，【查看 Object 的 toString 方法】 子类往往重写
	 * toString方法，用于返回对象的属性信息 2) 重写 toString 方法，打印对象或拼接对象时，
	 * 都会自动调用该对象的 toString 形式
	 * 当直接输出一个对象时，toString 方法会被默认的调用, 比如 System.out.println(monster)；
	 *  就会默认调用monster.toString()
	 */
public class ToString335 {
	public static void main(String[] args) {
		/*
		 * tostring 原码
		 * getClass().getName() 类的全类名 （包命名
		 * public String toString() { 
		 * return getClass().getName() + "@" + Integer.toHexString(hashCode()); }
		 */
		Momster235 momster235 = new Momster235("犬夜叉","四魂之玉",000);
		System.out.println(momster235.toString()+"   hashcode="+momster235.hashCode());
		System.out.println(momster235);//当直接输出一个对象时，toString 方法会被默认的调用
	}
}


class Momster235{
	private String name;
	private String job;
	private double sal;
	/**
	 * @param name
	 * @param job
	 * @param sal
	 */
	public Momster235(String name, String job, double sal) {
		super();
		this.name = name;
		this.job = job;
		this.sal = sal;
	}
	//重写toString方法
	@Override
	public String toString() { //重写后，一般是把对象的属性值输出，当然程序员也可以自己定制
		// TODO 自动生成的方法存根
		return "Monster{" +
		"name='" + name + '\'' +
		", job='" + job + '\'' +
		", sal=" + sal +
		'}';
	}



	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job 要设置的 job
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return sal
	 */
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal 要设置的 sal
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
