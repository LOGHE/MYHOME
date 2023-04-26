/**
 * 
 */
package HomeWork456;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork457_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			showExce();//下面抛出异常没有处理
			System.out.println("A");//上面抛出异常 A 不输出
		} catch (Exception e) {//这里会处理上面的异常B输出
			// TODO 自动生成的 catch 块
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		System.out.println("D");//有catch语句处理了异常要执行输出D
		
		System.out.println("===============");
		try {
			func();//因为调用方法输出B
			System.out.println("A");//上面调用了抛出异常的方法 A不输出
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println("C");//处理异常执行 输出C
		}
		System.out.println("D");//执行完代码输出"D"
	}
public static void showExce() throws Exception{
	throw new Exception();
}

public static void func() {
	try {
		throw new RuntimeException();
	} finally {
		System.out.println("B");
	}
	//System.out.println("E");  E不输出 因为异常没有catch处理 直接抛给上一级 finally直接结束方法 不输出E
}
}
