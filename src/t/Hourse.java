package t;
/*
 * ����ٵ�����
 * ��һ��ƥ��һ�ٸ���������������������������������С����һ��
 * �ʣ��ж���ƥ��������ƥ��������ƥС��
 * 
 */
public class Hourse {
	public static void f(){
		
		for(int b=0;b<=33;b++){           //���ѭ�����ƴ��������
			for(int m=0;m<=50;m++){
				int s=100-b-m;           	//С�������յ���������������
				if(b*3+m*2+s*0.5==100){
					System.out.println("����"+b+"����"+m+"С��"+s);
				}
			}
		}
	}
	public static void main(String[] args) {
		f();
	}

}
