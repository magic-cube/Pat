package t;

import java.io.PrintStream;

/*
 * 要求输出结果只有:
 * a=100
 * b=200
 */
public class Demo01 {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		method1(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	static void method1(int a,int b){
		PrintStream myStream=new PrintStream(System.out){
			public void println(String x){
				if(x.equals("a=10")){
					x="a=100";
				}else if(x.equals("b=10")){
					x="b=200";
				}
				super.println(x);
			}
		};
		System.setOut(myStream);
	}
	static void method(int a,int b){
		System.out.println("a=100");
		System.out.println("b=200");
		System.exit(0);
	}
}
