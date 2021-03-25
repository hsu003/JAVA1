package prat01.sec01.exam01;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] a = new int[4];
		//int a,b,c,d;
		int hap;
		
		System.out.print("1번째 숫자를 입력하세요 : ");
		a[0]=s.nextInt();
		System.out.print("2번째 숫자를 입력하세요 : ");
		a[1]=s.nextInt();
		System.out.print("3번째 숫자를 입력하세요 : ");
		a[2]=s.nextInt();
		System.out.print("4번째 숫자를 입력하세요 : ");
		a[3]=s.nextInt();
		
		hap=a[0]+a[1]+a[2]+a[3];
		
		System.out.printf("합계 ==> %d\n",hap);
		
		
		s.close();
		

	}

}
