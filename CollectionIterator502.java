/**
 * 
 */
package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
@SuppressWarnings({ "all" })
public class CollectionIterator502 {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add(new Anime("ナルト","岸本",40));
		col.add(new Anime("ワンピース","尾田",５0));
		col.add(new Anime("ホワイトアルバム","知らない",２0));
		System.out.println(col);
		System.out.println("=====--=====");
		
		//イテレータの繰り返し
		//迭代器输出数组/集合
		Iterator iterator = col.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		}
		//イテレータの繰り返しの再利用  （快捷键）
		//Iterator iterator = col.iterator();もう一度編歴
		System.out.println("====================");
		iterator  = col.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		//增强型for循环遍历
		System.out.println("增强型for循环");
		for (Object animei1 : col) {
			System.out.println(animei1);
		}
	}
}

class 	Anime{
	private String name;
	private String author;
	private double price;
	public Anime(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Anime [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
