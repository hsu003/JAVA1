package prat01.sec01.exam01;

import java.util.Scanner;

public class Problem07_03 {

	public static void main(String[] args) { // ���ǰ��� �Է��� ����ŭ *����� �ϱ�
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int star;
		int i, k;

		System.out.printf("���ڸ� ���� �� �Է� : ");
		str = s.nextLine();

		i = 0;
		ch = str.charAt(i);

		while (true) {                    // '0'==>48~ '9' ==>57
			star = (int) ch - 48;

			for (k = 0; k < star; k++)
				System.out.printf("*");
			System.out.println("\n");

			if (++i >= str.length()) // -1�� ó���ؼ� ������� �ϼ��ص� �ȴ�.
										// i�� ��Ȱ�� ���ڰ� ����Ǿ� �ִ� ��ġ length �� ��Ȱ�� ������ ����
				break;
			ch = str.charAt(i); // a++���� ���������� a-- �������������� ���� ����.

		}
		s.close();
	}

}
