package part01.sex01.exam02;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		char gender = ' '; // 문자는 공백이 필요하다
		String regNo = ""; // 문자열 처리하는 기능 문자열은 공백을줘도 무관하다

		System.out.print("당신의 주민번호를 입력하세요. (011231-1222222)>");

		Scanner s = new Scanner(System.in);
		regNo = s.nextLine(); // 문자 여러개 받을때 라인을 사용

		gender = regNo.charAt(7);    // charAt 는 내가 지정한 숫자의 값을 구해 주는것
		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.printf("유효하지 않은 주민등록번호입니다.");
		}

		s.close();

	}

}
