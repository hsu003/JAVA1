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

	public static void disp() { // ��ȯ ���� �޴� ���� ���� ���
		System.out.println("Java method studying...");

	}

	public static void output(int a, int b, int c) { // ��ȯ ���� ������ �޴°��� �ִ� ���
		System.out.printf("%d + %d = %d \n", a, b, c);
	}

	public static int hap(int a, int b) { // ��ȯ���� ������ �޴� ���� ���� ���
		return a + b;
	}

	public static int input() { // ��ȯ���� �޴°��� �ִ� ���
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �Է� :");
		int su = s.nextInt();
		return su;
	}

}
