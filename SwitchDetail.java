package test;
public class SwitchDetail{
	//编写一个main方法
	public static void main(String[]agrs) {
		//变量的宣言和初期化
		//细节1表达式类型应保持一致，但是低精度可以向高精度转换
		//细节2switch表达式中返还的值必须是byte,short.char int long,enum枚举,String）
		//细节3 case子句中的值必须是常量（1，'a'这种具体的值） 而不能是变量char c
		char c = 10;
		switch(c) {
		case 'a'://case后面的'a'和前面定义的c类型一直
		System.out.println("ok1");
		break;
		case 10://case后面的10和前面定义的 c 类型的高精度int可以转换
			System.out.println("ok2");
			break;
			default:
				System.out.println("ok3");

			
		
		}
	}
}