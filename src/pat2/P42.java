package pat2;

import java.util.Scanner;

public class P42 {

	public static int sum(int list[],int n){
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=list[i];
		}
		return sum;
	}
		
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int list[] = new int[n];
		for(int i=0;i<n;i++){
			list[i]=in.nextInt();
		}
		System.out.println(sum(list,n));
	}

}
