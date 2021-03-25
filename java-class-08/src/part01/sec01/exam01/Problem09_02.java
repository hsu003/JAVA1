package part01.sec01.exam01; //소문자 입력한 값을 대문자로 변환 시키는 방법

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
		 * System.out.println("ch+diff="+(ch2+32));  문자와 문자타입이지만 내부적으로 정수 계산으로 처리 한다.
		 */
		System.out.print("문자열을 입력하세요 : ");
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

		System.out.printf("변환된 문자열==> %s \n", out);

		s.close();
	}
}
