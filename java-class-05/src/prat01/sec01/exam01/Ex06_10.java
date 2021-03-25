package prat01.sec01.exam01;

import java.util.Scanner;

public class Ex06_10 {

	//1부터 100까지의 합을 구함,단 키보드로 부터 100을 입력 받음
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b=0;
		int i;
		int a;
		
		
		System.out.printf("숫자를 입력하세요");
		a = s.nextInt();
		
		for(i=1 ; i <= a ;i++){
		b=b+i;
		}
		System.out.printf("1에서 %d까지의 합 :%d \n",a,b);
		
		s.close();
		
	}

}
