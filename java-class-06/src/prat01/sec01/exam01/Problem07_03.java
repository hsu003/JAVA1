package prat01.sec01.exam01;

import java.util.Scanner;

public class Problem07_03 {

	public static void main(String[] args) { // 임의값을 입력한 수만큼 *생기게 하기
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int star;
		int i, k;

		System.out.printf("숫자를 여러 개 입력 : ");
		str = s.nextLine();

		i = 0;
		ch = str.charAt(i);

		while (true) {                    // '0'==>48~ '9' ==>57
			star = (int) ch - 48;

			for (k = 0; k < star; k++)
				System.out.printf("*");
			System.out.println("\n");

			if (++i >= str.length()) // -1을 처리해서 연산식을 완성해도 된다.
										// i의 역활은 문자가 저장되어 있는 위치 length 의 역활은 문자의 갯수
				break;
			ch = str.charAt(i); // a++전위 연산자인지 a-- 후위연산자인지 구분 하자.

		}
		s.close();
	}

}
