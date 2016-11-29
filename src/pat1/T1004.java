package pat1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。

	输入格式：每个测试输入包含1个测试用例，格式为

  	第1行：正整数n
  	第2行：第1个学生的姓名 学号 成绩
  	第3行：第2个学生的姓名 学号 成绩
  	... ... ...
  	第n+1行：第n个学生的姓名 学号 成绩
	其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
	输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。

	输入样例：
	3
	Joe Math990112 89
	Mike CS991301 100
	Mary EE990830 95
	输出样例：
	Mike CS991301
	Joe Math990112
 * @author hc
 *
 */
public class T1004 {

	

	public static void main(String[] args) {
		List<Students> list = new ArrayList<Students>();
		Scanner in= new Scanner(System.in);
		System.out.println("请输入要添加的学生个数：");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println("请依次输入学生的姓名    学号    成绩：");
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
		 * 此处应加个排序，待我明日再改
		 * e,随手改好了，OK！
		 */
		for(int i=0;i<list.size();i++){
			if(list.get(i).score>maxScore){
				maxScore=list.get(i).score;
				num=i;
			}
		}
		
		System.out.println();
		System.out.println("成绩最高的学生信息如下：");
		System.out.println("姓名： "+list.get(num).name+" "+"学号： "+list.get(num).num+" "+"成绩： "+list.get(num).score);

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
