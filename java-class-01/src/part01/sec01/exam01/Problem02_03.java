package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Problem02_03 {

	public static void main(String[] args) throws IOException {
		int a, b;
		int result;
		char i; // ���ں���

		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ����� ���� �Է��ϼ��� ==>");
		a = s.nextInt();
		System.out.println("+ - * / % ==> ");
		i = (char) System.in.read(); // 42==>'*'
		
		System.out.println("�ι�° ����� ���� �Է��ϼ��� ==>");
		b = s.nextInt();

		if (i == '+') {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		}
		if (i == '-') {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		}
		if (i == '*') {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		}
		if (i == '/') {   //==����    !=�����ʴ�
			if (b != 0) {
				result = a / b;
				System.out.println(a + "/" + b + "=" + result);
				
			}else
			System.out.println("0���� ������ �ȵ˴ϴ�.");

		}
		if (i == '%') {   //������
			if (b != 0) {
				result = a % b;
				System.out.println(a + "%" + b + "=" + result);

			}else
			System.out.println("0���� ������ ������ ���� �ȵ˴ϴ�.");

		}

		s.close();
	}

}
