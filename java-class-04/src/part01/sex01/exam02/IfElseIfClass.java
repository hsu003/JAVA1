package part01.sex01.exam02;

import java.util.Scanner;

public class IfElseIfClass {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int a,b;
		
		
		System.out.printf("ù��° ��ȣ�� �Է��ϼ��� : ");
		a = s.nextInt();
		
		System.out.printf("�ι�° ��ȣ�� �Է��ϼ��� : ");
		b = s.nextInt();
		
		if(a>b) {
			System.out.println("ù��° �Է��Ͻ� ���� �� ū�� �Դϴ�.");
		}
		else {
			if(a<b) {
				System.out.println("�ι�° �Է��Ͻ� ���� �� ū�� �Դϴ�.");
			}
			
			else {
		        if(a==b) {
			System.out.println("�������� �Է� �ϼ̽��ϴ�.");
		}
		 
		}

	}
		
		s.close();	
		

  }
	
}
