package prat01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		Scanner s =new Scanner(System.in);
		int a, b;
		char c;
		
		while(true) {
			System.out.print("����� ù ��° �� �Է� :");
			a=s.nextInt();
			System.out.print("��� �� ��° �� �Է� :");
			b=s.nextInt();
			System.out.printf("����� �����ڸ� �Է��ϼ��� :");
			c =(char) System.in.read();
			
			
			switch(c) {
			case'+':
			  System.out.printf("%d + %d = %d \n",a,b,a+b);
			 			case '-':
			  System.out.printf("%d - %d = %d \n",a,b,a-b);
			  break;
			case '*':
			  System.out.printf("%d * %d = %d \n",a,b,a*b);
			  break;
			case '/':
			  System.out.printf("%d / %d = %d \n",a,b,a/(float)b);
			 case '%':
			  System.out.printf("%d % %d = %d \n",a,b,a%b);
			 default:
			}
			System.out.printf("�߸��� ������ �Է� �ϼ̽��ϴ�. \n",a,b,a%b);
		s.close();
		}
			
	}
		


	}


