package prat01.sec01.exam01;    //임의값3개을 입력받아 증가값 구하는식

import java.util.Scanner;

public class Ex06_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int d=0;
	    int i;
		int a,b,c;
		
		System.out.printf("시작값 입력 :\n");
		a=s.nextInt();
		System.out.println("끝값 입력 : \n");
		b=s.nextInt();
		System.out.println("증가값 입력\n");
		c=s.nextInt();
		
		for(i = a; i <= b; i = i+ c) {       //c값은 대입연산자로 인해 i값에 대입을 해주면서 무한 루프가 생긴다.
			d=d+i;                        // 따라서 무한 루프를 없앨려면 c값에 논리연산자를 대입 해줘야 한다.
		}

		System.out.printf("%d에서 %d까지 %d씩 증가한 값 : %d \n",a,b,c,d);
		
		s.close();
	}

}


