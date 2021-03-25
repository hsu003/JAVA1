package prat01.sec01.exam02;    //임의의 수를 받아 for문으로 숫자가 입력되면 같이 문자와 이름이 생성

import java.util.Scanner;

public class PersonLength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		int a;
		
		System.out.printf("인원수를 입력 : ");
		
		a = s.nextInt();
		
		String[] aa = new String[a];
		
		for(i = 0 ; i < aa.length ; i++) {
			
			System.out.print(i + 1 + "번 째 이름 :");     
			aa[i]=s.next();      
			
		}
		
		for(i = 0 ; i < aa.length ; i++) {
			System.out.println(i+1+"번 째 이름은 "+aa[i]+"님 입니다.");
		}
		
		s.close();
		
		
		
		
	}

}
