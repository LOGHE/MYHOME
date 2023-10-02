/**
 * 
 */
package kadai002;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Kadai0204 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Library library = new Library();
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		String str ;//ユーザ入力する値の器
		//三冊の本に入力する
		for (int i = 1; i < 4; i++) {
			Book book001 = new Book();
			System.out.println(i + "冊目のタイトル");
			book001.title = sc.next();
			System.out.println(i + "冊目の著者");
			book001.author = sc.next();
		System.out.println(i + "冊目の出版年");
			book001.yearPublished = sc.nextInt();
			if (i == 1) {
				library.book1 = book001;
			} 
			if (i == 2) {
				library.book2 = book001;
			}
			if (i == 3) {
				library.book3 = book001;
			}
		}
		
		//検索するタイトル
		System.out.println("検索するタイトル");
		str = sc.next();
		book = library.findBooksByTitle(str);
		if (book != null) {//nullでない場合
			System.out.println("検索結果：タイトル：" + book.title + 
					"著者：" + book.author + " 出版年：" + book.yearPublished);
		}else {
			System.out.println("検索結果なし");
			
		}
		
		//検索する著者
		System.out.println("検索する著者-->");
		str = sc.next();
		book = library.findBooksByAuthor(str);
		if (book != null) {
			System.out.println("検索結果：タイトル：" + book.title + 
					"著者：" + book.author + " 出版年：" + book.yearPublished);
		}else {
			System.out.println("検索結果なし");
		}
		
	}

}
