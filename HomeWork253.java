package test7;
public class HomeWork253 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Book b1 = new Book("人间失格",450);
			b1.info();//这里是直接引用方法不会改变价格还是450
			b1.updatePrice();//这里需要执行一下，改变书的价格
			b1.info();
		
	}
}
//编写类 Book ，定义方法 updatePrice ，实现更改某本书的价格，
//具体：如果价格>150，则更改为150，如价格＞100，更改为100，否则不变
//先定义一个方法传入 初始价格 
class Book{
	int price;
	String book;
	public Book(String book,int price) {//构造器 书的价格
		this.price=price;
		this.book = book;
	}
	public void updatePrice() {
		if(price>100&&price<150) {//先进行假定比较 上面this book的价格...
			price = 100;
		}else if(price>150) {
			price = 150;
		}
	}
	public void info() {
		System.out.println("书名"+this.book+"价格="+this.price);
	}
	
}