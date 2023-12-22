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
		
		System.out.print("(Fifo or Lifo)-->");
		String str = sc.next();
		if (str.equals("Fifo")) {
			Store fifoStore = new FifoStore();
			
			System.out.print("Select(Put or Get or End) -->");
			String select = sc.next();
			while (!select.equals("End")) {
				// Put();
				if (select.equals("Put")) {
					System.out.print("No-->");
					int no = sc.nextInt();
					System.out.print("Name-->");
					String name = sc.next();

					fifoStore.put(new User(no, name));
				}
				
				// Get();
				if (select.equals("Get")) {
					User user = (User)fifoStore.get();
					if (user!= null) {
						System.out.println(user.getNo() + "\t" + user.getName());
					} else {
						System.out.println("Not Exist");
					}
					System.out.println("Store Size : " + fifoStore.size());
				}

				System.out.println();
				System.out.print("Select(Put or Get or End) -->");
				select = sc.next();
			}
		}

		if (str.equals("Lifo")) {
			Store lifoStore = new LifoStore();
			
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
				}

				// Get
				if (select.equals("Get")) {
					User user = (User) lifoStore.get();//lifoStore.get()这个方法每调用一次index--就会被执行一次
					if (user != null) {
						System.out.println(user.getNo() + "\t" + user.getName());
					} else {
						System.out.println("Not Exist");
					}
					System.out.println("Store Size : " + lifoStore.size());
				}
				System.out.println();
				System.out.print("Select(Put or Get or End) -->");
				select = sc.next();
			}

		}
	}
}
