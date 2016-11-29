package pat1;
import java.util.ArrayList;
import java.util.List;
/**
 * 读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

	输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。

	输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。

	输入样例：
	1234567890987654321123456789
	输出样例：
	yi san wu

 * @author hc
 *
 */
public class t1002 {
	public static void main(String args[]){
		String []s ={"ling","yi","er","san","si","wu","liu","qi","ba","jiu",};
		List<String> list = new  ArrayList<String>();
		int n=1234567;
		int sum=0;
//		Scanner in = new Scanner(System.in);
//		n=in.nextInt();
		while(n>=1){
			sum+=n%10;
			n/=10;
		}
		while(sum>=1){
			int a=sum%10;
			sum/=10;
		
			list.add(s[a]);

		}
		/*
		 * 从list中往外拿的时候，反着拿，
		 * 第size-1个是最后一个
		 */
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("-----");
		//System.out.println(s[1]);
	}
}
