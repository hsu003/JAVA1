package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_14 {

	public static int calc(int a, int b, int oper) {
		
		int c;
		
		switch (oper) {    
		case 1:
			c= a+b;
			break;
		case 2:
			c= a-b;
			break;
		case 3:
			c= a*b;
			break;
		case  4:
			c= a/b;
			break;
		default:
			c=0;
		}
		return c;
		
		/*int sum;
		 * if (oper == 1) { System.out.printf("%d + %d = sum", a, b, a + b); } 
		 * else if(oper == 2) { System.out.printf("%d - %d = sum", a, b, a - b); } 
		 * else if(oper == 3) { System.out.printf("%d * %d = sum", a, b, a * b); } 
		 * else if(oper == 4) { System.out.printf("%d / %d = sum", a, b, a / b); } 
		 * return sum;
		 */
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res;
		int oper, a, b;

		System.out.printf("계산 입력(1 : +, 2 : -, 3 : *, 4 : /)");
		oper = s.nextInt();

		System.out.printf("첫번째 숫자를 입력 : ");
		a = s.nextInt();
		System.out.printf("두번째 숫자를 입력 : ");
		b = s.nextInt();

		res = calc(a, b, oper);

		System.out.printf("계산 결과 는 : %d \n", res);
		s.close();

	}

}
