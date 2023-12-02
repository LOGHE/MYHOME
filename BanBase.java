/**
 * 
 */
package kadai09;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class BanBase {
		private String number;
		private String name;
		private int money;
		public BanBase(String number, String name, int money) {
			this.number = number;
			this.name = name;
			this.money = money;
			
		}
		public String getNumber() {
			return number;
		}
		public String getName() {
			return name;
		}
		public int getMoney() {
			return money;
		}
		
		public void depositMoney(int money) {
			this.money = money;
		}
		public void paymenMoney(int money) {
			if (this.money < money) {
				System.out.println("残高不足です");
			}else {
				this.money -= money;
			}
		}
	}
