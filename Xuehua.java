/**
 * 
 */
package kadai10;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Xuehua {
		public static void main(String[] args) {
			
			        int size = 5; // 雪花的大小（行和列数）
			        char[][] snowflake = new char[size][size];

			        // 初始化二维数组
			        for (int i = 0; i < size; i++) {
			            for (int j = 0; j < size; j++) {
			                snowflake[i][j] = '0'; // 使用空格填充数组
			            }
			        }

			        // 打印雪花形状
			        for (int i = 0; i < size; i++) {
			            snowflake[i][size / 2] = '1'; // 在中间列打印星号
			            snowflake[size / 2][i] = '1'; // 在中间行打印星号
			            snowflake[i][i] = '1'; // 在主对角线上打印星号
			            snowflake[i][size - 1 - i] = '1'; // 在副对角线上打印星号
			        }

			        // 输出二维数组
			        for (int i = 0; i < size; i++) {
			            for (int j = 0; j < size; j++) {
			                System.out.print(snowflake[i][j] + " ");
			            }
			            System.out.println();
			        }
			    }
			}
