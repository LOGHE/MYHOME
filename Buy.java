/**
 * 
 */

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Buy {
	private int buyNo;
	private String buyDate;
	private String shohinNo;
	private int price;
	private int num;
	public Buy(int buyNo, String buyDate, String shohinNo, int price, int num) {
		super();
		this.buyNo = buyNo;
		this.buyDate = buyDate;
		this.shohinNo = shohinNo;
		this.price = price;
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public int getNum() {
		return num;
	}
	public void printBuyDate() {
		System.out.println("\t" + buyDate + "\t" +
					shohinNo + "\t\t" + price +  "\t" + num);
	}
}
