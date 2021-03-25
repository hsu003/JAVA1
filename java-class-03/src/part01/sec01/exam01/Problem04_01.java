package part01.sec01.exam01;

import java.util.Scanner;

public class Problem04_01 {

	public static void main(String[] args) {
		double a,b,c,d;
		
	
		Scanner s = new Scanner(System.in);
		
		System.out.printf("첫번째 계산할 값을 입력하세요 ==>");
		a = s.nextDouble();
		System.out.printf("두번째 계산살 값을 입력하세요 ==>");
		b = s.nextDouble();
		
		c = a + b;
		System.out.printf("%5.2f + %5.2f = %5.2f\n",a,b,c);
		c = a - b;
		System.out.printf("%5.2f - %5.2f = %5.2f\n",a,b,c);
		c = a * b;
		System.out.printf("%5.2f * %5.2f = %5.2f\n",a,b,c);
		c = a / b;
		System.out.printf("%5.2f / %5.2f = %5.2f\n",a,b,c);
		c = (int)a % (int)b;
		System.out.printf("%d %% %d \n",(int)a,(int)b,c);

	}

}
