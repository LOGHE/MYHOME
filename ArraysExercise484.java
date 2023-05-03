/**
 * 
 */
package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class ArraysExercise484 {
	public static Book1[] books =  new Book1[4];//建立静态数组方便调用
	public static void main(String[] args) {
		//给4个对象赋值
		books[0] = new Book1("火影1", 40);
		books[1] = new Book1("海贼23",20);
		books[2] = new Book1("死神123", 50);
		books[3] = new Book1("鬼灭1234", 30);
		arr();
		
		System.out.println("第二种方法");
		arr1(books,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Book1 book1 = (Book1) o1;//拆箱 向下转型因为 Object是父类 
				Book1 book2 = (Book1) o2;
				double res = book2.getPrice() - book1.getPrice();
				if (res > 0) {
					return 1;
				}else if (res < 0) {
					return -1;
				}else
				return 0;//接收下面传来的两个数组值进行 减  最后看他是否大于0
			}
			
		});
		System.out.println(Arrays.toString(books));
//		for (int i = 0; i < books.length; i++) {
//		System.out.println(books[i]);
//	}
		arr3(books, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int i1 = (Integer) o1;//拆箱 向下转型因为 Object是父类 
				int i2 = (Integer) o2;
				return i1 - i2;//接收下面传来的两个数组值进行 减  最后看他是否大于0
			}
		});
		System.out.println("第三中方法");
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
	}
	
	
	public static void arr() {//使用冒泡排序法 完成从大到小数组排序
		System.out.println("第一种方法");
		for (int i = 0; i < books.length-1; i++) {
			for (int j = 0; j < books.length-1-i; j++) {
				  Book1 temp;
				if (books[j+1].getPrice() > books[j].getPrice() ) {//找到价格属性 进行判断排序
					temp = books[j];//判断内容是进行对象转换
					books[j] = books[j+1];
					books[j+1] = temp;
				}
			}
		}
//		for (int i = 0; i < books.length; i++) {
//			System.out.println(books[i]);
//		}
		System.out.println(Arrays.toString(books));
	}
	public static void arr1(Book1 [] books, Comparator c) {
		for (int i = 0; i < books.length-1; i++) {
			for (int j = 0; j < books.length-1-i; j++) {
				  Book1 temp;
				if (c.compare(books[j+1],books[j]) > 0) {//把参数传给上面的obj
					//ojb返回的值是否大于0来判断是否进行对象转换 大于0 交换小于0则不变
					temp = books[j];
					books[j] = books[j+1];
					books[j+1] = temp;
				}
			}
		}
	}
	public static void arr3(Book1 [] books, Comparator c) {
		for (int i = 0; i < books.length-1; i++) {
			for (int j = 0; j < books.length-1-i; j++) {
				  Book1 temp;
				if (c.compare(books[j+1].getName().length(),books[j].getName().length()) > 0) {//把参数传给上面的obj
					//ojb返回的值是否大于0来判断是否进行对象转换 大于0 交换小于0则不变
					temp = books[j];
					books[j] = books[j+1];
					books[j+1] = temp;
				}
			}
		}
	}
}
class Book{
	private String name;
	private double price;
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}
