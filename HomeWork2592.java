package test7;
public class HomeWork2592 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();//j = i++  先赋值100给j j=100；再自增+1 i= 101；
		System.out.println(d1.i);//因为上面调用m方法了之后，改变了i的值i=101；
		//注意这里因为不是匿名对象，所以堆里面的值是不会销毁的 还可以接着用
		System.out.println(d2.i);//101
	}
}

class Demo{
	int i = 100;
	void m() {
		int j = i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
	}
}