/**
 * 
 */
package p0ly;

/**
 * @author 日暮れて道遠し
 *
 */
public class Poly305 {
		public static void main(String[] args) {
			Master305 tom = new Master305("汤姆~");
			Dog305 dog305 = new Dog305("大黄~");
			Bone305 bone305 = new Bone305("大棒骨~");
			tom.feed(dog305, bone305);
			
			Cat305 cat305 = new Cat305("大橘~");
			Fish305 fish305 = new Fish305("大黄鱼~");
			tom.feed(cat305, fish305);
			
			System.out.println("给小猪为米饭");
			//给小猪添加
			Animal305 animal305 = new Pig("八戒");
			Food305 food305 = new Rice("rice");
			tom.feed(animal305, food305);
		}
}
