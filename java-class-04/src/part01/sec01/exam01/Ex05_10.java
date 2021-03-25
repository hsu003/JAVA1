package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;

		System.out.printf("출생연도를 입력하세요 :");
		year = s.nextInt();

		switch (year %12) { //  수식을 계산 해줘야 한다.(연산식이 와도 무방 =연산식의 값은 정수 여야 한다.)
		case 0:      //캐이스는 정수로 와야 한다.
			System.out.printf("원숭이 띠");
			break;
		case 1:
			System.out.printf("닭 띠");
			break;
		case 2:
			System.out.printf("개 띠");
			break;
		case 3:
			System.out.printf("돼지 띠");
			break;
		case 4:
			System.out.printf("쥐 띠");
			break;
		case 5:
			System.out.printf("소 띠");
			break;
		case 6:
			System.out.printf("호랑이 띠");
			break;
		case 7:
			System.out.printf("토끼 띠");
			break;
		case 8:
			System.out.printf("용 띠");
			break;
		case 9:
			System.out.printf("뱀 띠");
			break;
		case 10:
			System.out.printf("말 띠");
			break;
		case 11:
			System.out.printf("양 띠");
			break;   //브래이크는 필요의 따라 없어도 된다.

		}

		s.close();

	}

}
