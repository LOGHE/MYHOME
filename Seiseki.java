/**
 * 
 */

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Seiseki {
	private String no;
	private String name;
	private double score;
	
	public Seiseki(String csvStr) {
		String arrs[] = csvStr.split(",");
		double sum = 0;
		for (int i = 0; i < arrs.length; i++) {
			if (i == 0) {
				this.no = arrs[i];
				continue;
			}else if (i == 1) {
				this.name = arrs[i];
				continue;
			}
			sum += Integer.parseInt(arrs[i]);
		}
		this.score = sum / (arrs.length - 2);
	}
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public double getScore() {
		return score;
	}
	public String getGrade() {
		String str1 = null;
		if (score >= 90) {
			str1 = "S";
		}else if (score >= 80) {
			str1 = "A";
		}else if (score >= 70) {
			str1 = "B";
		}else if (score >= 60) {
			str1 = "C";
		}else {
			str1 = "D";
		}
		return str1;
	}
}
