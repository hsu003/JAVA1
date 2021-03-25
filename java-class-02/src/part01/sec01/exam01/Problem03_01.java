package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_01 {

	public static void main(String[] args) {
		int a;
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 ==>");
		a = s.nextInt();       //String   ==> 문자열을처리 하는 기능
		
		System.out.printf("10진수 ==>%d\n", a);
		System.out.printf("16진수 ==>%X\n", a);
		System.out.printf("8진수 ==>%o\n", a);
		
		s.close();

	}

}
