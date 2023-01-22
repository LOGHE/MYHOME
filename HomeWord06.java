public class HomeWord06{
	//编写一个main方法
	public static void main (String[]args) {
		//编程，保存两本书名，用+拼接，看效果。保存两个性别，同操作。保存书价格，同操作。
		String book1 = "人间失格";
		String book2 = "雪国";
		System.out.println(book1+book2);//字符串相加 只会在后面叠加“天龙八部笑傲江湖”
		
		//性别应该用char
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1 + c2);//字符相加 为汉字对应的数字相加 所有变量相加都默认为int相加
		
		//价格用bouble
		double d1 = 123.56;//高精度小数相加，精度很高精确到小数点后很多位
		double d2 = 100.11;
		System.out.println(d1 + d2);
				
		
	}
}