package part01.sec01.exam01;

public class Ex04_07 {

	public static void main(String[] args) {
		int num1=100,num2=-200;
		
		boolean a=(num1 !=0);
		boolean b=(num2 !=0);
		
		System.out.println("상수의 AND 연산 : "+(a&&b));
		System.out.printf("상수의 OR 연산 : %s\n", a||b);
		System.out.printf("상수의 NOT 연산 : %s\n",!a);
		
		System.out.println(67+12.8);
		System.out.println((char)'c'+3);
		System.out.println(10/3);
		System.out.println(10.0/3);
		/*
		 * //2.a)a는b보다 크거나 같다 a>=b b)a는b보다 작고 c보다 크다 c<a<b c)a더하기는 3은 10과 같지 않다 d)a는
		 * 10보다 크거나 b와 같다
		 */

	}

}
