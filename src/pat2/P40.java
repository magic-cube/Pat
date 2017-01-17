package pat2;

import java.util.Scanner;

public class P40 {
	
	public static void PrintN(int n){
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		PrintN(n);
	}
}
