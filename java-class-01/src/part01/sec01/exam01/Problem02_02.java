package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_02 {

	public static void main(String[] args) {
		int a, b, c;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ����� ���� �Է��ϼ���==>");
		a = s.nextInt();
		System.out.println("<1>����<2>����<3>����<4>������==>");
		b = s.nextInt();
		System.out.println("�ι�° ����� ���� �Է��ϼ���==>");
		c = s.nextInt();

		if (b == 1) {
			result = a + c;
			System.out.println(a + "+" + c + "=" + result);

		}
		if (b == 2) {
			result = a - c;
			System.out.println(a + "-" + c + "=" + result);

		}
		if (b == 3) {
			result = a * c;
			System.out.println(a + "*" + c + "=" + result);
		}
		if (b == 4) {
			result = a / c;
			System.out.println(a + "/" + c + "=" + result);
		}

		s.close();

	}

}
