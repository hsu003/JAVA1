package part01.sec01.exam01;               //메소드를 이용하여 자판기 메소드 만들기

import java.util.Scanner;

public class Ex09_11 {
	
	//메소드는 항상 ()가 존재 한다.             (반환타입,메서드명,괄호())
	public static int coffee_machine(int button) {               //마지막은 매개 변수가 와야 한다.(외부로부터 값을 전달 받는다.),옵션
		System.out.println("\n#1.(자동으로)뜨거운 물을 준비한다.");
		System.out.println("#2. (자동으로) 종이컵을 준비한다.");
		
		switch(button) {
		case 1:
			System.out.println("#3. (자동으로)보통커피를 탄다.");
			break;
		case 2:
			System.out.println("#3. (자동으로)설탕커피를 탄다.");
			break;
		case 3:
			System.out.println("#3. (자동으로)블랙커피를 탄다.");
			break;
		default:
			System.out.println("#3. (자동으로)아무거나 탄다.");
			break;
		}
		System.out.println("#4. 물을 붓는다.");
		System.out.println("#5. 스푼으로 저어서 녹인다.\n");
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int coffee,coffee1;
		int ret;
		
		System.out.println("어떤 커피 드릴까요 ? (1:보통, 2:설탕, 3:블랙)");
		coffee = s.nextInt();
		
		ret =coffee_machine(coffee);
		System.out.println("손님 ~~ 커피 여기 있습니다.");
		
		System.out.println("어떤 커피 드릴까요 ? (1:보통, 2:설탕, 3:블랙)");
		coffee1 = s.nextInt();
		
		ret =coffee_machine(coffee1);
		System.out.println("손님 ~~ 커피 여기 있습니다.");
		//System.out.println("ret="+ret);     //리턴값 보는거 .
		
		s.close();

	}

}
