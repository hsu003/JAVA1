package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;

		System.out.printf("��������� �Է��ϼ��� :");
		year = s.nextInt();

		switch (year %12) { //  ������ ��� ����� �Ѵ�.(������� �͵� ���� =������� ���� ���� ���� �Ѵ�.)
		case 0:      //ĳ�̽��� ������ �;� �Ѵ�.
			System.out.printf("������ ��");
			break;
		case 1:
			System.out.printf("�� ��");
			break;
		case 2:
			System.out.printf("�� ��");
			break;
		case 3:
			System.out.printf("���� ��");
			break;
		case 4:
			System.out.printf("�� ��");
			break;
		case 5:
			System.out.printf("�� ��");
			break;
		case 6:
			System.out.printf("ȣ���� ��");
			break;
		case 7:
			System.out.printf("�䳢 ��");
			break;
		case 8:
			System.out.printf("�� ��");
			break;
		case 9:
			System.out.printf("�� ��");
			break;
		case 10:
			System.out.printf("�� ��");
			break;
		case 11:
			System.out.printf("�� ��");
			break;   //�귡��ũ�� �ʿ��� ���� ��� �ȴ�.

		}

		s.close();

	}

}
