package pat1;

import java.util.Scanner;

/**
 * 卡拉兹猜想
 * 对任何一个自然数，如果他是偶数，那么就把它砍掉一半，如果他是奇数，那么把（3n+1）砍掉一半
 * 这样一直反复砍下去，最后一定在某一步得到n=1
 * 
 * 对给定的任一不超过1000的正整数，需要多少步才能得到n=1
 * @author hc
 *
 */
public class t101 {

	public static void main(String[] args) {
		int n=0;
		int count =0;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		do{
			if(n%2==0){
				n/=2;
				count++;
			}else{
				n=(3*n+1)/2;
				count++;
			}
		}while(n!=1);
		System.out.println(count);
	}

}
