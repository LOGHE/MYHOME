/**
 * 
 */
package com.hspedu.extend;

/**
 * @author 日暮れて道遠し
 *
 */
//小学生
public class Extends285 {
	public static void main(String[] args) {
		//new一个小学生
	Pupil pupil = new Pupil();
	pupil.name = "小米";//姓名和年龄公开的
	pupil.age = 10;
	pupil.testing();
	pupil.setScore(100);//输入隐私成绩
	pupil.showfo();
	//new一个大学生对象
	Graduate graduate = new Graduate();
	graduate.name = "美兰";
	graduate.age = 22;
	graduate.testing();
	graduate.setScore(66.6);
	graduate.showfo();
	
	}
}
