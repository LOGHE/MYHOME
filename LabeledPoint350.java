/**
 * 
 */
package com.hspedu.homework_346___;

/**
 * @author 日暮れて道遠し
 *
 */
public class LabeledPoint350 extends Point350 {
	

	public LabeledPoint350(String labeled,double x, double y) {
		super(x, y);
		this.labeled = labeled;
	}

	private String labeled;

	

	public String getLabeled() {
		return labeled;
	}

	public void setLabeled(String labeled) {
		this.labeled = labeled;
	}
	
}
