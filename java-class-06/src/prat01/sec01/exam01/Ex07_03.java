package prat01.sec01.exam01;     //무한 반복 되는 루프 만들기  트루 이용하는 방법

import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.print("더할 첫 번째 수 입력 :");
			a=s.nextInt();
			System.out.print("더할 두 번째 수 입력 :");
			b=s.nextInt();
			
			System.out.printf("%d + %d = %d \n",a,b,a+b);
		s.close();
		}

	}

}
