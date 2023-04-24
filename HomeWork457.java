/**
 * 
 */
package HomeWork456;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork457 {
	public static void main(String[] args) {
		if (args[4].equals("john")) {//数组下标越界异常//空指针异常
			System.out.println("AA");
		}else {
			System.out.println("BB");
		}
		Object o = args[2];
		Integer i = (Integer)o;//类型转换异常
	}
}
