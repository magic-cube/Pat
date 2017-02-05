package t;

import org.junit.Test;

/**
 * 测试首字母大写的转换
 * @author hc
 *
 */
public class ToUpperCase {
	public static void main(String[] args) {
		String s="abc";
		String s2=s.toUpperCase().substring(0, 1)+s.substring(1);
		System.out.println(s2);
	}
	
	@Test
	public void test(){
		StringBuilder sb=new StringBuilder("abc");
		sb.setCharAt(0, 'A');
		System.out.println(sb.toString());
	}
}
