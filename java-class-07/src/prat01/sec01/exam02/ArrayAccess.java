package prat01.sec01.exam02;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// int Array �迭 ��. ũ�Ⱑ 5��
		int[] intArray = new int[5];
		int max = 0;
		int i;

		for (i = 0; i < 5; i++) {

			intArray[i] = s.nextInt();

			if (intArray[i] > max) {
				max = intArray[i];
			}

		}
		System.out.println("�Էµ� ������ ���� ū ����" + max + "�Դϴ�.");
		s.close();
	}

}
