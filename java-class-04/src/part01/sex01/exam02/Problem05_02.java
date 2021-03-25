package part01.sex01.exam02;

import java.util.Scanner;

public class Problem05_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;
		String[] str; // 들어가있는것은 전부 문자 이다.   배열은 반드시 []를 친다.

		System.out.printf(" 수식을 한줄로 띄어쓰기로 입력하세요 : ");
		str = s.nextLine().split(" ");  //" ",# 공백이 또는 다른것을 넣어도  데이터 구분   

		a = Integer.parseInt(str[0]); // str 0번째 문자를 가져와서 읽어라    문자를 숫자로 읽어라 할때 쓰는 명령어
		ch = str[1].charAt(0); // charAt(0)을 넣으면 첫번째 연산자만 입력된다. str 입련된 순서 0.1.2.3.4.5.6.7.8.9
		b = Integer.parseInt(str[2]); // str 2번째 문자를 가져와서 읽어라 str 읽어드리는 순서 1.2.3.4.5.6.7.8.9.0

		switch (ch) { // byte,short, char, int,String 만 가능하다
		case '+':
			System.out.printf("%d %c %d= %d 입니다.\n", a, ch, b, a + b);
			break;
		case '-':
			System.out.printf("%d %c %d= %d 입니다.\n", a, ch, b, a - b);

			break;
		case '*':
			System.out.printf("%d %c %d= %d 입니다.\n", a, ch, b, a * b);

			break;
		case '/':
			System.out.printf("%d %c %d= %2.1f 입니다.\n", a, ch, b, a / (float) b);

			break;
		case '%':
			System.out.printf("%d %c %d= %d 입니다.\n", a, ch, b, a % b);

			break;
		default:
			System.out.printf("연산자를 잘못 입력 하셨습니다.\n");
		}

		s.close();
	}

}
