package part01.sex01.exam02;

import java.util.Scanner;

public class Problem05_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;
		String[] str; // ���ִ°��� ���� ���� �̴�.   �迭�� �ݵ�� []�� ģ��.

		System.out.printf(" ������ ���ٷ� ����� �Է��ϼ��� : ");
		str = s.nextLine().split(" ");  //" ",# ������ �Ǵ� �ٸ����� �־  ������ ����   

		a = Integer.parseInt(str[0]); // str 0��° ���ڸ� �����ͼ� �о��    ���ڸ� ���ڷ� �о�� �Ҷ� ���� ��ɾ�
		ch = str[1].charAt(0); // charAt(0)�� ������ ù��° �����ڸ� �Էµȴ�. str �Էõ� ���� 0.1.2.3.4.5.6.7.8.9
		b = Integer.parseInt(str[2]); // str 2��° ���ڸ� �����ͼ� �о�� str �о�帮�� ���� 1.2.3.4.5.6.7.8.9.0

		switch (ch) { // byte,short, char, int,String �� �����ϴ�
		case '+':
			System.out.printf("%d %c %d= %d �Դϴ�.\n", a, ch, b, a + b);
			break;
		case '-':
			System.out.printf("%d %c %d= %d �Դϴ�.\n", a, ch, b, a - b);

			break;
		case '*':
			System.out.printf("%d %c %d= %d �Դϴ�.\n", a, ch, b, a * b);

			break;
		case '/':
			System.out.printf("%d %c %d= %2.1f �Դϴ�.\n", a, ch, b, a / (float) b);

			break;
		case '%':
			System.out.printf("%d %c %d= %d �Դϴ�.\n", a, ch, b, a % b);

			break;
		default:
			System.out.printf("�����ڸ� �߸� �Է� �ϼ̽��ϴ�.\n");
		}

		s.close();
	}

}
