package day03;

import java.util.*;
import java.io.*;

public class Exam_05 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//2���� ���� 1���� ��������ڸ� �Է¹޾� 
		//�� ����� �˷��ִ� ���α׷�
		Scanner in = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int su1 = in.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int su2 = in.nextInt();
		System.out.print("��������ڸ� �Է� : ");
		char op = (char)System.in.read();
		int result = 0;
		switch(op) {
		case '+' : result = su1 + su2; break;
		case '-' : result = su1 - su2; break;
		case '*' : result = su1 * su2; break; 
		case '/' : result = su1 / su2; break;
		case '%' : result = su1 % su2; break;
		default : System.out.println("��������ڸ� �Է� �����մϴ�.!!");
				  System.exit(0);
		}
		
		System.out.printf("%d %c %d = %d\n", su1, op, su2, result);
	}
}









