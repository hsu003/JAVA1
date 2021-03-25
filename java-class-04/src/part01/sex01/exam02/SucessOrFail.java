package part01.sex01.exam02;

import java.util.Scanner;

public class SucessOrFail {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("점수를 입력하시오 : ");
		a=s.nextInt();
		
		if(a>=80) {              //
			System.out.printf("축하합니다! 합격입니다.\n");
		}
		
		if(a<80) {
			System.out.printf("불합격입니다.\n");
		}
		
		s.close();

	}

}
