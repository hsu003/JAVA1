package prat01.sec01.exam02;    //������ ���� �޾� for������ ���ڰ� �ԷµǸ� ���� ���ڿ� �̸��� ����

import java.util.Scanner;

public class PersonLength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		int a;
		
		System.out.printf("�ο����� �Է� : ");
		
		a = s.nextInt();
		
		String[] aa = new String[a];
		
		for(i = 0 ; i < aa.length ; i++) {
			
			System.out.print(i + 1 + "�� ° �̸� :");     
			aa[i]=s.next();      
			
		}
		
		for(i = 0 ; i < aa.length ; i++) {
			System.out.println(i+1+"�� ° �̸��� "+aa[i]+"�� �Դϴ�.");
		}
		
		s.close();
		
		
		
		
	}

}
