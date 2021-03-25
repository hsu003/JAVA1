package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Problem02_03 {

	public static void main(String[] args) throws IOException {
		int a, b;
		int result;
		char i; // 문자변수

		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();
		System.out.println("+ - * / % ==> ");
		i = (char) System.in.read(); // 42==>'*'
		
		System.out.println("두번째 계산할 값을 입력하세요 ==>");
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
		if (i == '/') {   //==같다    !=같지않다
			if (b != 0) {
				result = a / b;
				System.out.println(a + "/" + b + "=" + result);
				
			}else
			System.out.println("0으로 나누면 안됩니다.");

		}
		if (i == '%') {   //나머지
			if (b != 0) {
				result = a % b;
				System.out.println(a + "%" + b + "=" + result);

			}else
			System.out.println("0으로 나누면 나머지 값이 안됩니다.");

		}

		s.close();
	}

}
