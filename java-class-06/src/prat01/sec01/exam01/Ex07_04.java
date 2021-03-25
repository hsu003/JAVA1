package prat01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		Scanner s =new Scanner(System.in);
		int a, b;
		char c;
		
		while(true) {
			System.out.print("계산할 첫 번째 수 입력 :");
			a=s.nextInt();
			System.out.print("계산 두 번째 수 입력 :");
			b=s.nextInt();
			System.out.printf("계산할 연산자를 입력하세요 :");
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
			System.out.printf("잘못된 정수를 입력 하셨습니다. \n",a,b,a%b);
		s.close();
		}
			
	}
		


	}


