package prat01.sec01.exam02; //�̸� �迭 ���� �Ǵ� �迭1��, ���� ������ ����Ǵ� �迭 1���� ����� ������ ���� ��Ÿ����

								//�迭 6�� �����   ������ 0,1,2

import java.util.Scanner;

public class StuSungjuk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, i;
		

		System.out.print("�л��� ���� �Է� :");
		a = s.nextInt();

		String name[] = new String[a];
		int kor[] = new int[a];
		int eng[] = new int[a];
		int mat[] = new int[a];
		int tot[] = new int[a];
		int rank[] = new int[a];

		for (i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "��° �л��� �̸��� : ");
			name[i] = s.next();
			System.out.print(i + 1 + "��° �л��� �������� : ");
			kor[i] = s.nextInt();
			System.out.print(i + 1 + "��° �л��� �������� : ");
			eng[i] = s.nextInt();
			System.out.print(i + 1 + "��° �л��� �������� : ");
			mat[i] = s.nextInt();
			tot[i] = kor[i] + eng[i] + mat[i];

		}
		for (i = 0; i < name.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < name.length; j++) {
				if (tot[i] < tot[j])
					rank[i]++;
			}
			System.out.println(name[i] + "���� ������" + tot[i] + "���̰�, ������" + rank[i] + "�� �Դϴ�.");
		}

		/*
		 * for(i = 0 ; i < name.length ; i++) {
		 * System.out.println(name[i]+"���� ������"+tot[i]+"���̰�, ������"+rank[i]+"�� �Դϴ�.");
		 * 
		 * }
		 */
		s.close();
	}

}
