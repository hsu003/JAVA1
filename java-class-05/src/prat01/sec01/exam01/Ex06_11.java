package prat01.sec01.exam01;    //���ǰ�3���� �Է¹޾� ������ ���ϴ½�

import java.util.Scanner;

public class Ex06_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int d=0;
	    int i;
		int a,b,c;
		
		System.out.printf("���۰� �Է� :\n");
		a=s.nextInt();
		System.out.println("���� �Է� : \n");
		b=s.nextInt();
		System.out.println("������ �Է�\n");
		c=s.nextInt();
		
		for(i = a; i <= b; i = i+ c) {       //c���� ���Կ����ڷ� ���� i���� ������ ���ָ鼭 ���� ������ �����.
			d=d+i;                        // ���� ���� ������ ���ٷ��� c���� �������ڸ� ���� ����� �Ѵ�.
		}

		System.out.printf("%d���� %d���� %d�� ������ �� : %d \n",a,b,c,d);
		
		s.close();
	}

}


