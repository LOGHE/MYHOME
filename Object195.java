package test7;

import javax.xml.catalog.Catalog;

public class Object195 {
//编写一个 main 方法
public static void main(String[] args) {
			/*
			张老太养了两只猫猫:一只名字叫小白,今年 3 岁,白色。
			还有一只叫小花,今年 100 岁,花色。请编写一个程序，当用户输入小猫的名字时，
			就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，
			则显示 张老太没有这只猫猫*/
		//Cat cat1 =new Cat();
	Cat cat1 = new Cat();
		cat1.name = "小白";
        cat1.age =3; 
        cat1.color = "白色";
        Cat cat2 = new Cat();
		cat2.name = "小花";
        cat2.age =100; 
        cat2.color = "花色";
        System.out.println("第 1 只猫信息" + cat1.name
        		+ " " + cat1.age + " " + cat1.color );
        		System.out.println("第 2 只猫信息" + cat2.name
        		+ " " + cat2.age + " " + cat2.color);
}
}
class Cat{//此处必须大写
	int age;
	String name;
	String color;
	
	
}