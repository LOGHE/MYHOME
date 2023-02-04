/*从重复文中用break终止程序
*/
public class MyDoubleLoop2{
	//编写一个main方法
	public static void main(String[]agrs) {
		//外侧的重复处理8-15行 i为0-4
		for( int i = 0;i<6;i++) {
			System.out.println("i =" +i+ ":");
			//内侧的重复11-13行j为0到i-1
			for(int j = 0;j < i; j++) {
				System.out.println(""+j);
			}
		System.out.println();
		}
	}
}