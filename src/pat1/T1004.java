package pat1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ����n��ѧ����������ѧ�š��ɼ����ֱ�����ɼ���ߺͳɼ����ѧ����������ѧ�š�

	�����ʽ��ÿ�������������1��������������ʽΪ

  	��1�У�������n
  	��2�У���1��ѧ�������� ѧ�� �ɼ�
  	��3�У���2��ѧ�������� ѧ�� �ɼ�
  	... ... ...
  	��n+1�У���n��ѧ�������� ѧ�� �ɼ�
	����������ѧ�ž�Ϊ������10���ַ����ַ������ɼ�Ϊ0��100֮���һ�����������ﱣ֤��һ�����������û������ѧ���ĳɼ�����ͬ�ġ�
	�����ʽ����ÿ�������������2�У���1���ǳɼ����ѧ����������ѧ�ţ���2���ǳɼ����ѧ����������ѧ�ţ��ַ�������1�ո�

	����������
	3
	Joe Math990112 89
	Mike CS991301 100
	Mary EE990830 95
	���������
	Mike CS991301
	Joe Math990112
 * @author hc
 *
 */
public class T1004 {

	

	public static void main(String[] args) {
		List<Students> list = new ArrayList<Students>();
		Scanner in= new Scanner(System.in);
		System.out.println("������Ҫ��ӵ�ѧ��������");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println("����������ѧ��������    ѧ��    �ɼ���");
			String name=in.next();
			String num=in.next();
			int score=in.nextInt();
			Students s= new Students(name,num,score);
			list.add(s);
		}
//		for(Students s:list){
//			System.out.println(s.score);
//		}
		int num = 0;
		int maxScore=-1;
		/*
		 * �˴�Ӧ�Ӹ����򣬴��������ٸ�
		 * e,���ָĺ��ˣ�OK��
		 */
		for(int i=0;i<list.size();i++){
			if(list.get(i).score>maxScore){
				maxScore=list.get(i).score;
				num=i;
			}
		}
		
		System.out.println();
		System.out.println("�ɼ���ߵ�ѧ����Ϣ���£�");
		System.out.println("������ "+list.get(num).name+" "+"ѧ�ţ� "+list.get(num).num+" "+"�ɼ��� "+list.get(num).score);

	}

}
class Students{
	String name;
	String num;
	int score;
	public Students() {
	
	}
	public Students(String name, String num, int score) {
		super();
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
}
