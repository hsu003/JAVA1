package part01.sex01.exam02;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		
		System.out.printf("첫번째 점수: ");
		a=s.nextInt();
		System.out.printf("두번째 점수 :");
		b=s.nextInt();
		
		
		if(a<b)  {   //큰수에서 작은수로 출력이 되어야 할땐 임시 변수 n개를만들고 임의 저장한후에 출력해야 한다.
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
