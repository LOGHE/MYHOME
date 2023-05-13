/**
 * 
 */
package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
@SuppressWarnings({"all"})
public class ListExercise507 {
	public static void main(String[] args) {
		//List list = new ArrayList();   1
		//List list= new Vector();     2
		List list= new LinkedList();//3
		//上面三种方法是一样的实现方式
		
		list.add(new Book("红楼梦", 100, "曹雪芹"));
		list.add(new Book("西游记", 10, "吴承恩"));
		list.add(new Book("三国演义", 9, "罗贯中"));
		list.add(new Book("水浒传", 45, "施耐庵"));
		for (Object object : list) {
			System.out.println(object);
		}
		arr(list);
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public static void arr(List list ) {
		System.out.println("冒泡排序法排序");
		int listSize = list.size();
		for (int i = 0; i < listSize - 1; i++) {
		for (int j = 0; j < listSize - 1 - i; j++) {
		//取出对象 Book
		Book book1 = (Book) list.get(j);//需要向下转型才能提取 因为是提前子类的价格 
		Book book2 = (Book) list.get(j + 1);
		if (book1.getPrice() > book2.getPrice()) {//交换
		list.set(j, book2);//改变 list的对象顺序
		list.set(j + 1, book1);
		}
	}
}
	}
}
//	public static void name(Book [] book) {
//		Arrays.sort(book,new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				Book book = (Book)o1;
//				Book book2 = (Book)o2;
//				double res = book.getPrice() - book2.getPrice();
//				if (res > 0 ) {
//					return 1;
//				}else if (res < 0 ) {
//					return -1;
//				}else {
//					return 0;
//				}
//			}
//		});
	
class Book{
	private String name1;
	private double price;
	private String name2;
	public Book(String name1, double price, String name2) {
		super();
		this.name1 = name1;
		this.price = price;
		this.name2 = name2;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	@Override
	public String toString() {
		return "Book [name1=" + name1 + "\t"+ " price=" + price + "\t name2=" + name2 + "]";
	}
	
}
