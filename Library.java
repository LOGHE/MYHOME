
package kadai002;

import java.util.Scanner;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
class Library{
	Scanner sc = new Scanner(System.in);
	String str;
	public Book  book1 = new Book();
	public Book book2= new Book();
	public Book  book3= new Book();
	
	 Book findBooksByAuthor(String author) {//著者検索メソッド
		 if (author.equals(book1.author) ) {//book1の場合
				return  book1;
			}else if(author.equals(book2.author) ) {//book2の場合
				return book2;
			}else if(author.equals(book2.author)) {//book3の場合
				return book3;
			}else {
				return null;
			}
	 }
	 
	 Book findBooksByTitle(String title) {//タイトル検索メソッド
		 if (title.equals(book1.title) ) {//book1の場合
				return  book1;
			}else if(title.equals(book2.title) ) {//book2の場合
				return book2;
			}else if(title.equals(book2.title)) {//book3の場合
				return book3;
			}else {
				return null;
			}
	 }
}
