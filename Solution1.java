/**
 * 
 */
package test;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class Solution1 {
	public static void main(String[] args) {
		int nums[] = {1,4,3,2,6,5};
		int res[] = new int[nums.length];
		//用两重循环一次和二次都是一样的循环次数这样就能确保到每个数都能被比较到
		for (int i = 0; i < nums.length; i++) {
			if (res[i] == nums[nums.length-1]) {//最后一个数没得比 自己等于自己
				res[i] = nums[i];
			}
			boolean f = true;
			for (int j = i+1; j < res.length; j++) {//判断第二个数比第一个大则交换
				if (nums[i] < nums[j]) {
					res[i] = nums[j];
					f = false;
					break;
				}
			}
			if (f) {//后一位比前一位小的情况，保持原样
				res[i] = nums[i];
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
