package part01.sex01.exam02;

import java.util.Scanner;

public class SwitchGrading2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//char a;
		
		int score=s.nextInt();
		
		switch(score /10){
		case 10:   	
		case 9:     
            //a='A';
			System.out.println("A 학점 입니다.");
			break;
		case 8:
			//a='B';
			System.out.println("B 학점 입니다.");
			break;
		case 7:
			//a='C';
			System.out.println("C 학점 입니다.");
			break;
		case 6 :
			//a='D';
			System.out.println("D 학점 입니다.");
			break;
		//case 5:
			//a='F';
		default :
			//a='F';
			System.out.println("F 학점 입니다.");
		}
		//System.out.println("학점은" + a +"입니다".);	
		
		/*char a=(char)s.nextInt();
		
		switch(a){  	
		case A:   
			System.out.println("90 ~ 100 점 입니다.");
			break;
		case B:
			System.out.println("80 ~ 89 점 입니다.");
			break;
		case C:
			System.out.println("70 ~ 79점 입니다.");
			break;
		case D :
			System.out.println("60 ~ 69점 입니다.");
			break;
		default :
			System.out.println("1 ~ 59 점 입니다.");*/
		s.close();
	
	}

		
	}


