package test7;
public class HomeWork256 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Cale c1 = new Cale(10,0);
		Cale c2 = new Cale(12,0);
		int index = c1.chu();//接收c1不满足条件时
		int index2 = c2.chu();//接收c2不满足条件时
		System.out.println("c1情况");
		if(index != -1) {
		System.out.println("c1商="+c1.chu());
		}else {
			System.out.println("0不能作为分母");
		}
		System.out.println("c2情况");
		if(index2 != -1) {
			System.out.println("c2商="+c2.cha());
			}else {
				System.out.print("0不能作为分母");
			}
	}
}

//6．编程创建一个 Cale 计算类，在其中定义2个变量表示两个操作数，
//定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试
class Cale{
	int n1 = 0;
	int n2 = 0;
	public  Cale(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public int he() {//求和
		return this.n1+this.n2;
	}
	public int cha() {//求差
		return this.n1-this.n2;
	}
	public int cheng() {//求乘积
		return this.n1*this.n2;
	}
	public int chu() {//求商
		if(n2!=0) { 
			return this.n1/this.n2;
		}else
		return -1;//返回-1 上面接收
	}
}