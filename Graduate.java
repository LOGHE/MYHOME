/**
 * 
 */
package com.hspedu.extend;

/**
 * @author 日暮れて道遠し
 *
 */
//大学生考试情况
public class Graduate {
	public String name;
	public int age;
	private double score;
	/**
	 * @param score 要设置的 score
	 */
	public void setScore(double score) {
		this.score = score;
	}
	public void testing() {//和Pupil不一样
		System.out.println("大学生"+name+"  正在考大学数学");
	}
	public void showfo() {
		System.out.println("学生名字"+name+"  年龄"+age+"  成绩"+score);
	}
}
