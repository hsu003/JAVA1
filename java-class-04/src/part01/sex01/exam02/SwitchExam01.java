package part01.sex01.exam02;

import java.io.IOException;
import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		//int a = 0;      �ѹ��� ��� �ҷ��� ������ �Ѱ� �� �ʿ� �ϴ�

		System.out.print("ù��° ���� �Է� :");
		int su1 = s.nextInt();
		System.out.print("�ι�° ���� �Է� :");
		int su2 = s.nextInt();
		System.out.print("�꽽 �����ڸ� �Է�");
		char su3 = (char) System.in.read();

		switch (su3) {      //byte,short, char, int,String �� �����ϴ�
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
	    	System.out.printf("��������ڸ� ����� �� �� �ֽ��ϴ�.");
		}
		//System.out.printf("%d %c %d =%d", su1, su3, su2, a);
		s.close();
	}
}
