import java.util.Scanner;//表示把包java。util下的Scanner这个类导入

public class Input{
	
//	private static final Scanner myscanner = null;

	//编写一个main方法
	public static void main (String[]args){
//		演示接受用户的输入
//		步骤
//		Scanner类 表示 简单文本扫描器，在java.util包
//		1引入/导入Scanner类所在的包
//		2创建Scanner对象，用单词new 表示创建一个对象，体会
//		myScanner 就是Scanner类的对象
		Scanner myscanner = new Scanner(System.in);
		//3. 接收用户输入了， 使用 相关的方法
		System.out.println("请输入名字");
		//当程序执行到 next 方法时，会等待用户输入~~~ 
		String name = myscanner.next(); //接收用户输入字符串
		System.out.println("请输入年龄");
		int age = myscanner.nextInt(); //接收用户输入 int
		System.out.println("请输入薪水");
		double sal = myscanner.nextDouble(); //接收用户输入 double
		System.out.println("人的信息如下:");
		System.out.println("名字=" + name
				+ " 年龄=" + age + " 薪水=" + sal);
		
	}
	}