package prat01.sec01.exam02;

import java.util.Scanner;

public class Problem06_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a, i;
		int c;

		System.out.print("������ ������ �Է��ϼ��� : ");
		a = s.nextInt();

		if (a <= 0) {
			System.out.println("0���� Ŀ�� �մϴ�. ");
		}
		for (i = a; i > 0; i--) { // �Է��� ���� �ʱ�ȭ �ϰ� ������ ��� �Ұ�� ���������� �������� �ʴ�

			for (c = i; c > 0; c--) {
				System.out.printf("*");
			}
			System.out.printf("\n");

		}

		s.close();

	}
}
