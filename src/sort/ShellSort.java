package sort;
/**
 * ϣ������
 * @author hc
 *
 */
public class ShellSort {
	/*
	 * ��������
	 */
	public static void show(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	/*
	 * ԭʼϣ������
	 * �ʱ�临�Ӷ�Ϊnƽ��
	 */
	static int count;
	public static void Shell_sort(int a[],int n){
		for(int d=n/2;d>0;d/=2){   /*ϣ����������*/
			for(int j=d;j<n;j++){		/*��������*/
				int tmp=a[j];
				int i;
				for(i=j;i>=d&&a[i-d]>tmp;i-=d){
					a[i]=a[i-d];
					count++;
				}
				a[i]=tmp;
			}
		}
	}
	/*
	 * ��������
	 */
	public static void Insertion_sort(int a[],int n){
		for(int j=1;j<n;j++){
			int temp=a[j];
			int i;
			for(i=j;i>0&&a[i-1]>temp;i--){
				a[i]=a[i-1];
			}
			a[i]=temp;
		}
	}
	public static void main(String[] args) {
		int a[]={81,94,11,96,12,35,17,95,28,58,41,75,15};
		int n=a.length;
		Shell_sort(a,n);
		//Insertion_sort(a,n);
		System.out.println("ϣ��������:");
		show(a);
		
		System.out.println("\n"+count);
	}

}
