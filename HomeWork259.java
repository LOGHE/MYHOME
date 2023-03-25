package test7;
public class HomeWork259 {
	//编写一个 main 方法
	public static void main(String[] args) {
		Music music = new Music("@時の魔法@", 3);
		music.play();
		System.out.println(music.getinfo());
	}
}
//9.定义 Music 类，里面有音乐名 name 、音乐时长 times 属性，
//并有播放 play 功能和返回本身属性信息的功能方法 getinfo 

class Music{
	String name;
	int times;
	public  Music(String name,int times) {
		this.name = name;
		this.times = times;
	}
	public void play() {//bofang
		System.out.println("您点的"+name +"歌曲正在播放中.....时长为"+times);
	}
	public String getinfo() {//返回
		return "音乐" +name + "  "+ "时长" + times;
	}
}