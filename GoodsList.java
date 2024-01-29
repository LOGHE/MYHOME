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
public class GoodsList {
	private List<Goods> list = new ArrayList<>();
	private static Goods[] goodsTable = {new Goods("A001", "T-Shirt", 4500),
			new Goods("A002", "Y-Shirt", 5200),
			new Goods("B001", "Sneaker", 3000),
			new Goods("B002", "Sandal", 1500),
			new Goods("C001", "Wllet", 7800)};
	public GoodsList() {
		for (int i = 0; i < goodsTable.length; i++) {
			list.add(goodsTable[i]);
		}
	}
	public Goods get(String goodsCode) {
		for (Goods gd : goodsTable) {
			if (gd.getGoodsCode().equals(goodsCode)) {
				return gd;
			}
		}
			return null;
	}
}
