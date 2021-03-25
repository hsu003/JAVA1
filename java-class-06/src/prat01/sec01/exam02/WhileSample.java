package prat01.sec01.exam02;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a=0,b=0 ;
		
		double c=0;
		
		a=s.nextInt();
		
		
		while((a=s.nextInt()) != 0) {
			
			c=c+a;     //갯수가 들어 가야 한다.
			b++;			
            	

		
		}
		System.out.println("입력된 수의 개수는" + b + "개이며 평균은"+ c/b +"입니다.");
		
		s.close();
}
}