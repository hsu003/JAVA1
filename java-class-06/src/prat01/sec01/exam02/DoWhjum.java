package prat01.sec01.exam02;

import java.util.Scanner;

public class DoWhjum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int kor = 0;
		do {
			System.out.print("국어 점수를 입력 : ");
			kor = s.nextInt();
		}while(!(kor < 0 || kor > 100));			
		
		System.out.println("입력하신 국어 점수는 "+ kor+ "점 입니다.");
	       s.close();
		}
				
	}


