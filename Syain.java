/**
 * 
 */
package Kadai11;

/**
 * @author 羅寿合(ラ　ジュゴウ)
 *
 */
public abstract class Syain {
	private String code;
	private String name;
	public Syain(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public abstract void work() ;
}
