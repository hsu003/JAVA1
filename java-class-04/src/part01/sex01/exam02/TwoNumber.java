package part01.sex01.exam02;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		
		System.out.printf("ù��° ����: ");
		a=s.nextInt();
		System.out.printf("�ι�° ���� :");
		b=s.nextInt();
		
		
		if(a<b)  {   //ū������ �������� ����� �Ǿ�� �Ҷ� �ӽ� ���� n��������� ���� �������Ŀ� ����ؾ� �Ѵ�.
			c=b;
		    b=a;
		    a=c;
			
			System.out.printf(a+"," +b);
		}
		else { 
				System.out.printf(a+","+b);}
		
		
		s.close();	
	}

}
