/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class Dog301 extends Anima301{
	//因为
		public void cry() {
			System.out.println("喵喵喵");
}
		
		//细节: 子类方法的返回类型和父类方法返回类型一样，
		// 或者是父类返回类型的子类
		//比如 父类 返回类型是 Object , // 子类方法返回类型是 String
		public String m1() {
			return null;
		}
		
		//objeck不是String的子类，因此编译出错
//		public Object m2() {//返回类型与 Anima301.m2() 不兼容
//			return null;
//		}
		//细节: 子类方法不能缩小父类方法的访问权限 【演示】
		//public > 空> protected > 默认>private
		
}