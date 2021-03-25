package prat01.sec01.exam01;      //구구단 출력

import java.util.Scanner;

public class Ex06_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		int b;
		
		System.out.print("몇 단 ?");
		b = s.nextInt();
		
		for(i = 1 ; i <= 9; i++) {     //한번 쓰고 말 변수는 굳이 또하나를 만들 필요는 없다.
			System.out.printf("%d X %d = %d\n",b,i,b*i);
		}
		
		s.close();

	}

}
