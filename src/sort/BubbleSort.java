package sort;
/**
 * 排序算法
 * @author hc
 *
 */
public class BubbleSort {
	/*
	 *遍历 
	 */
	public static void show(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	/*
	 * 冒泡排序
	 */
	public static void Bubble_sort(int a[],int n){
		for(int j=1;j<a.length;j++){
			int flag=0;
			for(int i=0;i<a.length-j;i++){  /*一趟交换*/
				if(a[i]>a[i+1]){
					int temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
					flag=1;        //标志发生过交换
				}
			}
			if(flag==0){
				break;        //全程无交换
			}
		}
	}
	/*
	 * 插入排序
	 * 类似于摸牌过程
	 */
	public static void Insertion_sort(int a[],int n){
		for(int j=1;j<a.length;j++){
			int temp=a[j];   /*摸下一张牌*/
			int i;
			for(i=j;i>0&&a[i-1]>temp;i--){
				a[i]=a[i-1];
			}
			a[i]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		//冒泡测试
		int a[]={34,8,64,51,32,21};
		Bubble_sort(a,6);
		System.out.print("冒泡排序结果：");
		show(a);
		
		System.out.println();
		
		//插入测试
		int b[]={34,8,64,51,32,21};
		Insertion_sort(b,6);
		System.out.print("插入排序结果：");
		show(b);
		
		System.out.println();
		
		
	}

}
