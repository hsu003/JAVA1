package part01.sex01.exam02;

import java.util.Scanner;

public class LogModCakss {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a;     //3��5�� ��� �� ���ϴ¹��� = �ּ� ����� ���Ͽ��� ��� Ǯ��
	               
		
		System.out.printf("ù��° ���ڸ��Է� �ϼ��� : ");
		a = s.nextInt();
		
		if(a%15==0)     //(a %3 ==0 && %5 ==0)    �� ������ ��ȣ
			System.out.printf("�Է��Ͻ� ���� 3��5�� ��� �Դϴ�.");
			else if(a%3==0) 
				System.out.printf("�Է��Ͻ� ���� 3�� ����Դϴ�.");
				
		    else if(a%5==0) 
				System.out.printf("�Է��Ͻ� ���� 5�� ����Դϴ�.");
			else if(a!=15) 
				System.out.printf("�Է��Ͻ� ���� 3�� 5�� ����� �ƴմϴ�.");
							
						
						
					
				
			
		
	s.close();	
	}

}
