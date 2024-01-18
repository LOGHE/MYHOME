/**
 * 
 */
package Kadai13;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public class MemberList {
	private Member[] list = new Member[5];
	private int index;
	
	public void add(Member member) throws MemberException {
		/*int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				count++;
			}
		}*/
		
		if (index != list.length) {
			for (int i = 0; i < list.length; i++) {
				if (list[i] != null && member.getNo() == list[i].getNo() ) {
					throw new MemberException("Member Exist");
				}
				if (list[i] == null) {
					list[i] = member;
					index ++;
					break;
				}
			}
		}else {
			throw new  MemberException("Member is Full");
		}
	}
	public void delete(Member member) throws MemberException {
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (member.getNo() == list[i].getNo() && member.getName().equals(list[i].getName())) {
				list[i] = null;
				for (int j = i; j < list.length -1; j++) {
					list[j] = list[j + 1];
				}
				index --;
				list[index ] = null;
				break;
			}
			count ++;
			if (count == list.length) {
				throw new MemberException("Member Not Exist");
			}
		}
		
		
	}
	public void print() {
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println(list[i].getNo() + "\t" + list[i].getName());
			}
		}
	}
}