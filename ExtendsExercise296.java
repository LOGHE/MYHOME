/**
 * 
 */
package test8;

/**
 * @author 日暮れて道遠し
 *
 */
public class ExtendsExercise296 {
public static void main(String[] args) {
	PC pc = new PC(" soni");//给子类1 品牌赋值
	NotePad notePad = new NotePad(" 黑色 ");//给子类2颜色赋值
	System.out.println(notePad.info()+pc.info());
	
}
}

class Computer{//父类 
	//三个属性
	private String CPU;
	private String neicun;
	private String yinpan;
	public Computer() {//生成无参构造器
		// TODO 自动生成的构造函数存根
	}
	public Computer( String CPU,String neicun,String yinpan) {
		//构造器改变属性
		this.CPU = CPU;
		this.neicun = neicun;
		this.yinpan = yinpan;
		// TODO 自动生成的构造函数存根
	}
	public String info() {
		//输出 三个属性信息
		return "CPU"+CPU+"  neicun "+neicun+"  yinpan "+yinpan;
	}
}

class PC extends Computer{//子类1
	//创建一个属性
	private String burando;
	/**
	 * 
	 */
	public PC() {
		// TODO 自动生成的构造函数存根
	}
	public PC(String burando) {
		//创建构造器保存属性
		// TODO 自动生成的构造函数存根
		//super("i7","8gb","1TB");//给父类构造器赋值
		this.burando = burando;//保存属性品牌
	}	
	public String info() {
		//方法返回子类1品牌
//		return  info()+"burando="+burando;//super("i7","8gb","1TB");
		return  "burando="+burando;
		
	}
}
class NotePad extends Computer{
	private String color ;
	/**
	 * 
	 */
	/**
	 * 
	 */
	public NotePad() {
		
		// TODO 自动生成的构造函数存根
	}
	public NotePad(String color) {
		//给父类构造器中三个属性赋值
		super("i7","8gb","1TB");
		// TODO 自动生成的构造函数存根
		//创建构造器颜色
		this.color=color;
	}
	public String info() {
		//返回子类2  输出父类的info 和子类2的颜色
		return super.info()+" color=" +color;
		//当子类中 有和父类方法  属性或者成员重名时 使用关键词super访问
		
	}
}