package part01.sec01.exam01; //�ҹ��� �Է��� ���� �빮�ڷ� ��ȯ ��Ű�� ���

import java.util.Scanner;

public class Problem09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch;
		String in, out = "";
		int i, k;
		int diff = 'a' - 'A';
		/*
		 * char ch2=65;
		 * 
		 * System.out.println("ch+diff="+(ch2+32));  ���ڿ� ����Ÿ�������� ���������� ���� ������� ó�� �Ѵ�.
		 */
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		in = s.nextLine();
		k = in.length();

		for (i = 0; i < k; i++) {
			ch = in.charAt(i);
			if (('A' <= ch) && (ch <= 'Z'))
				out += (char) (ch + diff);
			else if (('a' <= ch) && (ch <= 'z'))
				out += (char) (ch - diff);
			else
				out += (char) ch;

		}

		System.out.printf("��ȯ�� ���ڿ�==> %s \n", out);

		s.close();
	}
}
