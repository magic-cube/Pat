package t;
/*
 * 百马百担问题
 * 有一百匹马，一百个包袱，大马驮三个，中马驮俩，两个小马驮一个
 * 问：有多少匹大马，多少匹中马，多少匹小马
 * 
 */
public class Hourse {
	public static void f(){
		
		for(int b=0;b<=33;b++){           //外层循环控制大马的数量
			for(int m=0;m<=50;m++){
				int s=100-b-m;           	//小马数量收到大马和中马的限制
				if(b*3+m*2+s*0.5==100){
					System.out.println("大马："+b+"中马："+m+"小马："+s);
				}
			}
		}
	}
	public static void main(String[] args) {
		f();
	}

}
