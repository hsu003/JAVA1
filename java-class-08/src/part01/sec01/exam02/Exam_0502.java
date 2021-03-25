package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_0502 {

	public static void main(String[] args) {
		int su1 = input();
		int su2 = input();

		int sum = hap(su1, su2);

		output(su1, su2, sum);

		disp();

	}

	public static void disp() { // 반환 값과 받는 값이 없는 경우
		System.out.println("Java method studying...");

	}

	public static void output(int a, int b, int c) { // 반환 값은 없지만 받는값이 있는 경우
		System.out.printf("%d + %d = %d \n", a, b, c);
	}

	public static int hap(int a, int b) { // 반환값은 있지만 받는 값이 없는 경우
		return a + b;
	}

	public static int input() { // 반환값과 받는값이 있는 경우
		Scanner s = new Scanner(System.in);
		System.out.printf("수를 입력 :");
		int su = s.nextInt();
		return su;
	}

}
