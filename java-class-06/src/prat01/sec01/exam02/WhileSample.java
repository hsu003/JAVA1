package prat01.sec01.exam02;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=0,b=0 ;
		
		double c=0;
		
		a=s.nextInt();
		
		
		while((a=s.nextInt()) != 0) {
			
			c=c+a;     //������ ��� ���� �Ѵ�.
			b++;			
            	

		
		}
		System.out.println("�Էµ� ���� ������" + b + "���̸� �����"+ c/b +"�Դϴ�.");
		
		s.close();
}
}