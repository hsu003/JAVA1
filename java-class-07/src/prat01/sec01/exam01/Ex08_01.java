package prat01.sec01.exam01;

import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b,c,d;
		int hap;
		
		System.out.print("1번째 숫자를 입력하세요 : \n");
		a=s.nextInt();
		System.out.print("2번째 숫자를 입력하세요 : \n");
		b=s.nextInt();
		System.out.print("3번째 숫자를 입력하세요 : \n");
		c=s.nextInt();
		System.out.print("4번째 숫자를 입력하세요 : \n");
		d=s.nextInt();
		
		hap=a+b+c+d;
		
		System.out.printf("합계 ==> %d\n",hap);
		
		
		s.close();
		

	}

}
