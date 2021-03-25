package part01.sex01.exam02;

import java.util.Scanner;

public class ThreeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1,b2,c3;
		//int e;     //어떤 숫자가 들어갈지 모르니 a에 가장 큰 숫자를 넣겠다라는 과정으로 시작
		
		System.out.printf("첫번째 정수를 입력하세요: ");
		a1=s.nextInt();
		System.out.printf("두번째 정수를 입력하세요: ");
		b2=s.nextInt();
		System.out.printf("세번째 정수를 입력하세요: ");
		c3=s.nextInt();
		
		                                //30     50     20 이라고 과정하면
		                                // 제일 큰수를 a1에 넣기
		if(b2>a1 && b2>=c3) {      //b는 a와c보다 크다
	      int  e=a1;                  // {안에서 선언한 변수는 {}안에서만 사용 가능하다
	        a1=b2;                  //한개의 값을 확정시켜서 과정을 시작한다
	        b2=e;
		}		
		else if(c3>a1 && c3>=b2) {
			int e=a1;
			a1=c3;
			c3=e;	
		}
		else if(c3>b2) {            //두번째 큰수를 b2에 넣기
			int e=b2;
			    b2=c3;
			    c3=e;
		
			
		}
		System.out.printf("%d >= %d >= %d\n",a1,b2,c3);
			
		s.close();
		

	}

}
