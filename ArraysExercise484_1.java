package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("all")
public class ArraysExercise484_1 {
	public static void main(String[] args) {
		  Book1[] books =  new Book1[4];//建立静态数组方便调用
		//给4个对象赋值
		books[0] = new Book1("火影1", 40);
		books[1] = new Book1("海贼23",20);
		books[2] = new Book1("死神123", 50);
		books[3] = new Book1("鬼灭1234", 30);
		Arrays.sort(books,new Comparator() {
			
			//double的应用 和直接传入对象
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
				return 0;
			}
		});
		System.out.println(Arrays.toString(books));
		
		System.out.println("从价格小到大");
		Arrays.sort(books,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Book1 book1 = (Book1) o1;//拆箱 向下转型因为 Object是父类 
				Book1 book2 = (Book1) o2;
				double res = book1.getPrice() - book2.getPrice();
				if (res > 0) {
					return 1;
				}else if (res < 0) {
					return -1;
				}else
				return 0;
			}
		});
		System.out.println(Arrays.toString(books));
		
		System.out.println("字符串从大到小排序");
		Arrays.sort(books,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Book1 book1 = (Book1) o1;//拆箱 向下转型因为 Object是父类 
				Book1 book2 = (Book1) o2;
				return   book2.getName().length() - book1.getName().length();
			}
		});
		System.out.println(Arrays.toString(books));
	}
}
class Book1{
	private String name;
	private double price;
	public Book1(String name, double price) {
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