/**
 * 
 */
package com.hspedu.collection_;

/**
 * @author 罗寿合(ラ　ジュゴウ)
 *
 */
public class LinkeList514 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Node rufui = new Node("ルフィ");
		Node soro = new Node("ソロモン");
		Node sannchi = new Node("さんち");
		// rufui->soro->sannchi
		 rufui.nxet = soro ;
		 soro.nxet = sannchi;
		//sannchi->soro->rufui
		sannchi.pre = soro;
		soro.pre = rufui;
		Node first = rufui;
		Node last = sannchi;
		while (true) {
			if (first == null) {
				break;
			}
			System.out.println(first);
			first = first.nxet;//这个条件不加会无限循环
		}
		//到过来打印
		System.out.println("=============");
		while (true) {
			if (last == null) {
				break;
			}
			System.out.println(last);
			last = last.pre;//这个条件不加会无限循环
		}
		System.out.println("2-3之间插入luo");
		//2-3之间插入luo
		//让luo 前后分别指向soro，sannchi
		//然后再改变soro后面（next)指向luo。  sannchi前面(pre)指向luo
		Node luo = new Node("罗");
		luo.nxet = sannchi;
		luo.pre = soro;
		soro.nxet = luo;
		sannchi.pre = luo;
		//头到尾遍历，需要再让first 再一次指向rufui表示开头 头结点
		//反之 尾到头遍历，需要再让last 再一次指向sanchi表示尾巴 尾结点
		 first = rufui;
		while (true) {
			if (first == null) {
				break;
			}
			System.out.println(first);
			first = first.nxet;
		}
	}

}

class Node{
	public Object item;//存放数据
	public Node nxet;//指向后一个结点
	public Node pre;//指向前一个结点
	public Node(Object name) {
		// TODO 自动生成的构造函数存根
		this.item = name;
	}
	@Override
	public String toString() {
		return "Node name=" + item ;
	}
	
}