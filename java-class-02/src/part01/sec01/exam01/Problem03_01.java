package part01.sec01.exam01;

import java.util.Scanner;

public class Problem03_01 {

	public static void main(String[] args) {
		int a;
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� ==>");
		a = s.nextInt();       //String   ==> ���ڿ���ó�� �ϴ� ���
		
		System.out.printf("10���� ==>%d\n", a);
		System.out.printf("16���� ==>%X\n", a);
		System.out.printf("8���� ==>%o\n", a);
		
		s.close();

	}

}
