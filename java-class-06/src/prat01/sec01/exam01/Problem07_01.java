package prat01.sec01.exam01;

import java.util.Scanner;

public class Problem07_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b,d=0;
		int c;
		
		int i;
	
		
		System.out.printf("합계의 시작 값 ==> ");
		a=s.nextInt();
		System.out.printf("합계의 끝값 ==> ");
		b=s.nextInt();
		System.out.printf("배수 ==> ");
		c=s.nextInt();
		
		i=a;
		while(i <= b) {
		
		if(i % c == 0) 
			
			d=d+i;
			i++;
		
		}
		
	System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d \n",a,b,c,d);
	
	s.close();
	}

}
