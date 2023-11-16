/**
 * 
 */

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Card {
	private String no;
	private String name;
	private String tel;
	private Buy[] buyDate;
	public Card(String no, String name, String tel, Buy[] buyDate) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.buyDate = buyDate;
	}
	public void printCardDate() {
		System.out.println("CardNo : " + no);
		System.out.println("Name : " + name);
		System.out.println("Tel : " + tel);
		System.out.println("------------------------------------------------------------------");
		System.out.println("No		Date        	ShohinNo        Price     num");
		for (int i = 0; i < buyDate.length; i++) {
			System.out.print(i +1 + "\t");
			buyDate[i].printBuyDate();
		}
	}
}
