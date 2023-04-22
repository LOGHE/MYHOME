/**
 * 
 */
package com.hspedu.exception_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class TryCatchDetail449 {
	public static void main(String[] args) {
		//1. 如果异常发生了，则异常发生后面的代码不会执行，直接进入到 catch 块
		//2. 如果异常没有发生，则顺序执行 try 的代码块，不会进入到 catch
		//3. 如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码- finally
		try {
			String str = "知识";
			int a = Integer.parseInt(str);
			System.out.println("数字：" + a);
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			System.out.println("异常信息 = " + e.getMessage());
		}finally {
			System.out.println("是否发生异常,都给我执行");
		}
		System.out.println("程序继续");
		
		
		System.out.println("=================");
		//1.如果 try 代码块有可能有多个异常
		//2.可以使用多个 catch 分别捕获不同的异常，相应处理
		//3.要求子类异常写在前面，父类异常写在后面
		try {
			Person person = new Person();
			person = null;//NullPointerException
			System.out.println(person.getName());
			int n1 = 10;
			int n2 = 0;
			int res = n1 / n2;//ArithmeticException
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("单独捕获空指针异常" + e.getMessage());
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("单独捕获数学运算异常" + e.getMessage());
		}
		catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}finally {
			
		}
		
		
		System.out.println("================");
		/*
		可以进行 try-finally 配合使用, 这种用法相当于没有捕获异常，
		因此程序会直接崩掉/退出。应用场景，就是执行一段代码，不管是否发生异常，
		都必须执行某个业务逻辑
		*/
		try{
			int n1 = 10;
			int n2 = 0;
			System.out.println(n1 / n2);
			}finally {
			System.out.println("执行了 finally..");//因为没有catch所有这句话 没有捕获 到这里就结束了
			}
		System.out.println("程序继续执行..");//因为没有catch所有这句话不会被执行 没有捕获 直接挂掉
	}
}

class Person{
	private String name = "jack";
	public String getName() {
		return name;
	}
}