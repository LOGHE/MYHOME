/**
 * 
 */
package Kadai14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class CustomerList {
	private List<Customer> list = new ArrayList<>();
	private static Customer[] customerTable = {new Customer("CU01", "Aoyama Ichiro"),
			new Customer("CU02", "Kayama MIdori"),
			new Customer("CU03", "Sakai Toshio"),
			new Customer("CU04", "Takeda Keisuke"),
			new Customer("CU05", "Nakayama Syo")};
	public CustomerList() {
		for (int i = 0; i < customerTable.length; i++) {
			list.add(customerTable[i]);
		}
	}
	public Customer get(String customerNo) {
		for (Customer ctr : customerTable) {
			if (ctr.getCustomerNo().equals(customerNo)) {
				return ctr;
			}
		}
		return null;
	}
}
