package prat01.sec01.exam02;

import java.io.IOException;
import java.io.InputStreamReader;

public class Problem06_05 {

	public static void main(String[] args) {
		InputStreamReader s = new InputStreamReader(System.in);
		char lowerBoind;

		System.out.print("알파벳 한 문자를 입력하세요 :");
		char c = 0;

		try {
			c = (char) s.read(); // 문자 하나를 읽어서 문자로 캐스팅 하여

		} catch (IOException e) { // 캐치 하여 IOException 으로 처리 해라
			System.out.println("키보드 입력 중 오류가 발생했습니다. ");
		}

		if ((c < 'a' || c > 'z') && (c < 'C' || c > 'Z')) {
			System.out.println("알파벳 문제가 아닙니다. ");
		}
		if (c >= 'a' && c <= 'z')
			lowerBoind = 'a';
		else {
			lowerBoind = 'A';
		}
		
		for (char i = c; i >= lowerBoind; i--) {
			for (char b = lowerBoind; b <= i; b++) {
				System.out.print(b);     //출력값은 마지막 변수를 지정 해야 내가 원하고자 하는 값이 나온다.

			}
			System.out.println();

		}

	}
}
