package pat1;
import java.util.ArrayList;
import java.util.List;
/**
 * ����һ����Ȼ��n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�

	�����ʽ��ÿ�������������1��������������������Ȼ��n��ֵ�����ﱣ֤nС��10100��

	�����ʽ����һ�������n�ĸ�λ����֮�͵�ÿһλ��ƴ�����ּ���1 �ո񣬵�һ�������һ��ƴ�����ֺ�û�пո�

	����������
	1234567890987654321123456789
	���������
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
		 * ��list�������õ�ʱ�򣬷����ã�
		 * ��size-1�������һ��
		 */
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("-----");
		//System.out.println(s[1]);
	}
}
