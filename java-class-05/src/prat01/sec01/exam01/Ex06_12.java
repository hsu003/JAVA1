package prat01.sec01.exam01;      //������ ���

import java.util.Scanner;

public class Ex06_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		int b;
		
		System.out.print("�� �� ?");
		b = s.nextInt();
		
		for(i = 1 ; i <= 9; i++) {     //�ѹ� ���� �� ������ ���� ���ϳ��� ���� �ʿ�� ����.
			System.out.printf("%d X %d = %d\n",b,i,b*i);
		}
		
		s.close();

	}

}
