/**
 * 
 */
package Kadai11;

import java.util.Scanner;

/**
 * @author 羅寿合(ラ ジュゴウ)
 *
 */
public class Kadai1103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Store fifoStore = new FifoStore();

		Store lifoStore = new LifoStore();

		System.out.print("(Fifo or Lifo)-->");
		String str = sc.next();

		//GetとPutの初期値を設置します。 放和取都是从0开始的
		int put = 0;
		int get = 0;

		if (str.equals("Fifo")) {
			System.out.print("Select(Put or Get or End) -->");
			String select = sc.next();
			while (!select.equals("End")) {
				// Put();
				if (select.equals("Put")) {
					fifoStore.index = put;// 今のPutした添え字を記録します　记录放入时当前位置下标
					System.out.print("No-->");
					int no = sc.nextInt();
					System.out.print("Name-->");
					String name = sc.next();

					fifoStore.put(new User(no, name));

					if (fifoStore.index == fifoStore.data.length - 1) {
						put = 0;//添え字はlastになったら、添え字を０にします 　如果下标达到最后一个就重置
					} else {
						put = fifoStore.index + 1;
					}
				}

				// Get();
				if (select.equals("Get")) {
					fifoStore.index = get;//今のPutした添え字を記録します　 记录取出时当前位置的下标
					if (fifoStore.get() == null) {
						System.out.println("Not Exist");
					} else {
						User user = (User) fifoStore.get();
						System.out.println(user.getNo() + "\t" + user.getName());
						fifoStore.data[fifoStore.index] = null;// 如果在get（）方法里面置空的话会导致传个空对象过来
						if (fifoStore.index == fifoStore.data.length - 1) {//添え字はlastになったら、添え字を０にします  如果下标达到最后一个就重置
							get = 0;
						} else {
							get = fifoStore.index + 1;
						}
					}
					System.out.println("Store Size-->" + fifoStore.size());
				}

				System.out.println();
				System.out.print("Select(Put or Get or End) -->");
				select = sc.next();
			}
		}

		if (str.equals("Lifo")) {
			lifoStore.index = put;// 今のPutした添え字を記録します
			System.out.print("Select(Put or Get or End) -->");
			String select = sc.next();
			while (!select.equals("End")) {
				// Put
				if (select.equals("Put")) {
					System.out.print("No-->");
					int no = sc.nextInt();
					System.out.print("Name-->");
					String name = sc.next();

					lifoStore.put(new User(no, name));
					if (lifoStore.index < lifoStore.data.length) {// 确保index下标在数组范围内
						lifoStore.index++;
					}
				}

				// Get
				if (select.equals("Get")) {
					if (lifoStore.size() != 0) {//添え字がマイナスになるのを防ぎます
						//８６行lifoStore.index++だから　先に--
						lifoStore.index--;
					}
					if (lifoStore.get() == null) {
						System.out.println("Not Exist");
					} else {
						User user = (User) lifoStore.get();
						System.out.println(user.getNo() + "\t" + user.getName());
						lifoStore.data[lifoStore.index] = null;// 如果在get（）方法里面置空的话会导致传个空对象过来
					}
					System.out.println("Store Size-->" + lifoStore.size());
				}
				System.out.println();
				System.out.print("Select(Put or Get or End) -->");
				select = sc.next();
			}

		}

	}
}
