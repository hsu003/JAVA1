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
			System.out.println("A ���� �Դϴ�.");
			break;
		case 8:
			//a='B';
			System.out.println("B ���� �Դϴ�.");
			break;
		case 7:
			//a='C';
			System.out.println("C ���� �Դϴ�.");
			break;
		case 6 :
			//a='D';
			System.out.println("D ���� �Դϴ�.");
			break;
		//case 5:
			//a='F';
		default :
			//a='F';
			System.out.println("F ���� �Դϴ�.");
		}
		//System.out.println("������" + a +"�Դϴ�".);	
		
		/*char a=(char)s.nextInt();
		
		switch(a){  	
		case A:   
			System.out.println("90 ~ 100 �� �Դϴ�.");
			break;
		case B:
			System.out.println("80 ~ 89 �� �Դϴ�.");
			break;
		case C:
			System.out.println("70 ~ 79�� �Դϴ�.");
			break;
		case D :
			System.out.println("60 ~ 69�� �Դϴ�.");
			break;
		default :
			System.out.println("1 ~ 59 �� �Դϴ�.");*/
		s.close();
	
	}

		
	}


