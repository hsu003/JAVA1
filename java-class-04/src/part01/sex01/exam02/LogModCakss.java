package part01.sex01.exam02;

import java.util.Scanner;

public class LogModCakss {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;     //3과5의 배수 를 구하는법은 = 최소 공배수 구하여서 산술 풀이
	               
		
		System.out.printf("첫번째 숫자를입력 하세요 : ");
		a = s.nextInt();
		
		if(a%15==0)     //(a %3 ==0 && %5 ==0)    논리 연산자 기호
			System.out.printf("입력하신 수는 3과5의 배수 입니다.");
			else if(a%3==0) 
				System.out.printf("입력하신 수는 3의 배수입니다.");
				
		    else if(a%5==0) 
				System.out.printf("입력하신 수는 5의 배수입니다.");
			else if(a!=15) 
				System.out.printf("입력하신 수는 3과 5의 배수가 아닙니다.");
							
						
						
					
				
			
		
	s.close();	
	}

}
