package part01.sex01.exam02;

import java.util.Scanner;      //�����ڰ� �߰��� ��� ������ ���� ���

public class Problem05_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);    //Scanner  ���ڿ��� ó���ϴ� Ŭ����  String  ó���ϴ� ������ ������ ����� �����ϴ�
		int a, b;    //���� 4byet �� �޸𸮿� ����� �̸��� a�� �ض�
		char si;     //

		System.out.printf("ù��° ���� �Է��ϼ��� :");
		a = s.nextInt();
		System.out.printf("����� �����ڸ� �Է��ϼ��� :");
		si = s.next().charAt(0);     //�о�帮�� 0��° ���ڸ� ó�� �ϰڴ�.
		System.out.printf("�ι�° ���� �Է��ϼ��� :");
		b = s.nextInt();
		if (si == '+') {
			System.out.printf("%d + %d =%d �Դϴ� \n", a, b, a + b);
		}
		if (si == '-') {
			System.out.printf("%d - %d =%d �Դϴ� \n", a, b, a - b);
		}
		if (si == '*') {
			System.out.printf("%d * %d = %d �Դϴ�.\n", a, b, a * b);
		}
		if (si == '/') {
			System.out.printf("%d / %d = %2.1f �Դϴ�.\n", a, b, a / (float) b);  //�Ǽ��� �޾� �帮�� ���� a or b ���� �ϳ��� ��ȯ �����ش�.
		}
		if (si == '%') {
			System.out.printf("%d %% %d = %d �Դϴ�.\n", a, b, a % b);
		}
		s.close();
	}

}
