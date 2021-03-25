package part01.sex01.exam02;

import java.util.Scanner;

public class IfElseIfClass {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int a,b;
		
		
		System.out.printf("첫번째 번호를 입력하세요 : ");
		a = s.nextInt();
		
		System.out.printf("두번째 번호를 입력하세요 : ");
		b = s.nextInt();
		
		if(a>b) {
			System.out.println("첫번째 입력하신 수가 더 큰수 입니다.");
		}
		else {
			if(a<b) {
				System.out.println("두번째 입력하신 수가 더 큰수 입니다.");
			}
			
			else {
		        if(a==b) {
			System.out.println("같은수를 입력 하셨습니다.");
		}
		 
		}

	}
		
		s.close();	
		

  }
	
}
