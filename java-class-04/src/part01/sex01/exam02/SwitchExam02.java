package part01.sex01.exam02;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		char gender = ' '; // ���ڴ� ������ �ʿ��ϴ�
		String regNo = ""; // ���ڿ� ó���ϴ� ��� ���ڿ��� �������൵ �����ϴ�

		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. (011231-1222222)>");

		Scanner s = new Scanner(System.in);
		regNo = s.nextLine(); // ���� ������ ������ ������ ���

		gender = regNo.charAt(7);    // charAt �� ���� ������ ������ ���� ���� �ִ°�
		switch (gender) {
		case '1':
		case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.printf("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}

		s.close();

	}

}
