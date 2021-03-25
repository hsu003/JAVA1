package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("점수를 입력하세요:");
		a=s.nextInt();
		
		if(a>=90) 
			System.out.println("A");
		
		else 
			if(a>=80) 
				System.out.print("B");
			
			else 
					if(a>=70) 
						System.out.println("C");
					
					else 
						if(a>=60) 
							System.out.println("D");
						
						else 
							System.out.println("F");
		
						
					
				
		System.out.println("학점 입니다.");	
		
		s.close();
		

	}

		}


