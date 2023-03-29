/**
 * 
 */
package com.hspedu.extend;

/**
 * @author 日暮れて道遠し
 *
 */
public class Computer296 {
	private String CPU;
	private int neicun;
	private int yinpan;
	
	/**
	 * @param cPU
	 * @param neicun
	 * @param yinpan
	 */
	public Computer296(String cPU, int neicun, int yinpan) {
		super();
		CPU = cPU;
		this.neicun = neicun;
		this.yinpan = yinpan;
	}
	/**
	 * @return cPU
	 */
	public String getCPU() {
		return CPU;
	}
	/**
	 * @param cPU 要设置的 cPU
	 */
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	/**
	 * @return neicun
	 */
	public int getNeicun() {
		return neicun;
	}
	/**
	 * @param neicun 要设置的 neicun
	 */
	public void setNeicun(int neicun) {
		this.neicun = neicun;
	}
	/**
	 * @return yinpan
	 */
	public int getYinpan() {
		return yinpan;
	}
	/**
	 * @param yinpan 要设置的 yinpan
	 */
	public void setYinpan(int yinpan) {
		this.yinpan = yinpan;
	}
	public String info() {
		return "CPU= "+getCPU()+" neicun= "+neicun+"gb yingpan="+getYinpan()+"gb";
	}
	
	
}
