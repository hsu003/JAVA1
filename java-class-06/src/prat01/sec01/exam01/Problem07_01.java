package prat01.sec01.exam01;

import java.util.Scanner;

public class Problem07_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b,d=0;
		int c;
		
		int i;
	
		
		System.out.printf("�հ��� ���� �� ==> ");
		a=s.nextInt();
		System.out.printf("�հ��� ���� ==> ");
		b=s.nextInt();
		System.out.printf("��� ==> ");
		c=s.nextInt();
		
		i=a;
		while(i <= b) {
		
		if(i % c == 0) 
			
			d=d+i;
			i++;
		
		}
		
	System.out.printf("%d���� %d������ %d����� �հ� ==> %d \n",a,b,c,d);
	
	s.close();
	}

}
