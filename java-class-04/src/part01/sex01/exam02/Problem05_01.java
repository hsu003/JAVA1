package part01.sex01.exam02;

import java.util.Scanner;      //연산자가 중간에 들어 왔을때 쓰는 방식

public class Problem05_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);    //Scanner  문자열을 처리하는 클래스  String  처리하는 변수를 만들어야 사용이 가능하다
		int a, b;    //정수 4byet 를 메모리에 만들고 이름을 a로 해라
		char si;     //

		System.out.printf("첫번째 수를 입력하세요 :");
		a = s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요 :");
		si = s.next().charAt(0);     //읽어드리는 0번째 문자를 처리 하겠다.
		System.out.printf("두번째 수를 입력하세요 :");
		b = s.nextInt();
		if (si == '+') {
			System.out.printf("%d + %d =%d 입니다 \n", a, b, a + b);
		}
		if (si == '-') {
			System.out.printf("%d - %d =%d 입니다 \n", a, b, a - b);
		}
		if (si == '*') {
			System.out.printf("%d * %d = %d 입니다.\n", a, b, a * b);
		}
		if (si == '/') {
			System.out.printf("%d / %d = %2.1f 입니다.\n", a, b, a / (float) b);  //실수를 받아 드리기 위해 a or b 둘중 하나를 변환 시켜준다.
		}
		if (si == '%') {
			System.out.printf("%d %% %d = %d 입니다.\n", a, b, a % b);
		}
		s.close();
	}

}
