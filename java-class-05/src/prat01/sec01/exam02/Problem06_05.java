package prat01.sec01.exam02;

import java.io.IOException;
import java.io.InputStreamReader;

public class Problem06_05 {

	public static void main(String[] args) {
		InputStreamReader s = new InputStreamReader(System.in);
		char lowerBoind;

		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ��� :");
		char c = 0;

		try {
			c = (char) s.read(); // ���� �ϳ��� �о ���ڷ� ĳ���� �Ͽ�

		} catch (IOException e) { // ĳġ �Ͽ� IOException ���� ó�� �ض�
			System.out.println("Ű���� �Է� �� ������ �߻��߽��ϴ�. ");
		}

		if ((c < 'a' || c > 'z') && (c < 'C' || c > 'Z')) {
			System.out.println("���ĺ� ������ �ƴմϴ�. ");
		}
		if (c >= 'a' && c <= 'z')
			lowerBoind = 'a';
		else {
			lowerBoind = 'A';
		}
		
		for (char i = c; i >= lowerBoind; i--) {
			for (char b = lowerBoind; b <= i; b++) {
				System.out.print(b);     //��°��� ������ ������ ���� �ؾ� ���� ���ϰ��� �ϴ� ���� ���´�.

			}
			System.out.println();

		}

	}
}
