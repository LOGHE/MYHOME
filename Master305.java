/**
 * 
 */
package p0ly;

/**
 * @author 日暮れて道遠し
 *
 */
public class Master305 {
			private String name;
			
			/**
			 * @param name
			 */
			public Master305(String name) {
				super();
				this.name = name;
			}
			
			/**
			 * @return name
			 */
			public String getName() {
				return name;
			}
			
			/**
			 * @param name 要设置的 name
			 */
			public void setName(String name) {
				this.name = name;
			}
//				//主人给小狗喂食 骨头
//			 public void feed(Dog305 dog305,Bone305 bone305) {
//				System.out.println("主人"+ name + "给"+ dog305.getName()+ "吃"+ bone305.getName());
//			}
//			 public void feed( Cat305 cat305,Fish305 fish305) {
//					System.out.println("主人"+ name + "给"+ cat305.getName()+ "吃"+ fish305.getName());
//				}
			 
			 ////如果动物很多，食物很多
			//===> feed 方法很多，不利于管理和维护
			//Pig --> Rice
			//Tiger ---> meat ... //..
			 
			 //使用多态机制，可以统一的管理主任喂食问题
			 //animal编译类型是Animal 可以只想（接收）Food子类的对象
			 //food 编译类型是Food，可以指向（接收)Food子类的对象
			 public void feed(Animal305 animal305,Food305 food305) {
				 System.out.println("主人"+ name + "给"+ animal305.getName()+ "吃"+ food305.getName());
			}
	}
