package prat01.sec01.exam01;     //���� �ݺ� �Ǵ� ���� �����  Ʈ�� �̿��ϴ� ���

import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a, b;
		
		while(true) {
			System.out.print("���� ù ��° �� �Է� :");
			a=s.nextInt();
			System.out.print("���� �� ��° �� �Է� :");
			b=s.nextInt();
			
			System.out.printf("%d + %d = %d \n",a,b,a+b);
		s.close();
		}

	}

}
