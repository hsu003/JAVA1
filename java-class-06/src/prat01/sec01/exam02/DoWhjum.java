package prat01.sec01.exam02;

import java.util.Scanner;

public class DoWhjum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int kor = 0;
		do {
			System.out.print("���� ������ �Է� : ");
			kor = s.nextInt();
		}while(!(kor < 0 || kor > 100));			
		
		System.out.println("�Է��Ͻ� ���� ������ "+ kor+ "�� �Դϴ�.");
	       s.close();
		}
				
	}


