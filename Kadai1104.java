/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class Kadai1104 {
	public static void main(String[] args) {
		String str = "JapanElectronicsCollege";
		
		char [][] charArray = {{'J','a','p','a','n'},
				{'E','l','e','c','t','r','o','n','i','c','s'},
				{'c','o','l','l','e','g','e'}
		};
		
		StringCharIterator stringCharIterator = (StringCharIterator) CharIteratorFactory.getCharIterator(str);//ダウンキャスト
		CharArrayCharIterator charArrayCharIterator = (CharArrayCharIterator)CharIteratorFactory.getCharIterator(charArray);
		
		System.out.println("String----------");
		
		while (stringCharIterator.hasNext()) {	
				System.out.println(stringCharIterator.next());
				if (stringCharIterator.next() == 0) {//0 の場合break
					break;
				} 
		}
		
		System.out.println("CharArray-----------");
		while (charArrayCharIterator.hasNext()) {	
			if (charArrayCharIterator.next() == 0) {
				break;
			}
			System.out.println(charArrayCharIterator.next());
	}
	}
}
