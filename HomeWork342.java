/**
 * 
 */
package test8;

import java.util.jar.Attributes.Name;

/**
 * @author 日暮れて道遠し
 *
 */
public class HomeWork342 {
	public static void main(String[] args) {
//		1.定义一个 Person 类( name , age , job ),
//		初始化 Person 对象数组，有3个 person 对象，
//		并按照 age 从大到小进行排序，提示，使用冒泡排序
		
		//思路分析 先 定义类 构造器 方法 (里面保存信息方便输出)
		//创建对象数组 遍历数组 
		//创建保存交换的新对象数组p2【0】
		//然后加入冒泡排序 比较age方法年纪大的放p1【0】，依次类推
		//我们将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列。
				//思路分析
				//一共进行4轮比较 可以看作外循环四次
				//第一轮比较 4次。2轮3次。3轮2次。四轮1次。 4-3-2-1
//				int [] arr = {24,69,80,57,13};
//				int temp = 0;//用来保存原先的值用于交换
//				for(int i = 0;i < arr.length-1; i++) {//外循环4轮
//				for (int j = 0; j < arr.length-i-1; j++) {//内循环的次数为第一轮4次 二轮3 三轮2 四轮1.j<arr.length-i-1来实现
//					if(arr[j] > arr[j+1]) {//假设第一个大就和第二个进行对换。
//						temp = arr[j];
//						arr[j] = arr[j +1];
//						arr[j+1] = temp;
		
		Person342[] p1 = new Person342[3];
		p1[0] = new Person342("小木曾雪菜", 25, "程序员");
		p1[1] = new Person342("冬马和纱", 26, "厨师");
		p1[2] = new Person342("北原春希", 24, "老板");
//		Person342[] p2 = new Person342[1];
//		p2[0] = new Person342(null, 0, null);//用来保存原先的对象交换
		//上面是自己的 下面是老韩的对象
		Person342 tmpe = null;//老韩的简洁些
		for (int i = 0; i < p1.length-1; i++) {//进行2轮比较
			for (int j = 0; j < p1.length-i-1; j++) {
				//比较int的age，然后改变对象数组的排序
				//第一轮比较2次  【0】和【1】比 【1】和【2】比 确认把最小的放在最后。。。
				//第二轮比较1次 【0】和【1】 把最大的放在第一 这样第二大的就在中间了
				if (p1[j].getAge() < p1[j+1].getAge()) {//默认第一个是最小的 然后交换就完事了
					tmpe = p1[j];
					p1[j] = p1[j+1];
					p1[j+1] = tmpe;
				}
			}
		}
		for (int i = 0; i < p1.length; i++) {
			System.out.println(p1[i].toString());
		}
	}
}
class Person342{
	private String Name;
	private int age;
	private String job;
	public Person342(String name, int age, String job) {
		super();
		Name = name;
		this.age = age;
		this.job = job;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void say() {
		System.out.println(Name + "的年纪为" + age + "岁，从事"+ job);
	}
	@Override
	public String toString() {
		return "Person342 [Name=" + Name + ", age=" + age + ", job=" + job + "]";
	}
	
	
}