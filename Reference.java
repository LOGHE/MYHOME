/**
 * 
 */
package kyoukasyoB;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Reference {
		public static void main(String[] args) {
			int [] reference = new int[6];
			int table[] = {13,8,20,17,5,12};
			int Maxidx,work,i, j;
			int n = table.length; 
			for (i = 0; i <= n -1; i++) {
				reference[i] = i;
			}
			for ( i = 0; i <= n - 2; i++) {
				Maxidx = i;
				for ( j = i + 1; j <= n - 1; j++) {
					if (table[reference[j]] > table[reference[Maxidx]]) {
						//用table[j] > table[Maxidx] 的话会造成值重复比较，比如已经确定最大值了但还是会把最大值拿来比
						//如table[j= 2] > table[Maxidx = 1] 此时还会比较到最大值 20 会造成值重复比较
						//如果用 table[reference[j]] > table[reference[Maxidx]] 的话已经确定的最大值就已经被移动到了reference[0] 里面就不会去比较了
						//如 table[reference[j] = 0] > table[reference[Maxidx] =1 ] 此时就巧妙地避开了已经比较确认并且移动到reference[0]的最大值20了
						Maxidx = j;
					}
				}
				if (i != Maxidx ) {
					work = reference[i];
					reference[i] = reference[Maxidx];
					reference[Maxidx] = work;
				}
			}
			for ( i = 0; i < table.length; i++) {
				System.out.print(table[reference[i]] + " ");
			}
			System.out.println();
			for ( i = 0; i < table.length; i++) {
				System.out.print(reference[i] + " ");
			}
		}
}
