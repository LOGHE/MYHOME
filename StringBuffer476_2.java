package com.hspedu.string_;


/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class StringBuffer476_2 {
	public static void main(String[] args) {
		//老师的简单明了
		C c = new C();
		c.name();
		
		System.out.println("===================");
		StringBuffer s1 = new StringBuffer();
		String str = "464423.2654";
		s1.append("商品名\t").append("商品价格").append("\n").append("手机\t").append(str);
		int index =  s1.indexOf(".");//.的下标
		int index2 = (s1.indexOf("机")+2);//找到第一个数字的下标
		System.out.println(index);
		System.out.println(index2);
		double d3 = (index-index2)/3.0;//计算.到第一个数字中间有几个3
		//int n3 = (int)d3;
		System.out.println(d3);
		//求出价格小数点前的长度/3，然后循环这么多次 每次循环添加逗号 逗号算数左移3位
		for (int i = 1; i < d3; i++) {//有几个3就循环几次 每次循环把", "插入价格 
			//但是第一个 , 不用插入 所有不是i <= d3;
			int n4 = i*3;
	//这里需要一个变量来改变打印的值  没有的话下面输出 , ,  会连在一起两次循环都默认是3 而不是3，6
			if ( d3 > 1) {//判断 价格至少大于3位数才加 ,
				s1.insert((index -n4), ",");
//				if (d3 % 1 == 0) { 把第一位多出来的 , 删除
//					s1.delete(0, 1);
//				}
			}
		}
		System.out.println(s1);
	}
}
class C{
	String price = "8123564.59";
	public void name() {
	StringBuffer sb = new StringBuffer(price);
	for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
		sb = sb.insert(i, ",");
		}
	System.out.println("商品名\t商品价格\n手机\t"+sb);
		//System.out.println(sb);//8,123,564.59
	}
	
}
