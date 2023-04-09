/**
 * 
 */
package com.hspedu.houserent.view;
import com.hspedu.houserent.domain.House364;
import com.hspedu.houserent.service.HouseService366;
import com.hspedu.houserent.utils.Utility363;
/**
 * 1显示界面
 * 2接收用户输入
 * 3调用HouseService完成对房屋的各种操作
 *
 */
//界面总结
//1 编写mainMenu方法，可以显示主菜单
//2 编写lisHouse()界面,显示房屋列表
//3 编写addHouse() 界面，显示添加房屋  接收用户输入，（先创建House对象，调用add方法）这样用户就能添加房源了
//4 编写delHouse();界面 接收用户输入id数字 删除房源
//5 编写lookupHouse()界面 接收用户输入 
//6 编写Revise()；界面 接收用户输入 修改房源
public class HouseView365 {
	private boolean loop = true;//控制显示菜单
	private char key = ' ';//接收用户输入
	private HouseService366 houseService366 = new HouseService366(10);//设置数组的大小为十
//	1显示主菜单
	public void mainMenu() {
		do {
		System.out.println("\n");
		System.out.println("------------房屋出租系统------------");
		System.out.println("\t"+"1新增房源");
		System.out.println("\t"+"2查找房源");
		System.out.println("\t"+"3删除房源");
		System.out.println("\t"+"4修改房屋信息");
		System.out.println("\t"+"5房屋列表");
		System.out.println("\t"+"6退\t出");
		System.out.println("请输入选项1-6");
		key = Utility363.readChar();
		switch (key) {
		case '1': {
			addHouse();
			break;
		}
		case '2': {
			lookupHouse();
			break;
		}
		case '3': {
			delHouse();
			break;
		}
		case '4': {
			Revise();
			break;
		}
		case '5': {
			listHouse();
			break;
		}
		case '6': {
			exit();
			break;
		}
		default:
			System.out.println("请正确输入y/n");
		}
		
		} while (loop);
	}
	public void listHouse() {//显示房屋列表
		System.out.println("----------------------房屋列表----------------------");
		System.out.println("编号\t"+"房主\t"+"电话\t"+"地址\t"+"月租\t"+"状态(未出租/已出租)");
		
		House364[] house364s = houseService366.lise();//得到所有房屋信息
		for (int i = 0; i < house364s.length; i++) {//这里会有9个null显示那么就行限定
			if (house364s[i] == null) {
				break;
			}
			System.out.println(house364s[i]);
		}
		System.out.println("----------------------房屋列表完成-------------------");
	}
	//编写addHouse()接收输入，创建House对象，调用add方法
	public void addHouse() {
		System.out.println("----------------------添加房屋----------------------");
		System.out.print("姓名:");
		String name = Utility363.readString(8);
		System.out.print("电话:");
		String phone = Utility363.readString(12);
		System.out.print("地址:");
		String address = Utility363.readString(16);
		System.out.print("月租:");
		int rent = Utility363.readInt();
		System.out.print("状态：");
		String state = Utility363.readString(3);
		House364 house364 = new House364(0, name, phone, address, rent, state);
		if (houseService366.add(house364)) {//对上面却款进行限定 合格就输出 不合格则显示添加不成功
			System.out.println("----------------------添加房屋成功----------------------");
		}else {
			System.out.println("----------------------添加房屋失败----------------------");
		}
	}
	
	//编写delHouse()；界面，接收用户输入id删除
	public void delHouse() {
		System.out.println("----------------------删除房屋----------------------");
		System.out.print("请输入待删除房屋的编号(-1退出)");
		 int del = Utility363.readInt();
		 if (del == -1) {
			System.out.println("你放弃了删除房屋");
			return;
		}
		char choice =  Utility363.readConfirmSelection();
		if (choice == 'Y') {//这里就准备调用Se..的方法
			if (houseService366.del(del)) {
				System.out.println("----------------------删除房屋信息成功----------------------");
			}else {
				System.out.println("----------------------房屋编号不存在，删除失败----------------------");
			}
		}else {
			System.out.println("----------------------删除房屋----------------------");
		}
	}
	
	//退出界面
		public void exit() {
			//接收用户是否退出
			//while (true) {
				System.out.println("你确定退出吗？Y/N");
				char choice  =  Utility363.readConfirmSelection();//如果用户不输入正确的那么系统一直陪你玩
				//if ('Y'== choice||'N' == choice) {
				//break;
				//}
			//}
			//当用户退出while后 进行判断
			if (choice == 'Y') {
				loop = false;
			}
		
		}
		public void lookupHouse() {
			//System.out.print("请选择(1-6):");
			System.out.println("----------------------查找房源----------------------");
			System.out.print("请输入你要找的id:");
			 int id = Utility363.readInt();
			 //调用查找房屋数组下标
			// houseService366.lookup(id);
			House364 house364 = houseService366.lookup(id);
			if (house364 != null) {
				System.out.println(house364);
			}else {
				System.out.println("\"----------------------没有查找到----------------------\"");
			}
		}
		
		public void Revise() {
			System.out.println("----------------------修改房源----------------------");
			System.out.println("请选择修改房源编号(-1)退出：");
			 int iddel = Utility363.readInt();
			 if (iddel == -1) {
				System.out.println("你放弃了删除房屋");
				return;
			}
			 //下面这两步骤很关键 决定下面的house364.getName()为不为空
			House364 house364h =  houseService366.lookup(iddel);
			if (house364h == null) {//排除了为空的选项
				System.out.println("--------------你要修改的房屋信息编号不存在----------");
				return;
			}
			//加入条件用户不想修改就回车
					System.out.print("姓名:"+house364h.getName());
					String name = Utility363.readString(8,"");//如果这里回车就表示不修改该信息
					if (!"".equals(name)) {//如果输入取反 不为空（回车）
						house364h.setName(name);
					}
					
					System.out.print("电话:"+house364h.getPhone());
					String phone = Utility363.readString(12,"");//如果这里回车就表示不修改该信息
					if (!"".equals(phone)) {//如果输入取反 不为空（回车）
						house364h.setPhone(phone);
					}
					System.out.print("地址:"+house364h.getAddress());
					String address = Utility363.readString(18,"");//如果这里回车就表示不修改该信息
					if (!"".equals(address)) {//如果输入取反 不为空（回车）
						house364h.setAddress(address);
					}
					System.out.print("月租:"+house364h.getRent());
					int rent = Utility363.readInt(-1);
					if (rent != -1) {
						house364h.setRent(rent);
					}
					
					System.out.print("状态："+house364h.getState());
					//String state = Utility363.readString(3);
					String state = Utility363.readString(3,"");//如果这里回车就表示不修改该信息
					if (!"".equals(state)) {//如果输入取反 不为空（回车）
						house364h.setState(state);
					}
					System.out.println("--------------修改房屋信息成功----------");
		}
}
