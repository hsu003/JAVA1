package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a;
		
		System.out.println("정수를 입력하세요:\n");
		a = s.nextInt();
		
		if(a%2==0) {
			System.out.println("짝수를 입력 했군요.");
		}
		
		else {
			System.out.println("홀수를 입력 했군요.");
		
		}
		
		s.close();

	}

}
