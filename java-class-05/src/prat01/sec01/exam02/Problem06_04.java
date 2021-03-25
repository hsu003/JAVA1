package prat01.sec01.exam02;

import java.util.Scanner;

public class Problem06_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a, i;
		int c;

		System.out.print("임의의 정수를 입력하세요 : ");
		a = s.nextInt();

		if (a <= 0) {
			System.out.println("0보다 커야 합니다. ");
		}
		for (i = a; i > 0; i--) { // 입력한 값을 초기화 하고 변수로 사용 할경우 문법적으로 가능하지 않다

			for (c = i; c > 0; c--) {
				System.out.printf("*");
			}
			System.out.printf("\n");

		}

		s.close();

	}
}
