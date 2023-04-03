/**
 * 
 */
package com.hspedu.Object_;

/**
 * @author 日暮れて道遠し
 *
 */
//: 判断两个 Person 对象的内容是否相等，
//如果两个 Person 对象的各个属性值都一样，则返回 true，反之 false
public class Person321 {
	public static void main(String[] args) {
		Person person1 = new Person("log", 25, '男');
		Person person2 = new Person("log", 25, '男');
		//因为没有重写equals方法，new了两次是两个不同的对象地址 所以下面输出返回假
		System.out.println(person1.equals(person2));//Person这里默认继承了一个object父类
	}
}


 class Person {private static final Object Person = null;
//这里默认继承了一个object父类
	private String name;
	private int age;
	private char gender;
	
	/**
	 * @param name
	 * @param age
	 * @param gender
	 */
	//******重写父类object的equals方法
	@Override
		public boolean equals(Object obj) {
			// TODO 自动生成的方法存根
			if (this == obj) {
				return true;
			}
			//类型判断
			if (obj instanceof Person) {
				Person person = (Person)obj;
				return this.name.equals(person.name)&&this.age == person.age && this.gender == person.gender;
			}
			return false;
		}
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age 要设置的 age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return gender
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * @param gender 要设置的 gender
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
}
