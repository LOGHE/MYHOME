/**
 * 
 */
package kadai03;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Order {
		private String customerNo;
		private String customerName;
		private int [] code = {8,6,3,5,2};
		private int [] price = {500,230,460,120,600};
		private int [] num = new int[5];
		public String getCustomerNo() {
			return customerNo;
		}
		public void setCustomerNo(String customerNo) {
			this.customerNo = customerNo;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		
		int getPrice(int cd) {
			int num2 = -1;
			for (int i = 0; i < price.length; i++) {
				if (code[i] == cd) {
					num2 =price[i];
				}
			}
			return num2;
		}
		int getNum(int cd) {
			int num1 = -1;
			for (int i = 0; i < code.length; i++) {
				if (code[i] == cd) {
					num1 = num[i];
				}
			}
			return num1;
		}
		void addNum(int cd,int nu) {
			 for (int i = 0; i < code.length; i++) {
				if (code[i] == cd) {
					num[i] += nu;
				}
			}
		}
		int getTotal() {
			int sum = 0;
			for (int i = 0; i < price.length; i++) {
				sum += (price[i] * num[i]);
			}
			return sum;
		}
		@Override
		public String toString() {
			return "customerNo : " + customerNo + "\n" + "customerName : "
		+ customerName + "\n" + "Total Price : " + getTotal();
		}
		
}
