/**
 * 
 */
package Kadai14;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Goods {
	private String goodsCode;
	private String goodsName;
	private int price;
	public Goods(String goodsCode, String goodsName, int price) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.price = price;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Goods)) {
			return false;
		}
		//ダウンキャスト
		Goods goods = (Goods)obj;
		return this.goodsCode.equals(goods.goodsCode);
	}
	
}
