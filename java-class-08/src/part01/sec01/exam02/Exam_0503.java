package part01.sec01.exam02;          //메소드 호출의 원리가 되는 기본적인 문제

import java.util.Scanner;

public class Exam_0503 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int sum = hap(num);
		
		System.out.println("1~n 까지의 합 : "+sum);
		//System.out.printf("1 ~ %d 까지의 합 : %d",num,sum);

	}
	
	public static int hap(int n) {
		if(n==1)
			return 1;
		int tot=n+hap(n-1);     //재귀 호출 : 자기 자신을 호출 한다고 해서 재귀 호출 
		                       // 어떠한 메소드가 다른 메소드를 호출 했을때 남아있는 값이 있으면 실행이 된후 호출이 된다.
		return tot;
		
		/*
		 * int hap=0; 
		 * for(int i = 0; i <= n; i++) {
		 *  hap+=i; 
		 *  } return hap;
		 */
	}

}
