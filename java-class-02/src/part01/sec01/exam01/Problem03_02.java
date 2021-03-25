package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int type=0,data=0;
		String str;
		
		
		System.out.printf("입력진수 결정 <1>10 <2>16 <3>8 :"); 
		type = s.nextInt();    //Scanner>>메소드  next() 함수 기능
			
		System.out.printf("값 입력 : ");
		if(type==1) {
			str = s.next();
			data = Integer.parseInt(str,10);  // Integer.parseInt 입력된 값을 10진수로 바까라.
		}
		
		if(type==2) {
			str = s.next();
			data = Integer.parseInt(str,16);  // Integer.parseInt 입력된 값을 10진수로 바까라.
		}
		
		if(type==3) {
			str = s.next();
			data = Integer.parseInt(str,8);  // Integer.parseInt 입력된 값을 8진수로 바까라.
		}
		
		
		
	
		System.out.printf("10진수 ==>%d\n", data);
		System.out.printf("16진수 ==>%X\n", data);
		System.out.printf("8진수 ==>%o\n", data);
		
		
		s.close();

	}

}
