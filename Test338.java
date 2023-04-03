/**
 * 
 */
package test8;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 日暮れて道遠し
 *
 */
public class Test338 {
	    public static void main(String[] args) {
	        // 获取当前时间
	    	Date date = null;
	         date = new Date();
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	        // 打印当前时间
	        System.out.println(date);
	    }
	}

