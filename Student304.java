/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class Student304 extends Person304{
	private String id;
	private double score;
	/**
	 * @param id
	 * @param score
	 */
	
	
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param name
	 * @param age
	 * @param id
	 * @param score
	 */
	public Student304(String name, int age, String id, double score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}

	/**
	 * @param id 要设置的 id
	 */
	public void setId(String id) {
		this.id = id;
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

	public 	String say() {
		return super.say()+  ",我的id是"+id+"成绩是"+score;
	}
	
}
