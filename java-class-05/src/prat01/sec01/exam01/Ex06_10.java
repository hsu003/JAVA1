package prat01.sec01.exam01;

import java.util.Scanner;

public class Ex06_10 {

	//1���� 100������ ���� ����,�� Ű����� ���� 100�� �Է� ����
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b=0;
		int i;
		int a;
		
		
		System.out.printf("���ڸ� �Է��ϼ���");
		a = s.nextInt();
		
		for(i=1 ; i <= a ;i++){
		b=b+i;
		}
		System.out.printf("1���� %d������ �� :%d \n",a,b);
		
		s.close();
		
	}

}
