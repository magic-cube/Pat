package sort;
/**
 * 希尔排序
 * @author hc
 *
 */
public class ShellSort {
	/*
	 * 遍历数组
	 */
	public static void show(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	/*
	 * 原始希尔排序
	 * 最坏时间复杂度为n平方
	 */
	static int count;
	public static void Shell_sort(int a[],int n){
		for(int d=n/2;d>0;d/=2){   /*希尔增量序列*/
			for(int j=d;j<n;j++){		/*插入排序*/
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
	 * 插入排序
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
		System.out.println("希尔排序结果:");
		show(a);
		
		System.out.println("\n"+count);
	}

}
