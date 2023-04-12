/**
 * 
 */
package com.hspedu.codeblock_;

/**
 * @author 日暮れて道遠し
 *
 */
public class CodeBlock385 {
	public static void main(String[] args) {
		Movie movie = new Movie("猪猪");
	}
}

class Movie{
	private String name;
	private double price;
	private String director;
	//代码块实现构造器中重复的语块System.out.println("wwwwwww");
	//当我们不管调用哪个构造器，创建对象都会先调用代码块的内容
	//代码块的调用是优先于构造器的
	
	//代码块
	{
		System.out.println("wwwwwww");
		System.out.println("wwwwwww");
	}
	public Movie(String name, double price, String director) {
		super();
//		System.out.println("wwwwwww");
//		System.out.println("wwwwwww");
		this.name = name;
		this.price = price;
		this.director = director;
		System.out.println(name);
	}
	
	public Movie(String name, double price) {
		super();
//		System.out.println("wwwwwww");
//		System.out.println("wwwwwww");
		this.name = name;
		this.price = price;
	}

	public Movie(String name) {
		super();
//		System.out.println("wwwwwww");
//		System.out.println("wwwwwww");
		this.name = name;
		System.out.println(name);
	}
	
}