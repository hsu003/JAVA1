package part01.sex01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class AsciCode {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		// System.in.read(); 문자 하나를 입력 받음 (아스키코드or유니코드)

		System.out.print("첫번째 아스키 코드  : ");
		char a1 = (char) System.in.read(); // 형식 변환을 위해선 변수에도 똑같이 적용을 시킨다.
		System.in.read(); // System.in.skip(2); 엔터키는 2byte 이므로 스킵 2로 사용 가능하다
		System.in.read(); // 해당 하는 리드는 엔터키의 리드
		System.out.print("두번째 아스키 코드 : ");
		char b1 = (char) System.in.read();
		//
		if (a1 > b1) {
			System.out.println("임의의 문자 한개를 입력해 주세요.");
		} else {
			if (a1 < b1) {
				System.out.println("임의의 문자 한개를 입력해 주세요.");
			}

			else { // 위의 if 두개가 아닐경우 아무 수식도 안써도 된다.
				System.out.printf("입력하신 두 문자는 같은 문자 입니다.\n");
				System.out.printf("입력하신 두 문자는 a1:%c b1:%c 입니다.\n", a1, b1);
				System.out.printf("입력하신 두 문자의 아스키 코드값은  a1:%d b1:%d 입니다.\n", (int) a1, (int) b1);
				// 정수의 값을 표현 할려면 읽어드린 정수를 변환 시켜야 한다.
			}

		}

		/*
		 * System.out.print("첫번째 아스키 코드 : "); char a = (char) System.in.read();
		 * 
		 * System.in.read();
		 * 
		 * System.out.print("두번째 아스키 코드 : "); char b = (char)System.in.read();
		 * 
		 * System.in.read(); char c; if((char)c=a>b)
		 * System.out.printf("첫번째 입력하신 문자의 아스키코드 값이 더 큽니다."+"%d > %d = %d\n",a1,b1,c);
		 * 
		 * else if((char)c=a<b)
		 * System.out.printf("두번째 입력하신 문자의 아스키코드 값이 더 큽니다."+"%d < %d = %d\n",a1,b1,c);
		 * 
		 * else if((char)c= a== b)
		 * System.out.printf("입력하신 두 문자는 같은 문자 입니다."+"%d = %d = %d\n",a1,b1,c);
		 * 
		 */

		s.close();
	}

}
