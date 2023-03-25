package test7;
//8．给定一个 Java 程序的代码如下所示，则编译运行后，输出结果是（10,9,10) 
		public class HomeWork258 {// 共有类 
			 int count =9;//属性
			 public void count1(){//成员方法1
			 count =10;//方法里面的属性 局部作用域
			 System . out . println ("count1="+ count );
			 }
			 public void count2() {//成员方法2
			 System . out . println ("count1="+ count ++);
		}

			 //编写一个 main 方法
			 public static void main ( String args []){
		 //1 new HomeWork258() 创建是匿名对象，因为没有名字（没有p1什么的），所以只能使用一次就销毁了
		 //new HomeWork258().count1();创建号匿名对象后 调用count1方法
			 new HomeWork258().count1();//10 
			 new HomeWork258().count2();//9
			 new HomeWork258().count2();//9
			 System.out.println("调用对象ti如下");
			 //解释为什么上面匿名对象同样调用了两次count2 结果都是9.因为匿名对象创建后只能用一次就销毁了
			 //两次都是创建的新对象 不会在原来基础上使用的所以结果是9
			 
			 HomeWork258 t1= new HomeWork258 ();
			  t1.count2();//9
			  t1.count2();//10
			  //为什么这里是9 ，10
			  //因为第一次调用是先输出9在自增1=10 所以第二次调用时就等于10 还是一样的先输出 再自增1=11
			  //那么同样的道理 第三次调用时就先输出11 再自增1=12
			 }
			 }