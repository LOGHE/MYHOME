/**
 * 
 */
package com.hspedu.extend;

import java.lang.ProcessHandle.Info;

/**
 * @author 日暮れて道遠し
 *
 */
public class PC extends Computer296 {
	private String brand ;
	

	/**
	 * @param cPU
	 * @param neicun
	 * @param yinpan
	 * @param brand
	 */
	
	public PC(String cPU, int neicun, int yinpan, String brand) {
		super("i7", 8, 1);
		this.brand = brand;
	}

	/**
	 * @param cPU
	 * @param neicun
	 * @param yinpan
	 */
	public PC(String cPU, int neicun, int yinpan) {
		super(cPU, neicun, yinpan);
	}

	/**
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand 要设置的 brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void printinfo() {
		System.out.println("电脑的基本信息如下===");
		System.out.println(info()+"品牌 = "+brand);
	}
	
}
