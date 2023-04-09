/**
 * 
 */
package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House364;
import com.hspedu.houserent.utils.Utility363;

/**
 * 业务层
 *定义House【】 保存House对象
 *2完成对房屋信息的各种操作(增删改查)
 *
 */
//响应界面调用
//1 响应界面的2步骤，编写一个方法list(); 返回所有的房屋信息
//2 编写add（House364 newHouse364）方法，把新的house对象加入到house364s 数组   返回boolean
//3 编写方法del..(int delld) 完成真正删除任务返回一个boolean
//4 查找房源 写查找房源的下标
//4 修改房源的方法
public class HouseService366 {
	private House364[] house364s;//保存house对象
	private int houseNums = 1;//记录当前有多少个房屋信息
	private int idCounter = 1;//记录当前的id自增长到哪个值
	public HouseService366( int size) {
		super();
		house364s = new House364[size];//指定数组的大小
		//为了配合测试列表信息，这里初始化个house对象.定义一个初始化，下面才好进行下标个数限定
		house364s[0] =new House364(1, "nisa", "08000", "tokyo", 3500, "未出租");
	}
	
	
	//add方法，添加新的对象（添加房源） 返回boolean
	public boolean add(House364 newHouse364) {
		//判断是否还可以继续添加 =>老韩推荐能否自己加入数组扩容机制
		if (houseNums == house364s.length) {//当房屋剩余1 为什么是1因为上面定义了下标为0的房源 就不能再添加了
			System.out.println("数组已满不能再添加了");
			return false;
		}
		
		//把newHouse对象加入到 house364s[houseNums]里面去 因为上面houseNums不满足就执行下面的
		house364s[houseNums++] = newHouse364;//++在下一行所以后++
		//houseNums++;这里自增就可以循环 赋值的 当下标为1 2 3 4 5 6......
		//我们程序员需要设计一个id自增长的机制
		//idCounter++;
		newHouse364.setId(++idCounter);//++在上一行所以前++
		return true;
	}
	
	public House364[] lise() {
		return house364s;
	}

	//删除一个房屋信息
	public boolean del(int delID) {
		//应当先找到要删除的房屋信息对应的下标
		//一i的那个要搞清楚下标和房屋的编号不是一回事
		int index = -1;
		for (int i = 0; i < houseNums; i++) {
			if (delID == house364s[i].getId()) {//如果用户输入的数字等于当前这个数组的下标对应的 编号
				index = i;//就使用index 记录i
			}
		}
			if (index == -1) {//说明delID在房屋数组中不存在
				return false;
			}
			//如果找到 这里需要小伙伴动脑筋
			
				//把index 对应的下标的对象 和index+1的对象进行交换并且（null）制空index+1
				for (int i = index; i < houseNums-1; i++) {//不houseNums-1的话最后一个是没有的  这里也相当于删减
					//这里需要考虑j++ 有变量 有循环 这样就完成循环交替
					house364s[i] = house364s[i+1];
			}
//				house364s[houseNums-1] = null;
//				houseNums--;
		house364s[--houseNums] = null;
		return true;
	}
	
	public House364 lookup(int id) {//改之前返回boolean  改之后返回一个对象
		//int index = -1;
		for (int i = 0; i < houseNums; i++) {
			if (id == house364s[i].getId()) {//如果用户输入的数字等于当前这个数组的下标对应的 编号
				return house364s[i];//就使用index 记录i 这里【i】是一个对象
			}
		}
//		if (index == -1) {
//			System.out.println("没有该房屋");
//			return false;
//		}else{
//		System.out.println(house364s[index]);
//		}	
		return null;
	}
	
//	public House364 Revise (int re) {
//		System.out.print("姓名:"+house364s[re].getName());
//		 house364s[re].getName() = Utility363.readString(8);
//		System.out.print("电话:"+house364s[re].getPhone());
//		String phone = Utility363.readString(12);
//		System.out.print("地址:"+house364s[re].getAddress());
//		String address = Utility363.readString(16);
//		System.out.print("月租:"+house364s[re].getRent());
//		int rent = Utility363.readInt();
//		System.out.print("状态："+house364s[re].getState());
//		String state = Utility363.readString(3);
//		return house364s[re];
//	}
}
