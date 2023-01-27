public class Work05{
//	编写一个main方法
	public static void main(String[]agrs) {
		boolean x = true;
		boolean y = false;
		short z = 46;
		if((z++ == 46) && (y = true))z++;// z++ 先赋值比较再自增 46 = 46 为真 自增后为47
//		y=true只是单纯表示把true这个单词付给y和上面x = true没有半毛钱关系。
//		因为上面y= false定义了y为假 这里把true赋值给y是假的，正因为是假的符合了定义 y= true 为真。
//		上面两个都为真所以结果为真 z++再执行 47+1=48 
		
		if((x = false) || (++z == 49)) z++;//把false赋值给x 因为前面x定义为真这里是假的.但因为是短路或其中一个正确就执行结果
//		判断第二个==z 先自增再比较判断 前面z= 48 这里自增为49 所以 49=49 为真  结果为真 执行z++ = 49+1=50
//		所以下面结果输出为50
		System.out.println( "z=" + z);
	}
}