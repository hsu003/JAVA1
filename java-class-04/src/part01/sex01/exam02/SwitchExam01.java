package part01.sex01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		//int a = 0;      한번에 출력 할려면 변수가 한개 더 필요 하다

		System.out.print("첫번째 수를 입력 :");
		int su1 = s.nextInt();
		System.out.print("두번째 수를 입력 :");
		int su2 = s.nextInt();
		System.out.print("산슬 연산자를 입력");
		char su3 = (char) System.in.read();

		switch (su3) {      //byte,short, char, int,String 만 가능하다
		case '+':
			System.out.printf("%d %c %d= %d\n",su1,su3,su2,su1+su2);
			//a = su1 + su2;
			break;
		case '-':
			System.out.printf("%d %c %d= %d\n",su1,su3,su2,su1-su2);
			//a = su1 - su2;
			break;
		case '*':
			System.out.printf("%d %c %d= %d\n",su1,su3,su2,su1*su2);
			//a = su1 * su2;
			break;
		case  '/':
			System.out.printf("%d %c %d= %d\n",su1,su3,su2,su1/su2);
			//a = su1 / su2;
			break;
		case  '%':
			System.out.printf("%d %c %d= %d\n",su1,su3,su2,su1%su2);
			//a = su1 % su2;
			break;
	    default:
	    	System.out.printf("산술연산자만 계산을 할 수 있습니다.");
		}
		//System.out.printf("%d %c %d =%d", su1, su3, su2, a);
		s.close();
	}
}
