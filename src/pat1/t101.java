package pat1;

import java.util.Scanner;

/**
 * �����Ȳ���
 * ���κ�һ����Ȼ�����������ż������ô�Ͱ�������һ�룬���������������ô�ѣ�3n+1������һ��
 * ����һֱ��������ȥ�����һ����ĳһ���õ�n=1
 * 
 * �Ը�������һ������1000������������Ҫ���ٲ����ܵõ�n=1
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
