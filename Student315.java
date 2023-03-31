/**
 * 
 */
package com.hspedu.poly_.polyarr_;

/**
 * @author 日暮れて道遠し
 *
 */
public class Student315 extends Person315 {
	private double score;

	/**
	 * @param name
	 * @param age
	 * @param score
	 */
	public Student315(String name, int age, double score) {
		super(name, age);
		this.score = score;
	}

	/**
	 * @return score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score 要设置的 score
	 */
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String say() {
		// TODO 自动生成的方法存根
		return "学生 " + super.say() + " score=" + score;
	}
	//特有方法
	public void student() {
		System.out.println("学生 "+getName()+" 正在学java");
	}

}
