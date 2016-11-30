package t;
/**
 * 后缀的++ 与八进制问题
 * 八进制Octal 
 * 一些编程语言中，常常以0（零）开始表明该数字是八进制
 * 被坑过，很烦。。。  目前我已知c c++ java 均这样表示
 * @author hc
 *
 */
public class Zhuyi {

	public static void main(String[] args) {
		int i=010;
		int j=10;
		System.out.println((i++)+" "+(j++));
	}

}
