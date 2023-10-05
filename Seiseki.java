/**
 * 
 */
package kadai03;

import java.util.Arrays;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Seiseki {
		private String no;
		private String name;
		private String kamoku;
		private int [] tokuten;
		public String getNo() {
			return no;
		}
		public void setNo(String no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getKamoku() {
			return kamoku;
		}
		public void setKamoku(String kamoku) {
			this.kamoku = kamoku;
		}
		public int[] getTokuten() {
			return tokuten;
		}
		public void setTokuten(int[] tokuten) {
			this.tokuten = tokuten;
		}
		
		void setTokutenN(int i,int ten) {
			tokuten[i] = ten;
		}
		int getTokutenN(int i ) {
			return tokuten[i];
		}
		double getAverage() {
			double sum = 0;
			for (int i = 0; i < tokuten.length; i++) {
				sum += tokuten[i];
			}
			return (double)(sum / tokuten.length);
		}
		String getGrade() {
			double average =getAverage();
			if (average >= 95) {
				return "秀";
			}else if (average >= 85) {
				return "優";
			}else if (average >= 70) {
				return "良";
			}else if (average >= 60) {
				return "可";
			}else {
				return "不可";
			}
		}
		@Override
		public String toString() {
			return "No : " + no +"\n" + "name : " + name + "\n" 
		+ "kamoku : " + kamoku + "\n" + "tokuten : "
					+ Arrays.toString(tokuten) + "\n" + "Average : " + getAverage() + "\n" 
		+ "Grade : " + getGrade();
		}
		
}
