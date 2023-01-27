//演示赋值运算符的使用
public class AssignOperator{
//	编写一个main方法
	public static void main(String[]agrs) {
		
		
/*	+= ，-= ，*= ， /= ，%= 等 , 重点讲解一个 += ，其它的使用是一个道理
			a += b; [等价 a = a + b; ]
				a -= b; [等价 a = a*/
		int n1 = 10;
		n1 +=4;//a += b >> a= a + b;
		System.out.println(n1);//14
		n1 /= 5;
		System.out.println(n1);//2
		
		//复合赋值运算符会进行类型转换 	
		byte b = 3;
		b += 2; //他之所以byte也能通过是因为底层有个类型转换低到高的强制转换为int不过都是整数结果只要在byte区间都一样
		//等同于 b = (byte)(b + 2);
		b++; //  同上 b = (byte)(b+1);
		System.out.println(b);//6
		/*byte b1 = 127;
		b1 += 100;//这里已经超过byte的区间了下面结果就不一样了
		System.out.println(b1);//-6
		应该改为 int b1 = 127;
		b1 += 100;
		System.out.println(b1);//227
		//看下面代码  强制转换
		 ForceConvert{int n1 = (int)1.9;
				System.out.println(n1);//1造成精度损失
				int n2 = 2000;
				byte b1 = (byte)n2;
				System.out.println("b1=" + b1);//造成数据溢出*/
		int b1 = 127;
		b1 += 100;
		System.out.println(b1);//227
		
		double d1 = 10.5;
		d1 -= 5.5;//a = a- b;
		System.out.println(d1);//5.0
		
		double d2 = 2.5;
		d2 *= 4;//d2 = d2 * 2.5
		System.out.println(d2);//10.0
		
		double d3 = 10;
		d3 /=  4.0;//d3 = d3 / 4.0
		System.out.println(d3);//2.5
		
		
	}
	}