package part01.sex01.exam02;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("수를 입력하시오 : ");
		a = s.nextInt();
		
		if(a%3==0) {                  //a값/3을 했을때 나머지가 0이면 3의 배수 값처리
			System.out.printf("3의 배수입니다.");
		}
		
		else{
			System.out.printf("3의 배수가 아닙니다.");
		}
		
		s.close();

	}

}
