package day03;

import java.util.*;
import java.io.*;

public class Exam_05 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//2개의 수와 1개의 산술연산자를 입력받아 
		//그 결과를 알려주는 프로그램
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 수를 입력 : ");
		int su1 = in.nextInt();
		System.out.print("두번째 수를 입력 : ");
		int su2 = in.nextInt();
		System.out.print("산술연산자를 입력 : ");
		char op = (char)System.in.read();
		int result = 0;
		switch(op) {
		case '+' : result = su1 + su2; break;
		case '-' : result = su1 - su2; break;
		case '*' : result = su1 * su2; break; 
		case '/' : result = su1 / su2; break;
		case '%' : result = su1 % su2; break;
		default : System.out.println("산술연산자만 입력 가능합니다.!!");
				  System.exit(0);
		}
		
		System.out.printf("%d %c %d = %d\n", su1, op, su2, result);
	}
}









