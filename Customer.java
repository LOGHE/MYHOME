/**
 * 
 */
package Kadai14;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Customer {
	private String customerNo;
	private String customerName;
	public Customer(String customerNo, String customerName) {
		super();
		this.customerNo = customerNo;
		this.customerName = customerName;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {//自分自身
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		//ダウンキャスト
		Customer customer = (Customer)obj;
		return this.customerNo.equals(customer.customerNo);
	}
	
}
