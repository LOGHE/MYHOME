package test1;
public class Homeword147{
	//编写一个main方法
	public static void main(String[]agrs) {
		//先化繁为简
		//1先定义double i=100000块钱 再定义一个int n = 0 表示交的次数
		//再创建循环，循环中加入条件 当钱i>50000时交5%的钱 当 i <= 50000时 每次交1000
		
	double d  = 100000,a = 50000, b = 1000;//表示总金额
	int i = 0;//表示次数
	while(true) {
		if(d > a) {
			d *= 0.95;//表示大于50000时的递减
			//System.out.println();
			i++;//记录递减次数，每减一次就加1 表示次数
		}else if(d <= a&&d >=b) {
			d -= b;//表示大于1000小于50000时的递减
			//System.out.println(d -=1000);
			i++;//记录递减次数 每减一次就加1
		}else {
			break;
		}
		
	}
	System.out.println(i);//因为i 可以叠加这里不需要i + i  前面终止 后面书接上文继续叠加i
	}
	}