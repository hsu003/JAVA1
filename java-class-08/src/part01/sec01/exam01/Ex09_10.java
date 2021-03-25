package part01.sec01.exam01;   //단순 스위치 사용 커피 만들기

import java.util.Scanner;

public class Ex09_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int coffee;
		
		System.out.print("어떤 커피 드릴까요? (1:보통, 2:설탈, 3:블랙)");
		coffee= s.nextInt();
		
		System.out.println("\n#1. 뜨거운 물을 준비한다.");
		System.out.println("#2. 종이컵을 준비한다.");
		
		
		switch(coffee) {
		case 1:
			System.out.println("#3. 보통커피를 탄다.");
			break;
		case 2:
			System.out.println("#3. 설탕커피를 탄다.");
			break;
		case 3:
			System.out.println("#3. 블랙커피를 탄다.");
			break;
		default:
			System.out.println("#3. 아무거나 탄다.");
			break;
			
		}
		
		System.out.println("#4. 물을 붓는다.");
		System.out.println("#5. 스푼으로 저어서 녹인다.\n");
		
		System.out.println("손님 ~~~ 커피 여기 있습니다.");
		
		s.close();	

	}

}
