package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a;
		
		System.out.print("1 ~ 4 중에 선택하세요 :");
		a = s.nextInt();
		
		switch(a) {       //표준 스위치 캐이스문  ()안에는 내가 선택한 값 지정
		case 1:           //케이스 옆에는 내가 선택하고자 하는 값을 지정 ex: 1은1
			System.out.println("1을 선택했다.");
			break;          //해당 문이 끝나면 브래이크를 걸어서 밑에 실행파일을 실행하지 않게 한다.
		case 2:
			System.out.println("2을 선택했다.");
			break;
		case 3:
			System.out.println("3을 선택했다.");
			break;
		case 4:
			System.out.println("4을 선택했다.");
			break;
		default :
			System.out.println("이상한 걸 선택했다.");
		}
		s.close();

	}

}
