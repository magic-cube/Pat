package sort;
/**
 * �����㷨
 * @author hc
 *
 */
public class BubbleSort {
	/*
	 *���� 
	 */
	public static void show(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	/*
	 * ð������
	 */
	public static void Bubble_sort(int a[],int n){
		for(int j=1;j<a.length;j++){
			int flag=0;
			for(int i=0;i<a.length-j;i++){  /*һ�˽���*/
				if(a[i]>a[i+1]){
					int temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
					flag=1;        //��־����������
				}
			}
			if(flag==0){
				break;        //ȫ���޽���
			}
		}
	}
	/*
	 * ��������
	 * ���������ƹ���
	 */
	public static void Insertion_sort(int a[],int n){
		for(int j=1;j<a.length;j++){
			int temp=a[j];   /*����һ����*/
			int i;
			for(i=j;i>0&&a[i-1]>temp;i--){
				a[i]=a[i-1];
			}
			a[i]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		//ð�ݲ���
		int a[]={34,8,64,51,32,21};
		Bubble_sort(a,6);
		System.out.print("ð����������");
		show(a);
		
		System.out.println();
		
		//�������
		int b[]={34,8,64,51,32,21};
		Insertion_sort(b,6);
		System.out.print("������������");
		show(b);
		
		System.out.println();
		
		
	}

}
