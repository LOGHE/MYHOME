/**
 * 
 */
package HomeWork456;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class HomeWork456 {
	public static void main(String[] args) {
		//先验证输入的参数的个数是否正确 即为两个参数
		
		try {
			if (args.length != 2) {//数组下标越界异常
				throw new ArrayIndexOutOfBoundsException("参数个数不对");
			}
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);//数字格式不正确异常
			//把接收到的参数转换为整数
			double res = cal(n1, n2);//该方法可能抛出ArithmeticException
			cal(n1, n2);
			System.out.println("计算结果是" + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO 自动生成的 catch 块
			System.out.println("数组下标越界"+e.getMessage());
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("数字格式不正确异常"+e.getMessage());
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("运算异常" + e.getMessage());
		}
//		
//		int arr [] = {10,12,0};
//		try {
//			String str = "laojiu";
//			arr[2] = Integer.parseInt(str);//数字格式不正确异常
//			cal(arr[3], arr[1]);//数学运算异常 和数组下标越界异常
//		} catch (ArithmeticException e) {
//			// TODO 自动生成的 catch 块
//			System.out.println("异常信息=" + e.getMessage());
//		}catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println("异常信息=" + e.getMessage());
//		}catch (NumberFormatException e) {
//			// TODO: handle exception
//			System.out.println("异常信息=" + e.getMessage());
//		}
	}
	
	public static double cal(int n1,int n2) {
		return n1 / n2;
	}
	
}
